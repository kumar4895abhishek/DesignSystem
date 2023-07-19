package dtos;

import java.util.Date;

import lombok.Getter;
import models.VehicleType;


@Getter
public class CreateTicketRequest
{
	private String vehicleNumber;
	
	private VehicleType vehicleType;
	
	private Date entryTime;
	
	

}
