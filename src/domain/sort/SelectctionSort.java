/**   
* @Title: SelectctionSort.java 
* @Package domain.sort 
* @Description: TODO 
* @author pigmilk
* @date Apr 12, 2022 11:25:47 PM 
* @version 1.0.0   
*/
package domain.sort;

import java.util.Random;

import domain.tools.RandomFactory;
import domain.tools.Swap;

/**
 * @ClassName: SelectctionSort
 * @Description: TODO(這裡用一句話描述這個類的作用)
 * @author pigmilk
 * @date Apr 12, 2022 11:25:47 PM
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
		int tmp = 0;
		for (int now = data.length - 1; now >= 0; now--) {
			if (now == data.length - 1) {
				tmp = now;
			}
			tmp = data[tmp] > data[now] ? tmp : now;
			Swap.x_y(data, now, tmp);
		}

		// 2. 找出最大的數字並且與 data.length - loopIndex 位置互換
		// 3. 打印排序後資料
		System.out.println("\n打印排序後資料");
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
	}

}
