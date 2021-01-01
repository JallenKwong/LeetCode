# ContainsDuplicateII

## Topic

- Array
- Hash Table
- Sliding Window

## Description

[https://leetcode.com/problems/contains-duplicate-ii/](https://leetcode.com/problems/contains-duplicate-ii/)

Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that **nums[i] = nums[j]** and the **absolute** difference between i and j is at most k.

**Example 1**:

```
Input: nums = [1,2,3,1], k = 3
Output: true
```

**Example 2**:

```
Input: nums = [1,0,1,1], k = 1
Output: true
```

**Example 3**:

```
Input: nums = [1,2,3,1,2,3], k = 2
Output: false
```

## Analysis

方法一：使用HashMap。

方法二：比方法一精简些。

方法三：使用HashSet作移动窗口。

It iterates over the array using a **sliding window**. The front of the window is at `i`, the rear of the window is `k` steps back. The elements within that window are maintained using a `Set`. While adding new element to the set, if `add()` returns `false`, it means the element already exists in the set. At that point, we return `true`. If the control reaches out of for loop, it means that inner `return true` never executed, meaning no such duplicate element was found.


## Code

[Source Code](../../src/main/java/com/lun/easy/ContainsDuplicateII.java)

[Test Code](../../src/test/java/com/lun/easy/ContainsDuplicateIITest.java)

