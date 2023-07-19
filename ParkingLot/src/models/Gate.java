package models;

import java.util.Date;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Gate extends BaseModel {
	
	private Integer GateNumber;
	
	private GateType type;
	
	private Operator operator;
	
	private PaymentCounter paymentCounter;
	
	private DisplayBoard displayBoard;

}
