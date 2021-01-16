# IntersectionOfTwoArrays

## Topic

- Hash Table
- Two Pointers
- Binary Search
- Sort

## Description

[https://leetcode.com/problems/intersection-of-two-arrays/](https://leetcode.com/problems/intersection-of-two-arrays/)

Given two arrays, write a function to compute their intersection.

**Example 1**:

```
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
```

**Example 2**:

```
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
```

**Note**:

- Each element in the result must be unique.
- The result can be in any order.

## Analysis

方法一：我写的，使用Java8的特性

方法二：set的retainAll方法

方法三：传统做法

方法四：使用Java8的特性，比方法一更精简

方法五：位图法

还有其他方法，如，将实参的两数组分别排序，然后用双指针，或二分查找寻找出共同元素。


## Code

[Source Code](../../src/main/java/com/lun/easy/IntersectionOfTwoArrays.java)

[Test Code](../../src/test/java/com/lun/easy/IntersectionOfTwoArraysTest.java)

