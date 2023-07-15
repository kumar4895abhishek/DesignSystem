package models;

public class Payment extends BaseModel{
	
	private  PaymentType  type;
	
	private PaymentStatus status;
	
	private double amount;
	
	private Ticket ticket;

}
