package com.lun.swordtowardoffer;

public class CloneComplexListNode {

	public static class ComplexListNode{
		public char value;
		public ComplexListNode next;
		public ComplexListNode sibling;
		public ComplexListNode() {}
		public ComplexListNode(char value) {
			this.value = value;
		}
	}
	
	public void cloneNode(ComplexListNode head) {
		ComplexListNode p = head;
		while(p != null) {
			ComplexListNode clone = new ComplexListNode();
			clone.value = p.value;
			clone.next = p.next;
			p.next = clone;
			p = clone.next;
		}
	}
	
	public void connectSibling(ComplexListNode head) {
		ComplexListNode p = head;
		ComplexListNode clone = null;
		while(p != null) {
			clone = p.next;
			
			if(p.sibling != null) {
				clone.sibling = p.sibling.next;//注意p.sibling.next才是克隆的
			}
			p = clone.next;
		}
	}
	
	public ComplexListNode reconnectNodes(ComplexListNode head) {
		ComplexListNode p = head;
		ComplexListNode cloneHead = null;
		ComplexListNode cloneP = null;
		
		if(p != null) {
			cloneHead = cloneP = p.next;
			p.next = cloneP.next;
			p = p.next;
		}
		
		while(p != null) {
			cloneP.next = p.next;
			cloneP = cloneP.next;
			p.next = cloneP == null ? null : cloneP.next;
			p = p.next;
		}
		
		return cloneHead;
	}
	
	public ComplexListNode clone(ComplexListNode head) {
		cloneNode(head);
		connectSibling(head);
		return reconnectNodes(head);
	}
	
}
