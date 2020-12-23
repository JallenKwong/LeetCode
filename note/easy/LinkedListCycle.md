# LinkedListCycle #

## Topic

- Two Pointers
- Linked List

## Description

[https://leetcode.com/problems/linked-list-cycle/](https://leetcode.com/problems/linked-list-cycle/)

Given `head`, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the `next` pointer. Internally, `pos` is used to denote the index of the node that tail's `next` pointer is connected to. **Note that `pos` is not passed as a parameter**.

Return `true` if there is a cycle in the linked list. Otherwise, return `false`.

**Example 1**:

![](image/circularlinkedlist.png)

```
Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
```

**Example 2**:

![](image/circularlinkedlist_test2.png)

```
Input: head = [1,2], pos = 0
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.
```

**Example 3**:

![](image/circularlinkedlist_test3.png)

```
Input: head = [1], pos = -1
Output: false
Explanation: There is no cycle in the linked list.
```

**Constraints**:

- The number of the nodes in the list is in the range [0, 10⁴].
- -10⁵ <= Node.val <= 10⁵
- pos is -1 or a valid index in the linked-list.


**Follow up**: Can you solve it using O(1) (i.e. constant) memory?


## Analysis

方法一：我写的方法

两指针p1、p2，每次循环中，p1走1步，p2走1步，再走1步，其间判断p1、p2是否相等。若相等，则链有环。若p2为null，则没有。


---

方法二：别人写的方法

1. Use two pointers, walker and runner.
2. walker moves step by step. runner moves two steps at time.
3. if the Linked List has a cycle walker and runner will meet at some point.


## Code

[Source Code](LinkedListCycle.java)

[Test Code](../../../../../test/java/com/lun/easy/LinkedListCycleTest.java)

