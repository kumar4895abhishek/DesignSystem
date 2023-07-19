package models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Invoice extends BaseModel
{
	
	private Ticket ticket;
	
	private LocalDateTime exitTime;
	
	private Double amount;
	
	List <Payment> payments=new ArrayList<>();

}
