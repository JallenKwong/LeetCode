package com.lun.easy;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues {

	private LinkedList<Integer> firstQueue;
	private LinkedList<Integer> secondQueue;

	/** Initialize your data structure here. */
	public ImplementStackUsingQueues() {
		firstQueue = new LinkedList<>();
		secondQueue = new LinkedList<>();
	}

	/** Push element x onto stack. */
	public void push(int x) {
		if (empty()) {
			firstQueue.offer(x);
			return;
		}

		if (!firstQueue.isEmpty())
			firstQueue.offer(x);
		else
			secondQueue.offer(x);
	}

	/** Removes the element on top of the stack and returns that element. */
	public int pop() {
		if (empty())
			throw new RuntimeException("Stack is empty");

		if (firstQueue.isEmpty()) {
			while (secondQueue.size() > 1) {
				firstQueue.offer(secondQueue.poll());
			}
			return secondQueue.poll();
		} else {
			while (firstQueue.size() > 1) {
				secondQueue.offer(firstQueue.poll());
			}
			return firstQueue.poll();
		}
	}

	/** Get the top element. */
	public int top() {
		if (empty())
			throw new RuntimeException("Stack is empty");
		if (firstQueue.isEmpty()) {
			while (secondQueue.size() > 1) {
				firstQueue.offer(secondQueue.poll());
			}
			Integer temp = secondQueue.poll();
			firstQueue.offer(temp);
			return temp;
		} else {
			while (firstQueue.size() > 1) {
				secondQueue.offer(firstQueue.poll());
			}
			Integer temp = firstQueue.poll();
			secondQueue.offer(temp);
			return temp;
		}
	}

	/** Returns whether the stack is empty. */
	public boolean empty() {
		return firstQueue.isEmpty() && secondQueue.isEmpty();
	}
}

//方法二：用一个队列实现
class MyStack {
	Queue<Integer> queue;

	public MyStack() {
		this.queue = new LinkedList<Integer>();
	}

	// Push element x onto stack.
	public void push(int x) {
		queue.add(x);
		for (int i = 0; i < queue.size() - 1; i++) {
			queue.add(queue.poll());
		}
	}

	// Removes the element on top of the stack.
	public int pop() {
		return queue.poll();
	}

	// Get the top element.
	public int top() {
		return queue.peek();
	}

	// Return whether the stack is empty.
	public boolean empty() {
		return queue.isEmpty();
	}
}

