package com.lun.swordtowardoffer;

import static org.junit.Assert.*;
import org.junit.Test;
import com.lun.swordtowardoffer.NextNodeOfBinaryTree.TreeNode;

public class NextNodeOfBinaryTreeTest {

	@Test
	public void testNext() {
		
		NextNodeOfBinaryTree nt = new NextNodeOfBinaryTree();
		
		TreeNode a = new TreeNode('a');
		TreeNode b = new TreeNode('b');
		TreeNode c = new TreeNode('c');
		TreeNode d = new TreeNode('d');
		TreeNode e = new TreeNode('e');
		TreeNode f = new TreeNode('f');
		TreeNode g = new TreeNode('g');
		TreeNode h = new TreeNode('h');
		TreeNode i = new TreeNode('i');
		
		a.left = b;
		a.right = c;
		
		b.parent = a;
		b.left = d;
		b.right = e;
		
		c.parent = a;
		c.left = f;
		c.right = g;
		
		d.parent = b;
		
		e.parent = b;
		e.left = h;
		e.right = i;
		
		f.parent = c;
		g.parent = c;
		
		h.parent = e;
		i.parent = e;
		
		assertEquals('h', nt.next(b).val);
		
		assertEquals('b', nt.next(d).val);
		assertEquals('c', nt.next(f).val);
		
		assertEquals('a', nt.next(i).val);
	}

}
