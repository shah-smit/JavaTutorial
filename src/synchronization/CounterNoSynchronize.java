package synchronization;

public class CounterNoSynchronize
{
	private int c;

	public CounterNoSynchronize  ()
	{
		c = 0;
	}

	public int getValue ()
	{
		return (c);
	}	

	public void setValue (int newValue)
	{
		c = newValue;
	}	

}	// end class class CounterNoSynchronize  ...
