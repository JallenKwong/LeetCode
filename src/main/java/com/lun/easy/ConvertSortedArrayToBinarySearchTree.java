package com.lun.easy;

import java.util.LinkedList;

import com.lun.util.BinaryTree.TreeNode;

public class ConvertSortedArrayToBinarySearchTree {

	// 方法一：非递归版
	public TreeNode sortedArrayToBST1(int[] nums) {
		if (nums == null || nums.length == 0)
			return null;
		int mid = (int) Math.ceil((nums.length - 1) / 2.0);
		TreeNode root = new TreeNode(nums[mid]);
		LinkedList<int[]> stack = new LinkedList<>();
		stack.push(new int[] { mid + 1, nums.length - 1 });
		stack.push(new int[] { 0, mid - 1 });

		while (!stack.isEmpty()) {
			int[] pair = stack.pop();
			int left = pair[0], right = pair[1];
			TreeNode p = root;
			if (left <= right) {
				mid = (int) Math.ceil(left + (right - left) / 2.0);
				int temp = nums[mid];

				while (true) {
					if (temp < p.val) {
						if (p.left == null) {
							p.left = new TreeNode(temp);
							break;
						} else {
							p = p.left;
						}
					} else if (temp > p.val) {
						if (p.right == null) {
							p.right = new TreeNode(temp);
							break;
						} else {
							p = p.right;
						}
					} else {
						break;
					}
				}
				stack.push(new int[] { mid + 1, right });
				stack.push(new int[] { left, mid - 1 });
			}
		}

		return root;
	}

	// 方法二：递归版
	public TreeNode sortedArrayToBST2(int[] nums) {
		if (nums == null || nums.length == 0)
			return null;
		int mid = (int) Math.ceil((nums.length - 1) / 2.0);
		TreeNode root = new TreeNode(nums[mid]);
		addNode(nums, root, 0, mid - 1);
		addNode(nums, root, mid + 1, nums.length - 1);
		return root;
	}

	private void addNode(int[] nums, TreeNode root, int left, int right) {
		if (left > right) {
			return;
		}

		int mid = (int) Math.ceil(left + (right - left) / 2.0);
		int temp = nums[mid];
		TreeNode p = root;
		while (true) {
			if (temp < p.val) {
				if (p.left == null) {
					p.left = new TreeNode(temp);
					break;
				} else {
					p = p.left;
				}
			} else if (temp > p.val) {
				if (p.right == null) {
					p.right = new TreeNode(temp);
					break;
				} else {
					p = p.right;
				}
			} else {
				break;
			}
		}
		addNode(nums, root, left, mid - 1);
		addNode(nums, root, mid + 1, right);
	}

	// 方法三：别人写的递归版
	public TreeNode sortedArrayToBST3(int[] num) {
		if (num.length == 0) {
			return null;
		}
		TreeNode head = addNode(num, 0, num.length - 1);
		return head;
	}

	private TreeNode addNode(int[] num, int low, int high) {
		if (low > high) {
			return null;
		}
		int mid = (int) Math.ceil(low + (high - low) / 2.0);
		TreeNode node = new TreeNode(num[mid]);
		node.left = addNode(num, low, mid - 1);
		node.right = addNode(num, mid + 1, high);
		return node;
	}

	// 方法四：根据方法三写成的非递归版
	public TreeNode sortedArrayToBST4(int[] nums) {
		if (nums == null || nums.length == 0)
			return null;
		LinkedList<Object> stack = new LinkedList<>();
		int mid = (int) Math.ceil((nums.length - 1) / 2.0);
		TreeNode root = new TreeNode(nums[mid]);
		TreeNode p = null;

		stack.push(new Object[] { root, 1, mid + 1, nums.length - 1 });
		stack.push(new Object[] { root, 0, 0, mid - 1 });

		while (!stack.isEmpty()) {
			Object[] objs = (Object[]) stack.pop();

			TreeNode parent = (TreeNode) objs[0];
			int leftOrRight = (int) objs[1];
			int low = (int) objs[2];
			int high = (int) objs[3];

			if (low > high)
				continue;

			mid = (int) Math.ceil(low + (high - low) / 2.0);

			if (leftOrRight == 0) {
				p = parent.left = new TreeNode(nums[mid]);
			} else {
				p = parent.right = new TreeNode(nums[mid]);
			}

			stack.push(new Object[] { p, 1, mid + 1, high });
			stack.push(new Object[] { p, 0, low, mid - 1 });
		}

		return root;
	}

}
