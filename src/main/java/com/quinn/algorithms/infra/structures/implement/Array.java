/**   
* @Title: Array.java 
* @Package domain.implement 
* @Description: TODO 
* @author pigmilk
* @date Apr 9, 2022 5:38:12 PM 
* @version 1.0.0   
*/
package com.quinn.algorithms.infra.structures.implement;

import java.util.Arrays;
import java.util.List;

import domain.feature.Node;

/**
 * @ClassName: Array
 * @Description: TODO(這裡用一句話描述這個類的作用)
 * @author pigmilk
 * @date Apr 9, 2022 5:38:12 PM
 */
public class Array implements Node, domain.feature.Array {

	/* 
	 * Title: setData Description:
	 * 
	 * @param data
	 * 
	 * @see domain.feature.Node#setData(java.lang.Object)
	 */
	@Override
	public void setData(Object data) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		int[] o = new int[3];
		o[0] = 1;
		o[1] = 2;
		o[2] = 3;
//		System.out.println(System.identityHashCode(o[0]));
//		System.out.println(System.identityHashCode(o[1]));
//		System.out.println(System.identityHashCode(o[2]));
//		List<Object> alpha = Arrays.asList(o);
////		alpha.forEach((sub)-> System.out.println(Integer.toHexString(System.identityHashCode(sub))));
//		alpha.forEach((s)-> System.out.println(s));
		
		
		var n = 10;
		for(int i = 0; i < n ; i++) {
			System.out.println(i);
		}
	}

}
