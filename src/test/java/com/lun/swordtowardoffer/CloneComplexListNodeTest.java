package com.lun.swordtowardoffer;

import org.junit.Assert;
import org.junit.Test;

import com.lun.swordtowardoffer.CloneComplexListNode.ComplexListNode;

public class CloneComplexListNodeTest {

	public static ComplexListNode complexList;
	
	static {
		ComplexListNode nodeA = new ComplexListNode('A');
		ComplexListNode nodeB = new ComplexListNode('B');
		ComplexListNode nodeC = new ComplexListNode('C');
		ComplexListNode nodeD = new ComplexListNode('D');
		ComplexListNode nodeE = new ComplexListNode('E');
		
		nodeA.next = nodeB;
		nodeB.next = nodeC;
		nodeC.next = nodeD;
		nodeD.next = nodeE;
		
		nodeA.sibling = nodeC;
		nodeB.sibling = nodeE;
		nodeC.sibling = null;
		nodeD.sibling = nodeB;
		nodeE.sibling = null;
		
		complexList = nodeA;
	}
	
	@Test
	public void test() {
		CloneComplexListNode cn = new CloneComplexListNode();
		ComplexListNode clone = cn.clone(complexList);
		
		Assert.assertFalse(clone == complexList);
		
		Assert.assertEquals('A', clone.value);
		Assert.assertEquals('B', clone.next.value);
		Assert.assertEquals('C', clone.next.next.value);
		Assert.assertEquals('D', clone.next.next.next.value);
		Assert.assertEquals('E', clone.next.next.next.next.value);
		
		Assert.assertEquals('C', clone.sibling.value);
		Assert.assertEquals('E', clone.next.sibling.value);
		Assert.assertNull(clone.next.next.sibling);
		Assert.assertEquals('B', clone.next.next.next.sibling.value);
		Assert.assertNull(clone.next.next.next.next.sibling);		
	}
}
