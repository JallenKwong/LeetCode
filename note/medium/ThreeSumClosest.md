# ThreeSumClosest

## Topic

- Array
- Two Pointers

## Description

[https://leetcode.com/problems/3sum-closest/](https://leetcode.com/problems/3sum-closest/)

Given an array nums of n integers and an integer target, find three integers in nums such that the sum is closest to target. Return the sum of the three integers. You may assume that each input would have exactly one solution.

**Example 1**:

```
Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
```

**Constraints**:

- 3 <= nums.length <= 10³
- -10³ <= nums[i] <= 10³
- -10⁴ <= target <= 10⁴

## Analysis

方法一：我写的，受到[LeetCode - Medium - 15. 3Sum](#)启发而写，幸运成功地成功验收。与方法二相比，代码中的相关跳过重复元素意义的代码是可以去掉的。

方法二：别人写的。比方法一精简了不少。


## Code

[Source Code](../../src/main/java/com/lun/medium/ThreeSumClosest.java)

[Test Code](../../src/test/java/com/lun/medium/ThreeSumClosestTest.java)

