# MoveZeroes

## Topic

- Array
- Two Pointers

## Description

[https://leetcode.com/problems/move-zeroes/](https://leetcode.com/problems/move-zeroes/)

Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

**Example**:

```
Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
```

**Note**:

1. You must do this in-place without making a copy of the array.
2. Minimize the total number of operations.

## Analysis

方法一：从尾向前遍历，如果是0移到尾后，而后的元素向移位。

方法二：滚雪球法。

---

这题我轻视了，耗了不少时间。

## Code

[Source Code](../../src/main/java/com/lun/easy/MoveZeroes.java)

[Test Code](../../src/test/java/com/lun/easy/MoveZeroesTest.java)

