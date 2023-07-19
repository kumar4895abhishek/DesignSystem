package models;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;


@Getter
@SuperBuilder
@Setter
public class Slot extends BaseModel 
{
	private Integer floorNumber;
	
	private VehicleType vehicleType;
	
	private SlotStatus slotStatus;
	
//	private Long Id;

	// Static initializer for object
	public static Slot mediumAvailable()
	{
		return Slot.builder()
				.vehicleType(VehicleType.MEDIUM)
				.slotStatus(SlotStatus.FREE)
				.build();
	}
}
