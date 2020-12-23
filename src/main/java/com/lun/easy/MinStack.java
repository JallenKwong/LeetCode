package com.lun.easy;

public class MinStack {
	/** initialize your data structure here. */
	private ListNode headNode;
	private ListNode minNode;

	public MinStack() {}

	public void push(int x) {
		headNode = new ListNode(x, headNode);
		minNode = minNode == null ? new ListNode(x) //
				: new ListNode(x < minNode.val ? x : minNode.val, minNode);
	}

	public void pop() {
		if (headNode == null) {
			return;
		} else {
			ListNode p = headNode;
			headNode = p.next;
			p.next = null;

			p = minNode;
			minNode = p.next;
			p.next = null;
		}
	}

	public int top() {
		if (headNode == null)
			throw new NullPointerException("Stack is Empty.");
		return headNode.val;
	}

	public int getMin() {
		if (minNode == null)
			throw new NullPointerException("Stack is Empty.");
		return minNode.val;
	}

	private class ListNode {
		public int val;
		public ListNode next;

		public ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
}
