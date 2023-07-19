package services;

import dtos.CreateTicketRequest;
import exceptions.SlotNotAvailableException;
import models.Ticket;
import repositories.TicketRepository;
import models.*;

public class TicketService
{
	
	private SlotService slotService;
	
	private VehicleService vehicleService;
	
	private TicketRepository ticketRepository;
	
	public Ticket createTicket(CreateTicketRequest request)
	{
		// Slot available check
		// if not available excep
		 
		Slot slot = slotService.allocateSlot(request.getVehicleType());
		
		if(slot==null)
		{
			throw new SlotNotAvailableException();
		}
		
		slot.setSlotStatus(SlotStatus.OCCUPIED);
		slotService.save(slot);
		
		Ticket ticket=Ticket.builder()
				.entrytime(request.getEntryTime())
				.slot(slot)
				.vehicle(vehicleService.findOrCreate(request.getVehicleNumber(), request.getVehicleType()))
				.build();
		
		
		return ticketRepository.save(ticket);
				
		
		//if available mark slot occupied and save
		//create ticket
	}

}
