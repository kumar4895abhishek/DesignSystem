package models;

import java.util.ArrayList;
import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.lang.Integer;

@SuperBuilder
@Getter
@Setter
public class Floor extends BaseModel {
	
	private Integer floorNumber;
	
	private DisplayBoard displayBoard;
	
	//private Long Id;
	
	@Builder.Default
	private List<Slot> slots=new ArrayList<>();
	
	private PaymentCounter paymentCounter;

}
