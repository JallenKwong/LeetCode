# FindTheDuplicateNumber #

## Topic

- Array
- Two Pointers
- Binary Search

## Description

[https://leetcode.com/problems/find-the-duplicate-number/](https://leetcode.com/problems/find-the-duplicate-number/)

Given an array of integers `nums` containing `n + 1` integers where each integer is in the range `[1, n]` inclusive.

There is only `one duplicate number` in nums, return this duplicate number.

**Follow-ups**:

- How can we prove that at least one duplicate number must exist in `nums`? 
- Can you solve the problem **without** modifying the array `nums`?
- Can you solve the problem using only constant, `O(1)` extra space?
- Can you solve the problem with runtime complexity less than `O(n²)`?


**Example 1**:

```
Input: nums = [1,3,4,2,2]
Output: 2
```

**Example 2**:

```
Input: nums = [3,1,3,4,2]
Output: 3
```

**Example 3**:

```
Input: nums = [1,1]
Output: 1
```

**Example 4**:

```
Input: nums = [1,1,2]
Output: 1
```

**Constraints**:

- 2 <= n <= 3 * 10⁴
- nums.length == n + 1
- 1 <= nums[i] <= n
- All the integers in nums appear only **once** except for **precisely one integer** which appears **two or more** times.

## Analysis

方法一：归位法，遍历数组，将数值转移到与下标相等的位置，若发现该下标位置的数已有与下标相等的数，则返回该下标值。该法的**副作用**是修改了数组内容。

---

方法二：将该问题转换成[Linked List Cycle II](https://leetcode.com/problems/linked-list-cycle-ii/)。在脑里，将数组转换成链表形式，也就是从下标0开始，下标为0的元素则是链表的头节点的值，接着头节点的值为下标，从数组得出下一节点的值，以此类推，最后会得出带有环的链表。这样方便理解，如符合题意要求的数组：

0|1|2|3|4
---|---|---|---|---
1|3|4|2|3

转换成的链表：

```
     ┌─────────┐
     ↓         |
1 -> 3 -> 2 -> 4
```

链表中环的入口节点的数值则是题目要求的重复值。接着快慢双指针求出这个值。

---

方法三：二分查找

At first the search space is numbers between 1 to n. Each time I select a number `mid` (which is the one in the middle) and `count` all the numbers equal to or less than `mid`. Then if the count is more than mid, the search space will be `[1, mid]` otherwise `[mid+1, n]`. I do this until search space is only one number.

Let's say `n=10` and I select `mid=5`. Then I count all the numbers in the array which are **less than equal (<=)** mid. If the there are more than 5 numbers and other are less than 5, then by Pigeonhole Principle (https://en.wikipedia.org/wiki/Pigeonhole_principle) one of them has occurred more than once. So I shrink the search space from [1,10] to [1,5] (count >= mid, the duplicate number is in [1,5]). Otherwise the duplicate number is in the second half so for the next step the search space would be [6, 10].


## Code

[Source Code](FindTheDuplicateNumber.java)

[Test Code](../../../../../test/java/com/lun/easy/FindTheDuplicateNumberTest.java)

