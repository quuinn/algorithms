/**   
* @Title RingBuffer.java 
* @Package com.quinn.algorithms.infra.structures 
* @Description TODO 
* @author pigmilk
* @date Apr 26, 2022 3:04:14 PM 
* @version 1.0.0   
*/
package com.quinn.structures.implement;

import java.util.Collection;
import java.util.Iterator;

import com.quinn.structures.feature.Queue;

import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName RingBuffer
 * @Description TODO(這裡用一句話描述這個類的作用)
 * @author pigmilk
 * @param <E>
 * @date Apr 26, 2022 3:04:14 PM
 */

@Getter
@Setter
public class RingBuffer<E> implements java.util.Queue<E>{
	int size;

	public static void main(String[] args) {
		RingBuffer r = new RingBuffer();
	}

	/*
	* Title: size
	* Description: 
	* @return 
	* @see java.util.Collection#size() 
	*/
	@Override
	public int size() {
		return size;
	}

	/*
	* Title: isEmpty
	* Description: 
	* @return 
	* @see java.util.Collection#isEmpty() 
	*/
	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	/*
	* Title: contains
	* Description: 
	* @param o
	* @return 
	* @see java.util.Collection#contains(java.lang.Object) 
	*/
	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	* Title: iterator
	* Description: 
	* @return 
	* @see java.util.Collection#iterator() 
	*/
	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	* Title: toArray
	* Description: 
	* @return 
	* @see java.util.Collection#toArray() 
	*/
	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	* Title: toArray
	* Description: 
	* @param <T>
	* @param a
	* @return 
	* @see java.util.Collection#toArray(java.lang.Object[]) 
	*/
	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	* Title: remove
	* Description: 
	* @param o
	* @return 
	* @see java.util.Collection#remove(java.lang.Object) 
	*/
	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	* Title: containsAll
	* Description: 
	* @param c
	* @return 
	* @see java.util.Collection#containsAll(java.util.Collection) 
	*/
	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	* Title: addAll
	* Description: 
	* @param c
	* @return 
	* @see java.util.Collection#addAll(java.util.Collection) 
	*/
	@Override
	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	* Title: removeAll
	* Description: 
	* @param c
	* @return 
	* @see java.util.Collection#removeAll(java.util.Collection) 
	*/
	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	* Title: retainAll
	* Description: 
	* @param c
	* @return 
	* @see java.util.Collection#retainAll(java.util.Collection) 
	*/
	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	* Title: clear
	* Description:  
	* @see java.util.Collection#clear() 
	*/
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	/*
	* Title: add
	* Description: 
	* @param e
	* @return 
	* @see java.util.Queue#add(java.lang.Object) 
	*/
	@Override
	public boolean add(E e) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	* Title: offer
	* Description: 
	* @param e
	* @return 
	* @see java.util.Queue#offer(java.lang.Object) 
	*/
	@Override
	public boolean offer(E e) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	* Title: remove
	* Description: 
	* @return 
	* @see java.util.Queue#remove() 
	*/
	@Override
	public E remove() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	* Title: poll
	* Description: 
	* @return 
	* @see java.util.Queue#poll() 
	*/
	@Override
	public E poll() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	* Title: element
	* Description: 
	* @return 
	* @see java.util.Queue#element() 
	*/
	@Override
	public E element() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	* Title: peek
	* Description: 
	* @return 
	* @see java.util.Queue#peek() 
	*/
	@Override
	public E peek() {
		// TODO Auto-generated method stub
		return null;
	}
}
