package exceptions;

public class InvalidParkingLotRequest extends RuntimeException 
{
	public InvalidParkingLotRequest()
	{
		super("INVALID ID");
	}

}
