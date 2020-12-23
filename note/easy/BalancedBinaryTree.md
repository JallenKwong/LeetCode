# BalancedBinaryTree #

## Topic

- Tree
- Depth-first Search
- Recursion

## Description

[https://leetcode.com/problems/balanced-binary-tree/](https://leetcode.com/problems/balanced-binary-tree/)

Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as:

> a binary tree in which the left and right subtrees of every node differ in height by no more than 1.

**Example 1**:

```
   3
  / \
 9  20
   /  \
  15   7
Input: root = [3,9,20,null,null,15,7]
Output: true
```

**Example 2**:

```
        1
       / \
      2   2
     / \
    3   3
   / \
  4   4
Input: root = [1,2,2,3,3,null,null,4,4]
Output: false
```

**Example 3**:

```
Input: root = []
Output: true
```

**Constraints**:

- The number of nodes in the tree is in the range [0, 5000].
- -10⁴ <= Node.val <= 10⁴

## Analysis

**方法一：从上到下法(the top down approach)**。The first method checks whether the tree is balanced strictly according to the definition of balanced binary tree: the difference between the heights of the two sub trees are not bigger than 1, and both the left sub tree and right sub tree are also balanced.

For the current node root, calling height() for its left and right children actually has to access all of its children, thus the complexity is O(N). We do this for each node in the tree, so the overall complexity of isBalanced will be O(N^2). This is a top down approach.

---

**方法二：从下而上法(the bottom up way)**。

The second method is based on DFS. Instead of calling height() explicitly for each child node, we return the height of the current node in DFS recursion. When the sub tree of the current node (inclusive) is balanced, the function dfsHeight() returns a non-negative value as the height. Otherwise -1 is returned. According to the leftHeight and rightHeight of the two children, the parent node could check if the sub tree is balanced, and decides its return value.

## Code

[Source Code](../../src/main/java/com/lun/easy/BalancedBinaryTree.java)

[Test Code](../../src/test/java/com/lun/easy/BalancedBinaryTreeTest.java)

