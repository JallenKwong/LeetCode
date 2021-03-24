# MergeTwoBinaryTrees

## Topic

- Tree

## Description

[https://leetcode.com/problems/merge-two-binary-trees/](https://leetcode.com/problems/merge-two-binary-trees/)

Given two binary trees and imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while the others are not.

You need to merge them into a new binary tree. The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node. Otherwise, the NOT null node will be used as the node of new tree.

**Example 1**:

```
Input:
	Tree 1                     Tree 2
          1                         2
         / \                       / \
        3   2                     1   3
       /                           \   \
      5                             4   7
Output:
Merged tree:
	     3
	    / \
	   4   5
	  / \   \
	 5   4   7
```

**Note**: The merging process must start from the root nodes of both trees.

## Analysis

方法一：递归法。

方法二：迭代法。

方法三：别人写的递归法。发现自己没有审清题目。*The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node. Otherwise, the NOT null node will be used as the node of new tree.* 两树都有的才新建一个节点，否则，能复用的就复用。

## Code

[Source Code](../../src/main/java/com/lun/easy/MergeTwoBinaryTrees.java)

[Test Code](../../src/test/java/com/lun/easy/MergeTwoBinaryTreesTest.java)

