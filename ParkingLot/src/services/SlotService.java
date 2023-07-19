package services;

import java.util.List;

import models.Slot;
import models.VehicleType;
import repositories.SlotRepository;

public class SlotService 
{
	
	private SlotRepository  slotRepository;
	
	public void createParkingSlots(List<Slot> slots)
	{
		
	}

	public Slot allocateSlot(VehicleType vehicleType)
	{
		return slotRepository.findOneByVehicleTypeAndStatusAvailable(vehicleType);
	}

	public void save(Slot slot) {
		slotRepository.save(slot);
	}

}
