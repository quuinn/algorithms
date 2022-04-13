/**   
* @Title: BubbleSort.java 
* @Package domain.sort 
* @Description: 泡泡排序 
* @author pigmilk
* @date Apr 9, 2022 10:26:36 PM 
* @version 1.0.0   
*/
package domain.sort;

import java.util.Random;

import domain.tools.Swap;

/**
 * @ClassName: BubbleSort
 * @Description: 泡泡排序
 * @author pigmilk
 * @date Apr 9, 2022 10:26:36 PM
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
