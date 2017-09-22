package threads;

import static java.util.Calendar.*;
import java.util.Calendar;

public class Clock {

	class MyRunnable implements Runnable {

		public void run() {

			int i = 0;
			while (i++ < 60) {

				Calendar now = Calendar.getInstance();
				now.setTimeInMillis(System.currentTimeMillis());

				int h = now.get(HOUR);
				int m = now.get(MINUTE);
				int s = now.get(SECOND);

				System.out.println("Clock 1\t" + h + ":"
						+ (m < 10 ? "0" + m : m) + ":"
						+ (s < 10 ? "0" + s : s));

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}
		}
	}

	public void go() {

		Thread t = new Thread(new MyRunnable());
		t.start();
	}
}
