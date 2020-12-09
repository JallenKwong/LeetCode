package com.lun.swordtowardoffer;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lun.util.BinaryTree;
import com.lun.util.BinaryTree.TreeNode;

public class SerializeBinaryTreeTest {

	@Test
	public void testSerialize() {
		SerializeBinaryTree sbt = new SerializeBinaryTree();
		StringBuilder result = new StringBuilder("");
		TreeNode root = makeATree();
		sbt.serialize(root, result);
		assertEquals("1,2,4,$,$,$,3,5,$,$,6,$,$,", result.toString());
	}
	
	@Test
	public void testReadNum() {
		SerializeBinaryTree sbt = new SerializeBinaryTree();
		StringBuilder sb = new StringBuilder("1,2,4,$,$,$,3,5,$,$,6,$,$,");
		
		assertEquals(1, sbt.readNum(sb).intValue());
		assertEquals("2,4,$,$,$,3,5,$,$,6,$,$,", sb.toString());
		
		assertEquals(2, sbt.readNum(sb).intValue());
		assertEquals("4,$,$,$,3,5,$,$,6,$,$,", sb.toString());
		
		assertEquals(4, sbt.readNum(sb).intValue());
		assertEquals("$,$,$,3,5,$,$,6,$,$,", sb.toString());
		
		assertNull(sbt.readNum(sb));
		assertEquals("$,$,3,5,$,$,6,$,$,", sb.toString());
		
		assertNull(sbt.readNum(sb));
		assertEquals("$,3,5,$,$,6,$,$,", sb.toString());

		assertNull(sbt.readNum(sb));
		assertEquals("3,5,$,$,6,$,$,", sb.toString());
		
		assertEquals(3, sbt.readNum(sb).intValue());
		assertEquals("5,$,$,6,$,$,", sb.toString());
		
		assertEquals(5, sbt.readNum(sb).intValue());
		assertEquals("$,$,6,$,$,", sb.toString());
		
		assertNull(sbt.readNum(sb));
		assertEquals("$,6,$,$,", sb.toString());

		assertNull(sbt.readNum(sb));
		assertEquals("6,$,$,", sb.toString());
		
		assertEquals(6, sbt.readNum(sb).intValue());
		assertEquals("$,$,", sb.toString());
		
		assertNull(sbt.readNum(sb));
		assertEquals("$,", sb.toString());
		
		assertNull(sbt.readNum(sb));
		assertEquals("", sb.toString());
	}
	
	@Test
	public void testDeserialize() {
		SerializeBinaryTree sbt = new SerializeBinaryTree();
		TreeNode root = null;
		TreeNode root2 = makeATree();
		
		StringBuilder sb = new StringBuilder("");
		sbt.serialize(root2, sb);
		
		root = sbt.deserialize(sb);
		
		assertTrue(BinaryTree.equals(root, root2));
	}
	
	
	private TreeNode makeATree() {
		TreeNode root = new TreeNode(1);
		
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		
		root.left.left = new TreeNode(4);
		
		root.right.left = new TreeNode(5);
		root.right.right = new TreeNode(6);
		
		return root;
	}

}
