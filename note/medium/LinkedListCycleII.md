# LinkedListCycleII #

## Topic

- Linked List
- Two Pointers
- Math

## Description

[https://leetcode.com/problems/linked-list-cycle-ii/](https://leetcode.com/problems/linked-list-cycle-ii/)

Given a linked list, return the node where the cycle begins. If there is no cycle, return null.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. **Note that** pos **is not passed as a parameter**.

**Notice** that you **should not modify** the linked list.


**Example 1**:

![](image/circularlinkedlist.png)

```
Input: head = [3,2,0,-4], pos = 1
Output: tail connects to node index 1
Explanation: There is a cycle in the linked list, where tail connects to the second node.
```

**Example 2**:

![](image/circularlinkedlist_test2.png)

```
Input: head = [1,2], pos = 0
Output: tail connects to node index 0
Explanation: There is a cycle in the linked list, where tail connects to the first node.
```

**Example 3**:

![](image/circularlinkedlist_test3.png)

```
Input: head = [1], pos = -1
Output: no cycle
Explanation: There is no cycle in the linked list.
```

**Constraints**:

- The number of the nodes in the list is in the range [0, 104].
- -10⁵ <= Node.val <= 10⁵
- pos is -1 or a valid index in the linked-list.

## Analysis

方法一：《剑指Offer》No.23的解法

1. 查 - 查看是否存在环，有环的得出快慢指针相遇时所处在节点，进行下一步，没环的直接返回。这用到快慢双指针算法，具体内容可查看[LeetCode - Easy - 141. Linked List Cycle](#)。
2. 量 - 测量环节点个数n。
3. 走 - 双指针指向头指针，一指针先走n步，然后两指针齐步走，两指针相等的位置，则环的入口点。

---

方法二：LeetCode优秀的回答

When fast and slow meet at point p, the length they have run are 'a+2b+c' and 'a+b'.

Since the fast is 2 times faster than the slow. So a+2b+c == 2(a+b), then we get 'a==c'.

So when another slow2 pointer run from head to 'q', at the same time, previous slow pointer will run from 'p' to 'q', so they meet at the pointer 'q' together.

## Code

[Source Code](LinkedListCycleII.java)

[Test Code](../../../../../test/java/com/lun/easy/LinkedListCycleIITest.java)

