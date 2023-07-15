package models;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;




@Getter
public class ParkingLot  extends BaseModel
{
	// private BaseModel baseModel;
	
	private String name;
	
	private String address;
	
	private List<Floor> floors=new ArrayList<>();
	
	private List<Gate> entryGates=new ArrayList<>();
	
	private List<Floor> exitGates=new ArrayList<>();
	
	
	
	

}
