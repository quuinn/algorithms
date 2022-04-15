/**   
* @Title: BubbleSort.java 
* @Package com.quinn.algorithms.sort 
* @Description: TODO 
* @author pigmilk
* @date Apr 15, 2022 9:49:38 PM 
* @version 1.0.0   
*/
package com.quinn.algorithms.sort;

import java.util.Random;

import com.quinn.algorithms.tool.Swap;

/**
 * @ClassName: BubbleSort
 * @Description: TODO(這裡用一句話描述這個類的作用)
 * @author pigmilk
 * @date Apr 15, 2022 9:49:38 PM
 */


public class BubbleSort {
	public static int[] data;
	public static Random r;

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
		int cnt = 0;
		// 2. 排序, 小到大
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j + 1 < data.length; j++) {
				if (data[j] > data[j + 1]) {
					Swap.x_y(data, j, j + 1);
				}
				cnt++;
			}
		}
		System.out.println("\n共執行次數: " + cnt);
		// 3. 打印排序後資料
		System.out.println("\n打印排序後資料");
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
	}

}
