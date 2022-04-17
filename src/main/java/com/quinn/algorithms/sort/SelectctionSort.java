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
import com.quinn.algorithms.tool.RandomFactory;
import com.quinn.algorithms.tool.Swap;

/**
 * @ClassName: SelectctionSort
 * @Description: TODO(這裡用一句話描述這個類的作用)
 * @author pigmilk
 * @date Apr 15, 2022 9:50:13 PM
 */
public class SelectctionSort {
	public static int[] data;
	public static Random r;
	public static RandomFactory rF;

	public static void init() {
		data = new int[5];
		r = new Random(72);
		for (int i = 0; i < 5; i++) {
			data[i] = r.nextInt(-10, 10);
		}
	}

	public static void main(String[] args) {
		init();
		// 1. 打印排序前資料
		System.out.println("打印排序前資料");
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		// 1. LOOP
		// 2. 外圈 loop 控制要處理的陣列位置
		int cnt = 0;
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
		System.out.println("\n共執行次數: " + cnt);

		// 2. 找出最大的數字並且與 data.length - loopIndex 位置互換
		// 3. 打印排序後資料
		System.out.println("\n打印排序後資料");
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
	}

}
