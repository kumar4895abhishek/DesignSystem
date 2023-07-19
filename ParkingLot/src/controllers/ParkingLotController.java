package controllers;

import javax.management.RuntimeErrorException;

import dtos.CreateParkingLotRequest;
import exceptions.InvalidParkingLotRequest;
import lombok.AllArgsConstructor;
import models.ParkingLot;
import services.ParkingLotService;

@AllArgsConstructor
public class ParkingLotController
{
	// CRUD in Parking lot
	
	private ParkingLotService parkingLotService;
	
	public ParkingLot getParkingLot(Long id)
	{
		validateId(id);
		return parkingLotService.getParkingLot(id);
	}

	private static void validateId(Long id) {
		if(id==null)
		{
			//client err 400 status code bad request
			throw new InvalidParkingLotRequest();
		}
	}
	
	private ParkingLot createParkingLot(CreateParkingLotRequest request	)
	{
		validateRequest(request);
		
		return parkingLotService.createParkingLot(request.toParkingLot());
	}

	private void validateRequest(CreateParkingLotRequest request) {
		if(request.getNumberOfFloors() ==null || request.getNumberOfGatesPerFloor()==null)
		{
			throw new InvalidParkingLotRequest();
		}
	}

}
