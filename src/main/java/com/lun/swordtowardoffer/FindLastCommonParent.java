package com.lun.swordtowardoffer;

import java.util.LinkedList;
import java.util.List;

import com.lun.util.MyUtils;

public class FindLastCommonParent {

	public static class TreeNode{
		public final char value;
		public final List<TreeNode> children;
		
		public TreeNode(char value, List<TreeNode> children) {
			this.value = value;
			this.children = children;
		}
	}
	
	public TreeNode find(TreeNode root, char char1, char char2) {
		
		if(root == null) {
			throw new NullPointerException();
		}
		
		List<TreeNode> path1 = getPath(root, char1);
		List<TreeNode> path2 = getPath(root, char2);
		
		return findLastCommonParent(path1, path2);
	}
	
	//从根结点到查找节点的路径-非递归版
	public List<TreeNode> getPath(TreeNode root, char value) {
		LinkedList<TreeNode> result = new LinkedList<>();
		LinkedList<TreeNode> stack = new LinkedList<>();
		
		TreeNode p1 = root;
		
		while(true) {
			if(result.peekLast() != null && result.peekLast().value == p1.value) {
				result.removeLast();
			}else {
				result.add(p1);
				if(p1.value == value) {
					break;
				}
				if(!MyUtils.checkListEmpty(p1.children)) {
					stack.push(p1);
					stack.addAll(0, p1.children);
				}else {
					result.removeLast();
				}
			}
			
			if(stack.peek() != null) {
				p1 = stack.pop();
			}else {
				break;
			}
		}
		
		return result;
	}
	
	//从根结点到查找节点的路径-递归版
	public boolean getPath(TreeNode node, char value, List<TreeNode> path) {
		if(node.value == value) {
			path.add(node);
			return true;
		}
		
		path.add(node);
		
		boolean found = false;
		
		for(int i = 0; !found && !MyUtils.checkListEmpty(node.children) && i < node.children.size(); i++) {
			found = getPath(node.children.get(i), value, path);
		}
		
		if(!found) 
			path.remove(path.size() - 1);
		
		return found;
	}
	
	public TreeNode findLastCommonParent(List<TreeNode> path1, List<TreeNode> path2) {
		if(MyUtils.checkListEmpty(path1) || MyUtils.checkListEmpty(path2)) {
			return null;
		}
		TreeNode result = null;
		
		for(int index = 0 ; index < path1.size() && index < path2.size(); index++) {
			if(path1.get(index).value == path2.get(index).value) {
				result = path1.get(index);
//				break;
			}
		}
		
		return result;
	}

}
