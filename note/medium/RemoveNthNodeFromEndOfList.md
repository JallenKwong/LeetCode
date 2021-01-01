# RemoveNthNodeFromEndOfList

## Topic

- Linked List
- Two Pointers

## Description

[https://leetcode.com/problems/remove-nth-node-from-end-of-list/](https://leetcode.com/problems/remove-nth-node-from-end-of-list/)

Given the `head` of a linked list, remove the `n th` node from the end of the list and return its head.

**Follow up**: Could you do this in one pass?

**Example 1**:

```

1 -> 2 -> 3 -> 4 -> 5

remove the second node from the end of the list

1 -> 2 -> 3 -> 5

Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
```

**Example 2**:

```
Input: head = [1], n = 1
Output: []
```

**Example 3**:

```
Input: head = [1,2], n = 1
Output: [1]
```

**Constraints**:

- The number of nodes in the list is sz.
- 1 <= sz <= 30
- 0 <= Node.val <= 100
- 1 <= n <= sz

## Analysis

方法一：我写的。

1. 指针a，b指向链头，然后b移动n步。
2. b移动n步后，a、b指针齐步移，直到b指向Null。
3. 移除a所指向节点。
4. 返回链头。

方法二：别人写的，思路与方法一的相同。

## Code

[Source Code](../../src/main/java/com/lun/medium/RemoveNthNodeFromEndOfList.java)

[Test Code](../../src/test/java/com/lun/medium/RemoveNthNodeFromEndOfListTest.java)

