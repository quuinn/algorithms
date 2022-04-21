/**   
* @Title: SelectctionSort.java 
* @Package com.quinn.algorithms.sort 
* @Description: TODO 
* @author pigmilk
* @date Apr 15, 2022 9:50:13 PM 
* @version 1.0.0   
*/
package com.quinn.algorithms.sort;

import java.util.Random;

import com.quinn.algorithms.infra.DataMaker;
import com.quinn.algorithms.tool.Metrics;
import com.quinn.algorithms.tool.RandomFactory;
import com.quinn.algorithms.tool.Swap;

/**
 * @ClassName: SelectctionSort
 * @Description: TODO(這裡用一句話描述這個類的作用)
 * @author pigmilk
 * @date Apr 15, 2022 9:50:13 PM
 */
public class SelectctionSort {
	private static int[] data = new DataMaker().getData();
	private static Metrics m = new Metrics();
	

	public static void main(String[] args) {
		// 1. 打印排序前資料
		System.out.println("打印排序前資料");
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		// 1. LOOP
		// 2. 外圈 loop 控制要處理的陣列位置
		int cnt = 0;
		m.logTime(0);
		for (int outer = data.length - 1; outer >= 0; outer--) {
			int temp = 0;
			for (int inner = 0; outer >= inner; inner++) {
				temp = (data[temp] > data[inner]) ? temp : inner;
				cnt++;
			}
			if (temp != outer) {
				Swap.x_y(data, temp, outer);
			}

		}
		m.logTime(1);
		System.out.println("\n共執行次數: " + cnt);
		System.out.println(m.getAverage());

		// 2. 找出最大的數字並且與 data.length - loopIndex 位置互換
		// 3. 打印排序後資料
		System.out.println("\n打印排序後資料");
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
	}

}
