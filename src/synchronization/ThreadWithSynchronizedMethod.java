package synchronization;

public class ThreadWithSynchronizedMethod extends Thread
{
	private boolean alwaysIncrement;
	private CounterWithSynchronizedMethod cwsm;

	public ThreadWithSynchronizedMethod (CounterWithSynchronizedMethod cwsm, boolean alwaysIncrement)
	{
		this.alwaysIncrement = alwaysIncrement;
		this.cwsm = cwsm;
	}

	public void run ()
	{
		for (int i=0; i<10; i++)
		{
			cwsm.update (i, alwaysIncrement);

		}	// end for-loop ...

	}	// end run () ...	


}	// end class class ThreadWithSynchronizedMethod ...
