package models;

import java.util.Date;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Payment extends BaseModel{
	
	private  PaymentType  type;
	
	private PaymentStatus status;
	
	private double amount;
	
	private Ticket ticket;

}
