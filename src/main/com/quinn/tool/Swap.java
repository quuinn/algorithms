/**   
* @Title: Swap.java 
* @Package com.quinn.tool 
* @Description: TODO 
* @author pigmilk
* @date Apr 15, 2022 9:50:26 PM 
* @version 1.0.0   
*/
package com.quinn.tool;

/**
 * @ClassName: Swap
 * @Description: TODO(這裡用一句話描述這個類的作用)
 * @author pigmilk
 * @date Apr 15, 2022 9:50:26 PM
 */
public class Swap {
	/**
	 * @Title: swap
	 * @Description: x, y 位置互換
	 * @param data int[] array
	 * @param j    The array index
	 * @return void 返回型別
	 * @throws
	 */
	public static void x_y(int[] data, int x, int y) {
		data[x] = data[x] ^ data[y];
		data[y] = data[x] ^ data[y];
		data[x] = data[x] ^ data[y];
	}
}
