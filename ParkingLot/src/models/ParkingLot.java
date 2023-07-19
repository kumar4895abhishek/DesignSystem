package models;
import java.util.ArrayList;
import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.experimental.SuperBuilder;




@Getter
@SuperBuilder
public class ParkingLot  extends BaseModel
{
	// private BaseModel baseModel;
	
	private String name;
	
	private String address;
	
	private List<Floor> floors=new ArrayList<>();
	
	private List<Gate> entryGates=new ArrayList<>();
	
	private List<Gate> exitGates=new ArrayList<>();
	
	
	
	

}
