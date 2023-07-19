package services;

import lombok.AllArgsConstructor;
import models.Floor;
import models.ParkingLot;
import models.Slot;
import repositories.ParkingLotRepository;

@AllArgsConstructor
public class ParkingLotService
{
	
	private ParkingLotRepository parkingLotRepository;
	
	private SlotService slotService;
	
	public ParkingLot getParkingLot(Long id)
	{
		System.out.println(" ID FROM "+id);
		return parkingLotRepository.findById(id);
	}
	
	public ParkingLot createParkingLot(ParkingLot parkingLot)
	{
		//return parkingLotRepository.save(parkingLot);
		ParkingLot savedLot= parkingLotRepository.save(parkingLot);
		
		for(Floor  floor:parkingLot.getFloors())
		{
			slotService.createParkingSlots(floor.getSlots());
		}
		
		return savedLot;
	}

}
