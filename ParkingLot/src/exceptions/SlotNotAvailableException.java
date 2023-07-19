package exceptions;

public class SlotNotAvailableException extends RuntimeException {
	public SlotNotAvailableException()
	{
		super("SLOT NOT FOUND");
	}
}
