/**   
* @Title Flow.java 
* @Package com.quinn.algorithms.infra 
* @Description TODO 
* @author pigmilk
* @date Apr 21, 2022 4:50:58 PM 
* @version 1.0.0   
*/
package com.quinn.algorithms.infra;

import com.quinn.algorithms.tool.Metrics;

/**
 * @ClassName Flow
 * @Description TODO(這裡用一句話描述這個類的作用)
 * @author pigmilk
 * @date Apr 21, 2022 4:50:58 PM
 */
public abstract class Flow {

	private static Metrics m = new Metrics();
	private int cnt = 0;

	public abstract void algorithm(int[] data);

	public int getCnt() {
		return this.cnt;
	}

	public void addCnt() {
		this.cnt++;
	}

	public void exec(int[] data) {

		// 1. 打印處理前資料
		System.out.println("打印排序前資料");
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		
		// 2. 執行演算法
		m.logTime(0);
		//////////////////////////
		algorithm(data);
		/////////////////////////
		m.logTime(1);
		System.out.println("\n共執行次數: " + getCnt());
		System.out.println(m.getAverage());

		// 3. 打印處理後資料
		System.out.println("\n打印排序後資料");
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
	}

}
