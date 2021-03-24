package com.lun.util;

import java.util.LinkedList;

public class BinaryTree {

	/**
	 * 二叉树结点
	 * 
	 * @author 白居布衣
	 *
	 */
	public static class TreeNode {
		public int val;
		public TreeNode left;
		public TreeNode right;

		public TreeNode(int x) {
			val = x;
		}

		public TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	/**
	 * 判断两棵二叉树是否相同
	 * 
	 * @param root1
	 * @param root2
	 * @return
	 */
	public static boolean equals(TreeNode root1, TreeNode root2) {

		if (root1 == null ^ root2 == null)
			return false;

		if (root1 != null && root2 != null) {
			if (root1.val != root2.val) {
				return false;
			}

			// //判断左右子树
			return equals(root1.left, root2.left) && equals(root1.right, root2.right);
		}

		return true;
	}

	/**
	 * 非递归版二叉查找树的构建
	 * 
	 * @param array
	 * @return
	 */
	public static TreeNode integerArray2BinarySearchTree(int[] array) {
		if (array == null || array.length == 0) {
			throw new IllegalArgumentException("Illegal array.");
		}
		TreeNode root = new TreeNode(array[0]);
		for (int i = 1; i < array.length; i++) {
			TreeNode p = root;
			while (true) {
				if (array[i] < p.val) {
					if (p.left != null) {
						p = p.left;
					} else {
						p.left = new TreeNode(array[i]);
						break;
					}
				}

				if (array[i] > p.val) {
					if (p.right != null) {
						p = p.right;
					} else {
						p.right = new TreeNode(array[i]);
						break;
					}
				}

				if (array[i] == p.val)
					break;
			}
		}
		return root;
	}

	
	/**
	 * 
	 * 以BFS的方式创建一棵二叉树。
	 * 
	 * 例如：用{3, 4, 5, 5, 4, null, 7}可以创建以下二叉树。<br>
	 * 
	 * &nbsp;&nbsp;&nbsp;&nbsp;3<br>
	 * &nbsp;&nbsp;&nbsp;/&nbsp;\<br>
	 * &nbsp;&nbsp;4 &nbsp; 5<br>
	 * &nbsp;/&nbsp;\ &nbsp; \<br>
	 * 5 &nbsp; 4 &nbsp; 7<br>
	 * 
	 * @param array
	 * @return
	 */
	public static TreeNode integers2BinaryTree(Integer... array) {
		if(array == null || array.length == 0 || array[0] == null)
			throw new IllegalArgumentException();
		
		TreeNode root = new TreeNode(array[0]);
		LinkedList<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		int i = 1;
		while(i < array.length) {
			TreeNode parent = queue.poll();
			
			TreeNode node = null;
			if(i < array.length && array[i] != null) {
				node = new TreeNode(array[i]);
				
				if(parent == null)
					throw new NullPointerException(String.format("The parent is null, left node:%d can't point to.", array[i]));
				parent.left = node;
			}
			queue.offer(node);
			i++;
			
			node = null;
			if(i < array.length && array[i] != null) {
				node = new TreeNode(array[i]);
				if(parent == null)
					throw new NullPointerException(String.format("The parent is null, right node:%d can't point to.", array[i]));
				parent.right = node;
			}
			queue.offer(node);
			i++;
		}
		
		return root;
	}
	
	
	/**
	 * 前序遍历
	 * 
	 * @param root
	 */
	public static void printPreorderTraversing(TreeNode root) {
		if (root == null)
			return;
		System.out.print(root.val + " ");
		preorderTraversing(root.left);
		preorderTraversing(root.right);
	}

	/**
	 * 前序遍历
	 * 
	 * @param root
	 */
	public static String preorderTraversing(TreeNode root) {
		StringBuilder sb = new StringBuilder();
		preorderTraversing(root, sb);
		return sb.substring(0, sb.length() - 1);
	}

	private static void preorderTraversing(TreeNode node, StringBuilder sb) {
		if (node == null)
			return;
		sb.append(node.val);
		sb.append(',');
		preorderTraversing(node.left, sb);
		preorderTraversing(node.right, sb);
	}

	/**
	 * 中序遍历打印
	 * 
	 * @param root
	 */
	public static void printInorderTraversing(TreeNode root) {
		if (root == null)
			return;
		printInorderTraversing(root.left);
		System.out.print(root.val + " ");
		printInorderTraversing(root.right);
	}

	/**
	 * 中序遍历
	 * 
	 * @param root
	 * @return
	 */
	public static String inorderTraversing(TreeNode root) {
		StringBuilder sb = new StringBuilder();
		inorderTraversing(root, sb);
		return sb.substring(0, sb.length() - 1);
	}

	private static void inorderTraversing(TreeNode node, StringBuilder sb) {
		if (node == null)
			return;
		inorderTraversing(node.left, sb);
		sb.append(node.val);
		sb.append(',');
		inorderTraversing(node.right, sb);
	}

	/**
	 * 后序遍历打印
	 * 
	 * @param root
	 */
	public static void printPostTraversing(TreeNode root) {
		if (root == null)
			return;
		printPostTraversing(root.left);
		printPostTraversing(root.right);
		System.out.print(root.val + " ");
	}

	/**
	 * 后序遍历
	 * 
	 * @param root
	 * @return
	 */
	public static String postTraversing(TreeNode root) {
		StringBuilder sb = new StringBuilder();
		postTraversing(root, sb);
		return sb.substring(0, sb.length() - 1);
	}

	public static void postTraversing(TreeNode node, StringBuilder sb) {
		if (node == null)
			return;
		postTraversing(node.left, sb);
		postTraversing(node.right, sb);
		sb.append(node.val);
		sb.append(',');
	}

	/**
	 * 找出值最小结点
	 * 
	 * @param p
	 * @return
	 */
	public static TreeNode min(TreeNode p) {
		if (p == null) {
			// throw new IllegalArgumentException("Illegal TreeNode.");
			return null;
		}

		if (p.left == null)
			return p;
		return min(p.left);
	}

	/**
	 * 找出值最大结点
	 * 
	 * @param p
	 * @return
	 */
	public static TreeNode max(TreeNode p) {
		if (p == null) {
			// throw new IllegalArgumentException("Illegal TreeNode.");
			return null;
		}

		if (p.right == null)
			return p;
		return max(p.right);
	}

}
