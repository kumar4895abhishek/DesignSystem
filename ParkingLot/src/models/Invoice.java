package models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class Invoice extends BaseModel
{
	
	private Ticket ticket;
	
	private LocalDateTime exitTime;
	
	private Double amount;
	
	List <Payment> payments=new ArrayList<>();

}
