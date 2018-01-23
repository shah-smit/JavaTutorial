package synchronization;

public class ThreadWithSynchronizedObject extends Thread
{
	private boolean alwaysIncrement;
	private CounterNoSynchronize cns;

	public ThreadWithSynchronizedObject (CounterNoSynchronize cns, boolean alwaysIncrement)
	{
		this.alwaysIncrement = alwaysIncrement;
		this.cns = cns;
	}

	public void run ()
	{
		for (int i=0; i<10; i++)
		{

synchronized (cns)
{
			int value = cns.getValue ();

	System.out.println ("B4 updating, i : " + i + ", c : " + value + ", alwaysIncrement : " + alwaysIncrement);

// ---------------------------------------------

	long sleeptime = 200 + (int) (Math.random() * 1000);

	try
	{
		this.sleep (sleeptime);
	}
	catch (InterruptedException ie)
	{	}

// ---------------------------------------------

		if (alwaysIncrement)
			cns.setValue (++value);
		else
			cns.setValue (--value);

	System.out.println ("Aft updating, i : " + i + ", c : " + value + ", alwaysIncrement : " + alwaysIncrement);

}	// end synchronize (cns)


		}	// end for-loop ...

	}	// end run () ...	

}	// end class class ThreadWithSynchronizedObject ...
