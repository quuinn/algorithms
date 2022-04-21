import java.util.Random;

import ch.qos.logback.core.net.SyslogOutputStream;

/**   
* @Title Metrics.java 
* @Package  
* @Description TODO 
* @author pigmilk
* @date Apr 21, 2022 10:26:15 AM 
* @version 1.0.0   
*/

/**
 * @ClassName Metrics
 * @Description TODO(這裡用一句話描述這個類的作用)
 * @author pigmilk
 * @date Apr 21, 2022 10:26:15 AM
 */
public class Metrics {
	private long count = 0;
	private volatile double average = 0.0;

	public void addSample(long sample) {
		double currentSum = average * count;
		count++;
		average = (currentSum + sample) / count;
	}

	public double getAverage() {
		return average;
	}
	public long getCount() {
		return this.count;
	}
	public static void main(String[] args) {
		Metrics m = new Metrics();
		Random r = new Random();
		Thread t1 = new Thread(() -> {

			while (true) {
				Long start = System.currentTimeMillis();
				try {
					Thread.sleep(r.nextInt(0, 50));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				Long end = System.currentTimeMillis();
				m.addSample(end - start);
			}
		});
		Thread t2 = new Thread(() -> {
			while (true) {

				try {
					Thread.sleep(1000);
					System.out.println(m.getAverage() + " " + m.getCount());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		t1.start();
		t2.start();

	}
}
