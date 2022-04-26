/**   
  * @Title InsertionSort.java 
* @Package com.quinn.algorithms.sort 
* @Description TODO 
* @author Quinn
* @date Apr 21, 2022 9:49:28 AM 
* @version 1.0.0   
*/
package com.quinn.algorithms.sort;

import com.quinn.algorithms.infra.DataMaker;
import com.quinn.algorithms.infra.Flow;
import com.quinn.algorithms.tool.Metrics;
import com.quinn.algorithms.tool.Swap;

/**
 * @ClassName InsertionSort
 * @Description TODO(這裡用一句話描述這個類的作用)
 * @author Quinn
 * @date Apr 21, 2022 9:49:28 AM
 */
public class InsertionSort extends Flow {

	private static int[] data = new DataMaker().getData();

	public static void main(String[] args) {
//		data = new int[] { 1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
//		data = new int[] { 5,1,4,10,15,3,2 };
		new InsertionSort().exec(data);
	}

	public void algorithm(int[] data) {
		for (int i = 0; i < data.length; i++) {
			if (i == 0) {
				continue;
			}
			if (data[i] < data[i - 1]) {
				Swap.x_y(data, i, i - 1);
				i = 0;
			}
			addCnt();
		}

	}

}
