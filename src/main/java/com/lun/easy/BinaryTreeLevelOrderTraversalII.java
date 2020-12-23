package com.lun.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import com.lun.util.BinaryTree.TreeNode;

public class BinaryTreeLevelOrderTraversalII {
	
	//方法一：BFS
	public List<List<Integer>> levelOrderBottom1(TreeNode root) {
		List<List<Integer>> result = new LinkedList<>();
		if (root == null)
			return result;
		TreeNode p = root;
		LinkedList<TreeNode> queue = new LinkedList<>(Arrays.asList(p));

		while (!queue.isEmpty()) {
			int size = queue.size();
			List<Integer> list = new ArrayList<>();

			while (size-- > 0) {
				p = queue.poll();

				if (p.left != null) {
					queue.offer(p.left);
				}

				if (p.right != null) {
					queue.offer(p.right);
				}

				list.add(p.val);
			}
			result.add(0, list);
		}

		return result;
	}

	//方法二：DFS
	public List<List<Integer>> levelOrderBottom2(TreeNode root) {
		List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
		levelOrderBottom2(wrapList, root, 0);
		return wrapList;
	}

	public void levelOrderBottom2(List<List<Integer>> list, TreeNode root, int level) {
		if (root == null)
			return;
		if (level >= list.size()) {
			list.add(0, new LinkedList<Integer>());
		}
		levelOrderBottom2(list, root.left, level + 1);
		levelOrderBottom2(list, root.right, level + 1);
		list.get(list.size() - level - 1).add(root.val);
	}
}
