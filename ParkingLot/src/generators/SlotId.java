package generators;

import java.util.concurrent.atomic.AtomicLong;

public class SlotId 
{
	// generate random  long for us
	
	private static AtomicLong idCounter=new AtomicLong();
	
	public static Long nextId()
	{
		return idCounter.getAndIncrement();
	}

}
