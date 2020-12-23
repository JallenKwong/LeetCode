# ConvertSortedArrayToBinarySearchTree #

## Topic

- Tree
- Depth-first Search

## Description

[https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/](https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/)

Given an array where elements are sorted in ascending order, convert it to a height balanced BST.

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

**Example**:

```
Given the sorted array: [-10,-3,0,5,9],

One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:

      0
     / \
   -3   9
   /   /
 -10  5
```

## Analysis

基本解题思想就是获取数组中位数，再以中位数的下标为界，分成两子数组，递归获取中位数，从而构建一棵BST。

方法一：非递归版，首先获取数组的中位数，然后从root开始DFS，放置合适位置，再以这中位数的下标为界，分成子数组的左右界下标推入栈中，之后形成一循环。

方法二：递归版，方法思想基本与方法一相同。

方法三：别人写的递归版。该方法思想是：首先获取数组的中位数，新建一节点，再以这中位数的下标为界，分为左右子数组，然后节点的左节点则在左子数组中得出，节点的右节点则在右子数组中得出，然后递归获取中位数，从而构建一棵BST。与方法二的区别是，不用从root开始DFS。

方法四：根据方法三思想写的非递归版。


## Code

[Source Code](ConvertSortedArrayToBinarySearchTree.java)

[Test Code](../../../../../test/java/com/lun/easy/ConvertSortedArrayToBinarySearchTreeTest.java)

