# MedianOfTwoSortedArrays

## Topic

- Array
- Binary Search
- Divide and Conquer

## Description

[https://leetcode.com/problems/median-of-two-sorted-arrays/](https://leetcode.com/problems/median-of-two-sorted-arrays/)

Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

**Follow up**: The overall run time complexity should be O(log (m+n)).

**Example 1**:

```
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
```

**Example 2**:

```
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
```

**Example 3**:

```
Input: nums1 = [0,0], nums2 = [0,0]
Output: 0.00000
```

**Example 4**:

```
Input: nums1 = [], nums2 = [1]
Output: 1.00000
```

**Example 5**:

```
Input: nums1 = [2], nums2 = []
Output: 2.00000
```

**Constraints**:

- nums1.length == m
- nums2.length == n
- 0 <= m <= 1000
- 0 <= n <= 1000
- 1 <= m + n <= 2000
- -10⁶ <= nums1[i], nums2[i] <= 10⁶

## Analysis

### 概述

[解答来源：知乎 - LeetCode#4. 寻找两个有序数组的中位数](https://zhuanlan.zhihu.com/p/70654378)

要解决这个问题，我们需要先理解“中位数有什么用？”。在统计学中，中位数用于**将集合划分为两个相等长度的子集，一个子集总是大于另一个子集**。如果我们理解了中位数对集合的划分，我们就非常接近答案了。

### 原理

首先，在一个随机的位置 `aCut` 将集合 A 划分为两部分。

```
              left_A             |           right_A
_0 A[0] _1 A[1] ... A[aCut-1] _aCut A[aCut] _aCut+1 A[aCut+1] ... A[aLength-1] _aLength
```

由于A有`aLength`个元素，所以就有`aLength+1` 种分法（`i=0~aLength`）（在元素之间划分，包括头尾位置，也就是上面带下划线的位置）。由此可知： `len(left_A) = aCut`, `len(right_A) = aLength - aCut`。注意：当`aCut = 0`时，left_A为空，而当`aCut = aLength`时，right_A为空。

类似的，在位置 `bCut` 将集合 B 划分为两部分。：

```
             left_B              |           right_B
_0 B[0] _1 B[1] ... B[bCut-1] _bCut B[bCut] _bCut+1 B[bCut+1] ... B[bLength-1] _bLength
```


将 left_A 和 left_B 放入同一个集合，将 right_A 和 right_B 放入另外一个集合。 分别称他们为 left_part 和 right_part ：

```
         left_part          |        right_part
A[0], A[1], ..., A[aCut-1]  |  A[aCut], A[aCut+1], ..., A[aLength-1]
B[0], B[1], ..., B[bCut-1]  |  B[bCut], B[bCut+1], ..., B[bLength-1]
```

如果我们能达成这两个条件：

1. `len(left_part) == len(right_part)`
2. `max(left_part) <= min(right_part)`

我们就能将 {A, B} 中所有元素分成两个长度相等的部分，并且其中一个部分总是大于另外一个部分。那么中位数就是 `median = (max(left_part) + min(right_part))/2`。

为了达成这两个条件，我们**只需要确保**：

1. `aCut + bCut == aLength - aCut + bLength - bCut (or: aLength - aCut + bLength - bCut  + 1)` 即让左半边元素数量等于与右半边。对于 `aLength <= bLength` 的情况，我们只需要让 : `aCut = 0 ~ aLength`, `bCut = (aLength + bLength + 1) / 2 - aCut`。（如果`aLength > bLength`为真怎么办？就把两个数组对换）
2. `B[bCut-1] <= A[aCut]` 并且 `A[aCut-1] <= B[bCut]`  即让左边最大元素小于右边最小元素。

PS.

1. 简单起见，我们先假设 `A[aCut-1], B[bCut-1], A[aCut], B[bCut]` 总是可用的，即使 `aCut=0，aCut=aLength，bCut=0，bCut=bLength` 。 后面会叙述怎么处理这些边缘情况。

2. 为何 `aLength <= bLength`？ 因为我必须确保 `bCut` 是非负的，因为 `0 <= aCut <= aLength` 并且 `bCut = (aLength + bLength + 1) / 2 - aCut`。 如果 `aLength > bLength` ， 则 `bCut` 可能是负值， 这将导致错误的结果。（如果真的`aLength > bLength`怎么办？就把两个数组对换）。

因此，**我们需要做的就是**：

在 `[0, aLength]` 中找到一个使下面不等式成立的 `aCut` :

`B[bCut-1] <= A[aCut] and A[aCut-1] <= B[bCut], ( where bCut = (aLength + bLength + 1) / 2 - aCut )`

### 伪代码

我们可以按照下面描述的步骤进行二分查找：

```
1. 设 aCutMin = 0, aCutMax = aLength, 然后在这个区间 [aCutMin, aCutMax] 中查找 aCut

2. 设 aCut = (aCutMin + aCutMax) / 2, bCut = (aLength + bLength + 1) / 2 - aCut

3. 此时，我们满足了 len(left_part)==len(right_part)， 我们会遇到三种情况：

	a. B[bCut-1] <= A[aCut] and A[aCut-1] <= B[bCut]
		- 说明我们找到了我们需要的aCut，停止搜索。

	b. B[bCut-1] > A[aCut]
		- 意味着 A[aCut] 太小， 那么我们必须调整 aCut 以使 B[bCut-1] <= A[aCut] 仍然成立。

		- 我们可以增大aCut吗？
			- Yes. 因为 aCut 增大时， bCut 将减小。（bCut↓ = (aLength + bLength + 1) / 2 - aCut↑）
			- 所以 B[bCut-1] 跟着减小而 A[aCut] 会增大。B[bCut-1] <= A[aCut]就可能成立。

		- 我们可以减小 aCut 吗？
			- No!  因为 aCut 减小时， bCut 将增大。（bCut↑ = (aLength + bLength + 1) / 2 - aCut↓）
			- 所以 B[bCut-1] 增大而 A[aCut] 减小。B[bCut-1] <= A[aCut] 永远不可能成立。

		- 所以我们必须增加 aCut。也就是将搜索范围调整为[aCut+1, aCutMax]。 所以，设 aCutMin = aCut+1, 然后回到步骤 2。

	c. A[aCut-1] > B[bCut]
		- 意味着 A[aCut-1] 太大。我们必须减小 aCut 以使 `A[aCut-1]<=B[bCut]`.

		- 就是说我们要调整搜索范围为 [aCutMin, aCut-1]。

		- 所以， 设 aCutMax = aCut-1, 然后回到步骤 2。
```

找到符合条件的 `aCut` 之后，我们想要的中位数就是：

- 如果`aLength + bLength`是**奇数**，中位数则是`max(A[aCut-1], B[bCut-1])`。
- 如果`aLength + bLength`是**偶数**，中位数则是`(max(A[aCut-1], B[bCut-1]) + min(A[aCut], B[bCut]))/2`。

### 边界问题

**现在让我们考虑边缘值**`aCut=0，aCut=aLength，bCut=0，bCut=bLength`，其中`A[aCut-1]，B[bCut-1]，A[aCut]，B[bCut]`可能不存在。 实际上这种情况比你想象的要容易。

我们需要做的是确保 `max(left_part) <= min(right_part)`。 所以， 如果 aCut 和 bCut 不是边缘值(意味着`A[aCut-1]，B[bCut-1]，A[aCut]，B[bCut]` 都**存在**)， 那么我们必须同时检查 `B[bCut-1] <= A[aCut] and A[aCut-1] <= B[bCut]`。

但是如果 `A[aCut-1]，B[bCut-1]，A[aCut]，B[bCut]` 中某些值**不存在**， 那么我们可以只检查一个条件（甚至都不检查）。例如， 如果 `aCut=0`， 那么 `A[aCut-1]` 不存在， 也就意味着我们不用检查 `A[aCut-1] <= B[j]`。 所以，我们这样做：

```
在 [0, aLength] 中找到一个使下面不等式成立的 aCut :
    (bCut == 0 or aCut == aLength or B[bCut-1] <= A[aCut]) and
    (aCut == 0 or bCut == n or A[aCut-1] <= B[bCut])
    where bCut = (aLength + bLength + 1) / 2 - aCut
```

在搜索循环中，我们只会遇到三种情况：

```
1. (bCut == 0 or aCut == aLength or B[bCut-1] <= A[aCut]) and
    (aCut == 0 or bCut == n or A[aCut-1] <= B[bCut])
    说明 i 的值满足要求，停止循环

2. bCut > 0 and aCut < aLength and B[bCut - 1] > A[aCut]
    说明 aCut 的值太小， 增加它.

3. aCut > 0 and bCut < bLength and A[aCut - 1] > B[bCut]
    说明 aCut 的值过大， 减小它。
```

其实 `aCut < aLength ==> bCut > 0` 和 `aCut > 0 ==> bCut < bLength` . 因为：

```
aLength <= bLength, aCut < aLength
==> bCut = (aLength + bLength + 1) / 2 - aCut
> (aLength + bLength + 1) / 2 - aLength
>= (2 * aLength + 1) / 2 - aLength
>= 0

aLength <= bLength, aCut > 0
==> bCut = (aLength + bLength + 1) / 2 - aCut
< (aLength + bLength + 1) / 2
<= (2 * bLength + 1) / 2
<= bLength
```

所以对于上述情况2. 和 3.， 我们不需要检查`bCut > 0` 和 `bCut < n`是否满足。

## Code

[Source Code](../../src/main/java/com/lun/hard/MedianOfTwoSortedArrays.java)

[Test Code](../../src/test/java/com/lun/hard/MedianOfTwoSortedArraysTest.java)

