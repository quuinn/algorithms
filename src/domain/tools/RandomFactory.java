/**   
* @Title: RandomFactory.java 
* @Package domain.tools 
* @Description: TODO 
* @author pigmilk
* @date Apr 12, 2022 11:28:16 PM 
* @version 1.0.0   
*/
package domain.tools;

import java.util.Random;

/**
 * @ClassName: RandomFactory
 * @Description: TODO(這裡用一句話描述這個類的作用)
 * @author pigmilk
 * @date Apr 12, 2022 11:28:16 PM
 */

// TODO
public class RandomFactory {
	public static Random getRandomData(int luckyNum, int dataLen) {
		for (int i = 0; i < 5; i++) {
			new Random(luckyNum).nextInt(luckyNum, dataLen);
		}
		return null;
	}
}
