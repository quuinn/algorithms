/**   
* @Title: BubbleSort.java 
* @Package com.quinn.algorithms.sort 
* @Description: TODO 
* @author Quinn
* @date Apr 15, 2022 9:49:38 PM 
* @version 1.0.0   
*/
package com.quinn.algorithms.sort;

import com.quinn.algorithms.infra.DataMaker;
import com.quinn.algorithms.infra.Flow;
import com.quinn.algorithms.tool.Metrics;
import com.quinn.algorithms.tool.Swap;

/**
 * @ClassName: BubbleSort
 * @Description: TODO(這裡用一句話描述這個類的作用)
 * @author Quinn
 * @date Apr 15, 2022 9:49:38 PM
 */

public class BubbleSort extends Flow {
	private static int[] data = new DataMaker().getData();

	public static void main(String[] args) {
		new BubbleSort().exec(data);
	}

	/*
	 * Title: algorithm Description:
	 * 
	 * @param data
	 * 
	 * @see com.quinn.algorithms.infra.Flow#algorithm(int[])
	 */
	@Override
	public void algorithm(int[] data) {
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j + 1 < data.length; j++) {
				addCnt();
				if (data[j] > data[j + 1]) {
					Swap.x_y(data, j, j + 1);
				}
			}
		}
	}

}
