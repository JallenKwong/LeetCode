# ReverseNodesInKGroup

## Topic

- Linked List

## Description

[https://leetcode.com/problems/reverse-nodes-in-k-group/](https://leetcode.com/problems/reverse-nodes-in-k-group/)

Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.

k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.

**Follow up**:

- Could you solve the problem in `O(1)` extra memory space?
- You may not alter the values in the list's nodes, only nodes itself may be changed.

**Example 1**:

![](https://assets.leetcode.com/uploads/2020/10/03/reverse_ex1.jpg)

```
Input: head = [1,2,3,4,5], k = 2
Output: [2,1,4,3,5]
```

**Example 2**:

![](https://assets.leetcode.com/uploads/2020/10/03/reverse_ex2.jpg)

```
Input: head = [1,2,3,4,5], k = 3
Output: [3,2,1,4,5]
```

**Example 3**:

```
Input: head = [1,2,3,4,5], k = 1
Output: [1,2,3,4,5]
```

**Example 4**:

```
Input: head = [1], k = 1
Output: [1]
```

**Constraints**:

- The number of nodes in the list is in the range `sz`.
- `1 <= sz <= 5000`
- `0 <= Node.val <= 1000`
- `1 <= k <= sz`

## Analysis

方法一：递归法，简洁但空杂不是O(1)。

方法二：迭代法，复杂但空杂是O(1)（用了一堆指针，正是个针线活）

TODO:插入草图

## Code

[Source Code](../../src/main/java/com/lun/hard/ReverseNodesInKGroup.java)

[Test Code](../../src/test/java/com/lun/hard/ReverseNodesInKGroupTest.java)

