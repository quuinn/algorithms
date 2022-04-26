/**   
* @Title: RandomFactory.java 
* @Package com.quinn.algorithms.tool 
* @Description: TODO 
* @author Quinn
* @date Apr 15, 2022 9:50:58 PM 
* @version 1.0.0   
*/
package com.quinn.algorithms.tool;

import java.util.Random;

public class RandomFactory {
	public static Random getRandomData(int luckyNum, int dataLen) {
		for (int i = 0; i < 5; i++) {
			new Random(luckyNum).nextInt(luckyNum, dataLen);
		}
		return null;
	}
}
