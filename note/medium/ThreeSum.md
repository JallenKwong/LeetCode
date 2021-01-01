# ThreeSum

## Topic

- Array
- Two Pointers

## Description

[https://leetcode.com/problems/3sum/](https://leetcode.com/problems/3sum/)

Given an array `nums` of n integers, are there elements a, b, c in `nums` such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Notice that the solution set must not contain duplicate triplets.


**Example 1**:

```
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
```

**Example 2**:

```
Input: nums = []
Output: []
```

**Example 3**:

```
Input: nums = [0]
Output: []
```

Constraints:

- 0 <= nums.length <= 3000
- -10⁵ <= nums[i] <= 10⁵

## Analysis

方法一：

1. 首先将数组从左到右升序排序。
2. 接下来动用三个指针，用一指针a先固定一元素，然后指针b初始位置为a的右一位，指针c初始位置数组尾元素，
3. b、c两指针向中间夹逼寻找出这两指针所指元素之和等于a指针所指元素 * -1，期间忽略重复元素，寻找到则将结果添加至List。
4. 当b、c两指针相遇，指针a向右移动一位，跳到步骤2.，直到指针a移动到数组倒数第二位。

方法二：与方法一类似，用到Set去重。

方法三：在方法一的基础上，进一步完善：

1. 方法体内第一句后添加防御性代码`if (nums.length < 3) return res;`。
2. for循环中第一语句前插入一句`if (nums[i] > 0) break;`。这是因为数组已经是从左到右升序的，如果第一个数大于0，就不可能在接下来的元素中寻找出两元素之和小于0的。
3. 将`if (i == 0 || (i > 0 && num[i] != num[i-1]))`中的`i > 0`是不必要的，将其移除。

## Code

[Source Code](../../src/main/java/com/lun/medium/ThreeSum.java)

[Test Code](../../src/test/java/com/lun/medium/ThreeSumTest.java)

