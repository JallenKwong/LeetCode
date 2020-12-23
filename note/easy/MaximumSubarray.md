# MaximumSubarray #

## Topic

Array, Divede and Conquer, Dynamic Programming

## Description

[https://leetcode.com/problems/maximum-subarray/](https://leetcode.com/problems/maximum-subarray/)

Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

**Follow up**: If you have figured out the O(n) solution, try coding another solution using the **divide and conquer** approach, which is more subtle.

**Example 1**:

```
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
```

**Example 2**:

```
Input: nums = [1]
Output: 1
```

**Example 3**:

```
Input: nums = [0]
Output: 0
```

**Example 4**:

```
Input: nums = [-1]
Output: -1
```

**Example 5**:

```
Input: nums = [-2147483647]
Output: -2147483647
```

**Constraints**:

- 1 <= nums.length <= 2 * 10⁴
- -2³¹ <= nums[i] <= 2³¹ - 1

## Analysis

### 方法一：暴力算法

双指针下标之内求和，求最大值

### 方法二：前人肩膀

this problem was discussed by Jon Bentley (Sep. 1984 Vol. 27 No. 9 Communications of the ACM P885)

the paragraph below was copied from his paper (with a little modifications)

algorithm that operates on arrays: it starts at the left end (element A[1]) and scans through to the right end (element A[n]), keeping track of the maximum sum subvector seen so far. The maximum is initially A[0].

Suppose we've solved the problem for A[1 .. i - 1]; how can we extend that to A[1 .. i]? The maximum sum in the first I elements is either the maximum sum in the first i - 1 elements (which we'll call MaxSoFar), or it is that of a subvector that ends in position i (which we'll call MaxEndingHere).

MaxEndingHere is either A[i] plus the previous MaxEndingHere, or just A[i], whichever is larger.

<a href="https://leetcode.com/problems/maximum-subarray/discuss/20211/Accepted-O\(n\)-solution-in-java">link</a>


### 方法三：分而治之

该方法采用一种“分治divide-and-conquer”策略，也就是把一个问题分成两个大致相等的子问题，然后递归地对它们求解，这是“分”部分。“治”阶段将两个子问题的解合到一起并可能再做少量的附加工作，最后得到整个问题的解。

最大子序列和只可能出现在三处：左半部分、右半部分、跨越并穿过中间而占据左右两半部分。前两种情况可以递归求解，第三部分的最大和可以通过求出前半部分的最大和（包括前半部分最后一个元素）以及后半部分的最大和（包括后半部分第一个元素）而得到，然后将这两个和加在一起。该算法时间复杂度O(NlogN)。

前半部分|后半部分
---|---
4  -3  5  -2|-1  2  6  -2

其中前半部分的最大子序列和为6（从元素A0到A2）而后半部分的最大子序列和为8（从元素A5到A6）。

前半部分包含其最后一个元素的最大和是4（从元素A0到A3），而后半部分包含其第一个元素的最大和是7（从元素A4到A6）。因此，跨越这两部分且通过中间的最大和为 4+7=11（从元素A0到A6）。

[更多说明参阅《数据结构与算法分析—C语言描述 2nd》Page19](#)

### 方法四：深藏功名

The catch here is that we have to **take care of negative value**.The solution does 1 iteration with constant space and no DP.

<a href="https://leetcode.com/problems/maximum-subarray/discuss/20210/O(n)-Java-solution">link</a>

与方法二类似。

## Code

[Source Code](MaximumSubarray.java)

[Test Code](MaximumSubarrayTest.java)

