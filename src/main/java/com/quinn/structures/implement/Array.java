/**   
* @Title: Array.java 
* @Package domain.implement 
* @Description: TODO 
* @author Quinn
* @date Apr 9, 2022 5:38:12 PM 
* @version 1.0.0   
*/
package com.quinn.structures.implement;

import com.quinn.structures.feature.Node;

import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName: Array
 * @Description: TODO(這裡用一句話描述這個類的作用)
 * @author Quinn
 * @param <T>
 * @date Apr 9, 2022 5:38:12 PM
 */
@Getter
@Setter
public class Array<Node<T>> {
	Node<T> data;
	int size;

	public Array(int size) {
		this.size = size;
	}

	void set(int i, T data) {
		this.get(i)
	}

	T get(int i) {
		return null;
	}

	boolean isEmpty() {
		return getSize() == 0;
	}

	boolean isFull() {
		return true;
	}

	int size() {
		return 1;
	}

	public static void main(String[] args) {
	}

}
