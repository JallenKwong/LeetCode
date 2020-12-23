# SameTree #

## Topic

Tree, Depth-first Search

## Description

[https://leetcode.com/problems/same-tree/](https://leetcode.com/problems/same-tree/)

Given two binary trees, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical and the nodes have the same value.

**Example 1**:

```
Input:     1         1
          / \       / \
         2   3     2   3

        [1,2,3],   [1,2,3]

Output: true
```

**Example 2**:

```
Input:     1         1
          /           \
         2             2

        [1,2],     [1,null,2]

Output: false
```

**Example 3**:

```
Input:     1         1
          / \       / \
         2   1     1   2

        [1,2,1],   [1,1,2]

Output: false
```

## Analysis

方法一：递归前序遍历

方法二：非递归前序遍历

## Code

[Source Code](SameTree.java)

[Test Code](../../../../../test/java/com/lun/easy/SameTreeTest.java)

