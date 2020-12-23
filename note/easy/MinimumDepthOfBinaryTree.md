# MinimumDepthOfBinaryTree #

## Topic

- Tree
- Breadth-first Search
- Depth-first Search

## Description

[https://leetcode.com/problems/minimum-depth-of-binary-tree/](https://leetcode.com/problems/minimum-depth-of-binary-tree/)

Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

**Note**: A leaf is a node with no children.


**Example 1**:

```
    3
   / \
  9  20
     / \
   15   7

Input: root = [3,9,20,null,null,15,7]
Output: 2
```

**Example 2**:

```
2
 \
  3
   \
    4
     \
      5
       \
        6

Input: root = [2,null,3,null,4,null,5,null,6]
Output: 5
```

**Constraints**:

- The number of nodes in the tree is in the range [0, 10⁵].
- -1000 <= Node.val <= 1000

## Code

[Source Code](MinimumDepthOfBinaryTree.java)

[Test Code](../../../../../test/java/com/lun/easy/MinimumDepthOfBinaryTreeTest.java)

