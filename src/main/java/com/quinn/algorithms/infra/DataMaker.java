/**   
* @Title DataMaker.java 
* @Package com.quinn.algorithms.infra 
* @Description TODO 
* @author Quinn
* @date Apr 21, 2022 3:39:03 PM 
* @version 1.0.0   
*/
package com.quinn.algorithms.infra;

import java.util.Random;

import com.quinn.algorithms.tool.Metrics;
import com.quinn.algorithms.tool.RandomFactory;

/**
 * @ClassName DataMaker
 * @Description TODO(這裡用一句話描述這個類的作用)
 * @author Quinn
 * @date Apr 21, 2022 3:39:03 PM
 */
public class DataMaker {
	private int[] data;
	private Random r;
	private int datasetSize = 5;
	private int minNum = -1000;
	private int maxNum = 999;

	/**
	 * @Title
	 * @Description
	 */
	public DataMaker() {
		this.init();
	}

	public void init() {
		data = new int[datasetSize];
		r = new Random();
		for (int i = 0; i < datasetSize; i++) {
			data[i] = r.nextInt(minNum, maxNum);
		}
	}

	public int[] getData() {
		return this.data;
	}
}
