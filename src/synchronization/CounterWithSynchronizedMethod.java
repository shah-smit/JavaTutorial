package synchronization;

public class CounterWithSynchronizedMethod
{
	private static int c;

	public CounterWithSynchronizedMethod ()
	{
		c = 0;
	}

	public static synchronized void update (int i, boolean isIncrement)
	{
		int value = c;

	System.out.println ("B4 updating, i : " + i + ", c : " + value + ", isIncrement : " + isIncrement);

// ---------------------------------------------

		long sleeptime = 200 + (int) (Math.random() * 1000);

		try
		{
			Thread.sleep (sleeptime);
		}
		catch (InterruptedException ie)
		{	}

// ---------------------------------------------

		if (isIncrement)
			c = ++value;
		else
			c = --value;

	System.out.println ("Aft updating, i : " + i + ", c : " + value + ", isIncrement : " + isIncrement);

	}	// end update () ...


}	// end class class CounterWithSynchronizedMethod ...
