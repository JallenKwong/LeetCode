# RemoveDuplicatesFromSortedList #

## Topic

Linked List, Two Pointers

## Description

[https://leetcode.com/problems/remove-duplicates-from-sorted-list/](https://leetcode.com/problems/remove-duplicates-from-sorted-list/)

Given a sorted linked list, delete all duplicates such that each element appear only once.

**Example 1**:

```
Input: 1->1->2
Output: 1->2
```

**Example 2**:

```
Input: 1->1->2->3->3
Output: 1->2->3
```

## Analysis

方法一：逐个扫描，重复节点的逐个移除

方法二：将不重复的值，替换重复的值

方法三：递归法。方法一、二是从链头开始的，而本法从**链尾**开始处。


## Code

[Source Code](RemoveDuplicatesFromSortedList.java)

[Test Code](../../../../../test/java/com/lun/easy/RemoveDuplicatesFromSortedListTest.java)

