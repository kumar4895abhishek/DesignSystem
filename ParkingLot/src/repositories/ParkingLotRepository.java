package repositories;
import models.ParkingLot;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ParkingLotRepository 
{
	private List<ParkingLot> parkingLots=new ArrayList<>();
	
	public ParkingLot findById(Long id)
	{
		
//		for(ParkingLot parkingLot:parkingLots)
//		{
//			if(Objects.equals(parkingLot.getId(),id))
//			{
//				return parkingLot;
//			}
//		}
		
		return parkingLots
				.stream()
				.filter(parkingLot -> parkingLot.getId()
				.equals(id))
				.findFirst()
				.orElse(null);
		
//		return null;
		
	}
	
	public ParkingLot save(ParkingLot parkingLot)
	{
		parkingLots.add(parkingLot);
		return parkingLot;
	}

}
