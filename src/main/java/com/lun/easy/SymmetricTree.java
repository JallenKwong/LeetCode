package com.lun.easy;

import java.util.Arrays;
import java.util.LinkedList;

import com.lun.util.BinaryTree.TreeNode;

public class SymmetricTree {

	//方法一:我写的BFS
	public boolean isSymmetric1(TreeNode root) {
		if (root == null) return true;
		LinkedList<TreeNode> queue = new LinkedList<>(Arrays.asList(root.left, root.right));

		while (!queue.isEmpty()) {
			int length = queue.size();

			for (int i = 0, j = length - 1; i < length / 2; i++, j--) {
				TreeNode tn1 = queue.get(i), tn2 = queue.get(j);

				if (tn1 == null && tn2 != null || tn1 != null && tn2 == null) {
					return false;
				}

				if (tn1 != null && tn2 != null) {
					if (tn1.val != tn2.val) {
						return false;
					}
				}
			}
			
			for(int i = length - 1; i >= 0; i--) {
				TreeNode node = queue.get(i);
				queue.remove(i);
				if(node != null)
					queue.addAll(i, Arrays.asList(node.left, node.right));
			}
		}

		return true;
	}

	//方法一:别人写的BFS
	public boolean isSymmetric2(TreeNode root) {
		if (root == null) return true;
		LinkedList<TreeNode> q = new LinkedList<>(Arrays.asList(root.left, root.right));
		while (!q.isEmpty()) {
			TreeNode left = q.poll(), right = q.poll();
			if (left == null && right == null) continue;
			if (left == null || right == null || left.val != right.val) return false;
			q.addAll(Arrays.asList(left.left, right.right, left.right, right.left));
		}
		return true;
	}
	
	//方法二：
	public boolean isSymmetric3(TreeNode root) {
		return root == null || isSymmetric3(root, root);
	}
	
	private boolean isSymmetric3(TreeNode root1, TreeNode root2) {
		if(root1 == null && root2 != null || root1 != null && root2 == null)
			return false;
		
		if(root1 != null && root2 != null) {
			
			if(root1.val != root2.val) {
				return false;
			}

			return isSymmetric3(root1.left, root2.right) && isSymmetric3(root1.right, root2.left);
		}
		
		return true;
	}
	
}
