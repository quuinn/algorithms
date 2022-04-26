package com.quinn.algorithms.tool;

import java.util.Random;

/**   
* @Title Metrics.java 
* @Package  
* @Description TODO 
* @author Quinn
* @date Apr 21, 2022 10:26:15 AM 
* @version 1.0.0   
*/

/**
 * @ClassName Metrics
 * @Description TODO(這裡用一句話描述這個類的作用)
 * @author Quinn
 * @date Apr 21, 2022 10:26:15 AM
 */
public class Metrics {
	private long start;
	private long end;
	private long count = 0;
	private volatile double average = 0.0;

	public void addSample(long sample) {
		double currentSum = average * count;
		count++;
		average = (currentSum + sample) / count;
	}

	public void logTime(int type) {
		if (type == 0) {
			this.setStart();
		} else {
			this.setEnd();
		}
	}

	public long getStart() {
		return start;
	}

	public void setStart() {
		this.start = System.currentTimeMillis();
	}

	public long getEnd() {
		return end;
	}

	public void setEnd() {
		this.end = System.currentTimeMillis();
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
