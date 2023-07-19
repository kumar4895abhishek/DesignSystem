package repositories;

import java.util.ArrayList;
import java.util.List;

import models.Slot;
import models.SlotStatus;
import models.VehicleType;

public class SlotRepository
{
	
	private List<Slot> slots=new ArrayList<>();
	
	public void saveAll(List<Slot> slots)
	{
		
	}

	public Slot findOneByVehicleTypeAndStatusAvailable(VehicleType vehicleType) {
		// TODO Auto-generated method stub
		
		for(Slot slot: slots)
		{
			if(slot.getVehicleType()== vehicleType && slot.getSlotStatus()==SlotStatus.FREE)
			{
				return slot;
			}
		}
		return null;
	}

	public void save(Slot slot)
	{
		slots.add(slot);
		
	}

}
