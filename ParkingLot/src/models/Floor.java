package models;

import java.util.ArrayList;
import java.util.List;
import java.lang.Integer;

public class Floor extends BaseModel {
	
	private Integer floorNumber;
	
	private DisplayBoard displayBoard;
	
	private List<Slot> slots=new ArrayList<>();
	
	private PaymentCounter paymentCounter;

}
