# SearchInRotatedSortedArray

## Topic

- Array
- Binary Search

## Description

[https://leetcode.com/problems/search-in-rotated-sorted-array/](https://leetcode.com/problems/search-in-rotated-sorted-array/)

You are given an integer array `nums` sorted in ascending order (with **distinct** values), and an integer `target`.

Suppose that `nums` is rotated at some pivot unknown to you beforehand (i.e., `[0,1,2,4,5,6,7]` might become `[4,5,6,7,0,1,2]`).

If `target` is found in the array return its index, otherwise, return `-1`.


**Example 1**:

```
Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
```

**Example 2**:

```
Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
```

**Example 3**:

```
Input: nums = [1], target = 0
Output: -1
```

**Constraints**:

- `1 <= nums.length <= 5000`
- `-10⁴ <= nums[i] <= 10⁴`
- All values of `nums` are **unique**.
- `nums` is guaranteed to be rotated at some pivot.
- `-10⁴ <= target <= 10⁴`

## Analysis

方法一：我写的，先用二分法找出原第一元素，然后以原第一元素将数组一分为二，根据target与边界值比较，决定在其中之一数组再用二分查找出target。

---

方法二：The main idea is that we need to find some parts of array that we could adopt binary search on that, **which means we need to find some completed sorted parts**, then determine whether target is in left part or right part. There is at least one segment (left part or right part) is **continuously monotonously increasing**连续单调递增.

![](https://image.ibb.co/n3kcgV/IMG-0145.jpg)

- If the entire left part is continuously monotonically increasing, which means the pivot point is on the right part
	- If left <= target < mid ------> drop the right half
	- Else ------> drop the left half
- If the entire right part is continuously monotonically increasing, which means the pivot point is on the left part
	- If mid < target <= right ------> drop the left half
	- Else ------> drop the right half

---

方法三：

二分查找一次循环过程

```
target:0     nums:[4, 5, 6, 7, 0, 1, 2]

left     mid        right
|        |          |
4, 5, 6, 7,   0, 1, 2
              |
              target

After comparing nums[0]:4, target<4 and nums[mid]>4 are not on the same side.
Temporily change nums[mid] to -INF.(target:0 < nums[0]:4 ? -INF : INF)

left       mid         right
|          |           |
4, 5, 6, -INF,   0, 1, 2
                 |
                 target

nums[mid]:-INF < target:0, left is changed to mid+1.

                left=mid+1
           mid   |     right
           |     |     |
4, 5, 6, -INF,   0, 1, 2
                 |
                 target

finish 1 loop
```

修改成-INF或INF并不是真正修改数组元素，它只是暂时替换，它的目的主要是让二分查找能在这旋转数组做真正的二分查找。（结合代码理解这句话）

---

方法四：首先，用二分查找找出最小元素值的下标`minValueIndex`，然后，得出用原递增数组下标与旋转后数组下标之间映射关系`RIndex = (OIndex + minValueIndex) % arrayLeagth`，这样就可正常用二分查找算法找出目标下标。

```
一个例子：

Rotated Sorted Array(RSA)
RSA:[3, 4, 5, 6, 7, 0, 1, 2]

最小元素值为rsa[5]：0，minValueIndex：5

---

Original Sorted Array(OSA)（这里故意让元素及其下标相等，方便理解）。
OSA:[0, 1, 2, 3, 4, 5, 6, 7]
     |        |           |
     left     mid         right

idx  0  1  2  3  4  5  6  7
RSA:[3, 4, 5, 6, 7, 0, 1, 2]

例如，OSA元素3（下标也为3）的对应在下标RSA的下标为：
RIndex = (OIndex + minValueIndex) % arrayLeagth = (3 + 5) % 8 = 0
```

这样的话我们可以直接地用二分查找，间接找出target。

## Code

[Source Code](../../src/main/java/com/lun/medium/SearchInRotatedSortedArray.java)

[Test Code](../../src/test/java/com/lun/medium/SearchInRotatedSortedArrayTest.java)

