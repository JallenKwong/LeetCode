# FourSum

## Topic

- Array
- Hash Table
- Two Pointers

## Description

[https://leetcode.com/problems/4sum/](https://leetcode.com/problems/4sum/)

Given an array `nums` of n integers and an integer `target`, are there elements a, b, c, and d in `nums` such that a + b + c + d = `target`? Find all unique quadruplets in the array which gives the sum of target.

**Notice** that the solution set must not contain duplicate quadruplets.

**Example 1**:

```
Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
```

**Example 2**:

```
Input: nums = [], target = 0
Output: []
```

**Constraints**:

- 0 <= nums.length <= 200
- -10⁹ <= nums[i] <= 10⁹
- -10⁹ <= target <= 10⁹


## Analysis

**General Idea**
If you have already read and implement the 3sum and 4sum by using the sorting approach: reduce them into 2sum at the end, you might already got the feeling that, all ksum problem can be divided into two problems:

1. 2sum Problem
2. Reduce K sum problem to K – 1 sum Problem

Therefore, the ideas is simple and straightforward. We could use recursive to solve this problem. Time complexity is O(N^(K-1)).

## Code

[Source Code](../../src/main/java/com/lun/medium/FourSum.java)

[Test Code](../../src/test/java/com/lun/medium/FourSumTest.java)

