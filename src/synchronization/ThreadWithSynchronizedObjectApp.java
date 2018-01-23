package synchronization;

public class ThreadWithSynchronizedObjectApp
{
	private static CounterNoSynchronize counterObj = new CounterNoSynchronize();


	public static void main (String args[])
	{
		Thread [] threadArray = new Thread [4];

		threadArray [0] = new ThreadWithSynchronizedObject (counterObj, true);

		threadArray [1] = new ThreadWithSynchronizedObject (counterObj, true);

		threadArray [2] = new ThreadWithSynchronizedObject (counterObj, false);

		threadArray [3] = new ThreadWithSynchronizedObject (counterObj, false);

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

}	// end class ThreadWithSynchronizedObjectApp ...
