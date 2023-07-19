package models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Ticket extends BaseModel{

	
	private Vehicle vehicle;
	
	private Date entrytime;
	
	private Slot slot;
}
