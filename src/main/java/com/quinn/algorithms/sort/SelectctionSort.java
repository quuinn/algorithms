/**   
* @Title: SelectctionSort.java 
* @Package com.quinn.algorithms.sort 
* @Description: TODO 
* @author Quinn
* @date Apr 15, 2022 9:50:13 PM 
* @version 1.0.0   
*/
package com.quinn.algorithms.sort;

import com.quinn.algorithms.infra.DataMaker;
import com.quinn.algorithms.infra.Flow;
import com.quinn.algorithms.tool.Metrics;
import com.quinn.algorithms.tool.Swap;

/**
 * @ClassName: SelectctionSort
 * @Description: TODO(這裡用一句話描述這個類的作用)
 * @author Quinn
 * @date Apr 15, 2022 9:50:13 PM
 */
public class SelectctionSort extends Flow {
	private static int[] data = new DataMaker().getData();

	/*
	 * Title: algorithm Description:
	 * 
	 * @see com.quinn.algorithms.infra.Flow#algorithm()
	 */
	@Override
	public void algorithm(int[] data) {
		for (int outer = data.length - 1; outer >= 0; outer--) {
			int temp = 0;
			for (int inner = 0; outer >= inner; inner++) {
				temp = (data[temp] > data[inner]) ? temp : inner;
				addCnt();
			}
			if (temp != outer) {
				Swap.x_y(data, temp, outer);
			}

		}

	}

	public static void main(String[] args) {

//		data = new int[] {0, 1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
		new SelectctionSort().exec(data);
	}

}
