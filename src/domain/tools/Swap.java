/**   
* @Title: Swap.java 
* @Package domain.tools 
* @Description: TODO 
* @author pigmilk
* @date Apr 11, 2022 11:33:18 AM 
* @version 1.0.0   
*/
package domain.tools;

/**
 * @ClassName: Swap
 * @Description: 轉換用的類別
 * @author pigmilk
 * @date Apr 11, 2022 11:33:18 AM
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
