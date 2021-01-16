# SwapNodesInPairs

## Topic

- Linked List
- Recursion

## Description

[https://leetcode.com/problems/swap-nodes-in-pairs/](https://leetcode.com/problems/swap-nodes-in-pairs/)

Given a linked list, swap every two adjacent nodes and return its head.

**Example 1**:

```
Input: head = [1,2,3,4]
Output: [2,1,4,3]
```

**Example 2**:

```
Input: head = []
Output: []
```

**Example 3**:

```
Input: head = [1]
Output: [1]
```

**Constraints**:

- The number of nodes in the list is in the range [0, 100].
- 0 <= `Node.val` <= 100

**Follow up**: Can you solve the problem without modifying the values in the list's nodes? (i.e., Only nodes themselves may be changed.)

## Analysis

方法一：迭代，两节点互换值val。

方法二：递归，连接点互换。


## Code

[Source Code](../../src/main/java/com/lun/medium/SwapNodesInPairs.java)

[Test Code](../../src/test/java/com/lun/medium/SwapNodesInPairsTest.java)

