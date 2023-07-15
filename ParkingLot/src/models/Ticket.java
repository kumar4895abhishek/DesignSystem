package models;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Ticket extends BaseModel{

	
	private Vehicle vehicle;
	
	private LocalDateTime entrytime;
	
	private Slot slot;
}
