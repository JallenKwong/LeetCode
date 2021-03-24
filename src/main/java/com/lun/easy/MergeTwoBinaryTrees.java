package com.lun.easy;

import java.util.LinkedList;

import com.lun.util.BinaryTree.TreeNode;

public class MergeTwoBinaryTrees {

	// 方法一：递归法
	public TreeNode mergeTrees1(TreeNode t1, TreeNode t2) {
		if (t1 == null && t2 == null) {
			return null;
		} else {
			TreeNode node = new TreeNode((t1 == null ? 0 : t1.val) + //
					(t2 == null ? 0 : t2.val));
			node.left = mergeTrees1(t1 == null ? null : t1.left, //
					t2 == null ? null : t2.left);
			node.right = mergeTrees1(t1 == null ? null : t1.right, //
					t2 == null ? null : t2.right);
			return node;
		}
	}

	// 方法二：迭代法
	public TreeNode mergeTrees2(TreeNode t1, TreeNode t2) {
		TreeNode result = null;

		if (t1 == null && t2 == null) {
			return null;
		} else {
			result = new TreeNode((t1 == null ? 0 : t1.val) + (t2 == null ? 0 : t2.val));
		}

		LinkedList<TreeNode[]> stack = new LinkedList<>();
		stack.push(new TreeNode[] { t1, t2, result });

		while (!stack.isEmpty()) {
			TreeNode[] nodes = stack.pop();
			TreeNode p1 = nodes[0], p2 = nodes[1], p3 = nodes[2];

			boolean p1AndItsLeftExised = p1 != null && p1.left != null;
			boolean p2AndItsLeftExised = p2 != null && p2.left != null;
			boolean p1AndItsRightExised = p1 != null && p1.right != null;
			boolean p2AndItsRightExised = p2 != null && p2.right != null;

			if (p1AndItsLeftExised || p2AndItsLeftExised) {
				int p1LeftValue = p1AndItsLeftExised ? p1.left.val : 0;
				int p2LeftValue = p2AndItsLeftExised ? p2.left.val : 0;
				p3.left = new TreeNode(p1LeftValue + p2LeftValue);
				stack.push(new TreeNode[] { p1AndItsLeftExised ? p1.left : null, //
						p2AndItsLeftExised ? p2.left : null, p3.left });
			}

			if (p1AndItsRightExised || p2AndItsRightExised) {
				int p1RightValue = p1AndItsRightExised ? p1.right.val : 0;
				int p2RightValue = p2AndItsRightExised ? p2.right.val : 0;
				p3.right = new TreeNode(p1RightValue + p2RightValue);
				stack.push(new TreeNode[] { p1AndItsRightExised ? p1.right : null, //
						p2AndItsRightExised ? p2.right : null, p3.right });
			}
		}

		return result;
	}

	// 方法三:别人写的递归法
	public TreeNode mergeTrees3(TreeNode t1, TreeNode t2) {
		if (t1 == null) {
			return t2;
		}
		if (t2 == null) {
			return t1;
		}
		TreeNode m = new TreeNode(t1.val + t2.val);
		m.left = mergeTrees3(t1.left, t2.left);
		m.right = mergeTrees3(t1.right, t2.right);

		return m;
	}
}
