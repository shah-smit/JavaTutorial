package synchronization;

public class ThreadWithSynchronizedMethodApp
{
	private static CounterWithSynchronizedMethod counterObj = new CounterWithSynchronizedMethod();


	public static void main (String args[])
	{
		Thread [] threadArray = new Thread [4];

		threadArray [0] = new ThreadWithSynchronizedMethod  (counterObj, true);

		threadArray [1] = new ThreadWithSynchronizedMethod  (counterObj, true);

		threadArray [2] = new ThreadWithSynchronizedMethod  (counterObj, false);

		threadArray [3] = new ThreadWithSynchronizedMethod  (counterObj, false);

		for (int i=0; i<threadArray.length; i++)
		{
/*
		long sleeptime = 200 + (int) (Math.random() * 1000);

		try
		{
			Thread.sleep (sleeptime);
		}
		catch (InterruptedException ie)
		{	}
*/
			threadArray [i].start ();

		
		}	// end for-loop

	}

}	// end class ThreadWithSynchronizedMethodApp ...
