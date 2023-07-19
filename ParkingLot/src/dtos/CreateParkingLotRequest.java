package dtos;

import java.util.Collections;
import java.util.List;

import lombok.Getter;
import lombok.experimental.SuperBuilder;
import models.EntryGate;
import models.ExitGate;
import models.Floor;
import models.ParkingLot;
import models.PaymentCounter;
import models.Slot;

import generators.*;

@Getter
@SuperBuilder
public class CreateParkingLotRequest
{
	private Long id;
	
	private String name;
	
	private String address;
	
	private Integer numberOfFloors;
	
	private Integer numberOfSlotsPerFloor;
	
	private Integer numberOfGatesPerFloor;

	
	
	
	public ParkingLot toParkingLot()
	{
		List<Slot> parkingSpots = Collections.nCopies(numberOfSlotsPerFloor, Slot.mediumAvailable());
        parkingSpots.forEach(parkingSpot -> parkingSpot.setId(SlotId.nextId()));

        // Create dummy parking floors and update their ids
        List<Floor> parkingFloors = Collections.nCopies(numberOfFloors,
                Floor.builder()
                     .slots(parkingSpots)
                     .paymentCounter(PaymentCounter.builder().build())
                     .build());
        
        parkingFloors.forEach(parkingFloor -> parkingFloor.setId(FloorId.nextId()));

        return ParkingLot
                .builder()
                .id(id)
                .name(name)
                .address(address)
                .floors(parkingFloors)
                .entryGates(Collections.nCopies(numberOfFloors, EntryGate.builder().build()))
                .exitGates(Collections.nCopies(numberOfFloors, ExitGate.builder().build()))
                .build();
	}

}
