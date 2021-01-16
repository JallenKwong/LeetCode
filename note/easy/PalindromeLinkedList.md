# PalindromeLinkedList

## Topic

- Linked List
- Two Pointers

## Description

[https://leetcode.com/problems/palindrome-linked-list/](https://leetcode.com/problems/palindrome-linked-list/)

Given a singly linked list, determine if it is a palindrome.

**Example 1**:
```
Input: 1->2
Output: false
```

**Example 2**:
```
Input: 1->2->2->1
Output: true
```

**Follow up**:

Could you do it in O(n) time and O(1) space?

## Analysis

方法一：我写的，双指针。由于是单向链表而不是双向链表，其中一指针要反复横跳。时杂O(N²)，空杂O(1)。

方法二：使用栈。时杂O(N)，空杂O(N)。

方法三：递归。时杂O(N)，空杂O(N)。

方法四：双指针，反转链表的半部分，这会修改原链表结构。时杂O(N)，空杂O(1)。

## Code

[Source Code](../../src/main/java/com/lun/easy/PalindromeLinkedList.java)

[Test Code](../../src/test/java/com/lun/easy/PalindromeLinkedListTest.java)

