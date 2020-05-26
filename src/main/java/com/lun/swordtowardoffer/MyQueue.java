package com.lun.swordtowardoffer;

import java.util.LinkedList;

public class MyQueue<T> {
	
	private LinkedList<T> stack1;
	private LinkedList<T> stack2;
	
	public MyQueue() {
		stack1 = new LinkedList<>();
		stack2 = new LinkedList<>();
	}
	
	public void appendTail(T t) {
		stack1.push(t);
	}
	
	public T deleteHead() {
		
		if(stack2.isEmpty()) {
			while(!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		
		if(stack2.isEmpty()) {
			throw new RuntimeException("Queue is empty.");
		}
		
		return stack2.pop();
	}
}
