package com.lun.swordtowardoffer;

import java.util.LinkedList;

public class MyStack<T extends Comparable<T>> {
	
	private LinkedList<T> stack = new LinkedList<>();
	private LinkedList<T> minStack = new LinkedList<>();
	private T min;
	
	public void push(T t) {
		stack.push(t);
		
		if(stack.size() == 1) {
			min = t;
			minStack.push(t);
		}else {
			if(min.compareTo(t) > 0) {
				min = t;
			}
			minStack.push(min);
		}
	}
	
	public T pop() {
		if(stack.isEmpty()) {
			return null;
		}
		minStack.pop();
		return stack.pop();
	}
	
	public T min() {
		if(minStack.isEmpty()) {
			return null;
		}
		return minStack.peek();
	}
	
	
}
