package com.lun.swordtowardoffer;

import com.lun.util.BinaryTree.TreeNode;

public class SerializeBinaryTree {

	public void serialize(TreeNode node, StringBuilder result) {
		if(node == null) {
			result.append("$,");
			return;
		}
		
		result.append(node.val + ",");
		
		serialize(node.left, result);
		serialize(node.right, result);
	}
	
	public TreeNode deserialize(StringBuilder sb) {
		Integer number = readNum(sb);
		TreeNode node = null;
		if(number != null) {
			node = new TreeNode(number);
			node.left = deserialize(sb);
			node.right = deserialize(sb);
		}
		return node;
	}
	
	public Integer readNum(StringBuilder sb) {
		int firstCommaIndex = sb.indexOf(",");
		String numStr = sb.substring(0, firstCommaIndex);
		Integer result = null;
		if(!numStr.equals("$")) {
			result = Integer.valueOf(numStr);
		}
		
		try {
			sb.delete(0, firstCommaIndex + 1);
		}catch (Exception e) {
			// do nothing
		}
		return result;
	}
	
}
