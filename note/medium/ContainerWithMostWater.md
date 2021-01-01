# ContainerWithMostWater

## Topic

- Array
- Two Pointers

## Description

[https://leetcode.com/problems/container-with-most-water/](https://leetcode.com/problems/container-with-most-water/)

Given `n` non-negative integers `a1, a2, ..., an` , where each represents a point at coordinate `(i, ai)`. n vertical lines are drawn such that the two endpoints of the line `i` is at `(i, ai)` and `(i, 0)`. Find two lines, which, together with the x-axis forms a container, such that the container contains the most water.

**Notice** that you may not slant the container.


**Example 1**:

![](image/ContainerWithMostWater.jpg)

```
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
```

**Example 2**:

```
Input: height = [1,1]
Output: 1
```

**Example 3**:

```
Input: height = [4,3,2,1,4]
Output: 16
```

**Example 4**:

```
Input: height = [1,2,1]
Output: 2
```

**Constraints**:

- n = height.length
- 2 <= n <= 3 * 10⁴
- 0 <= height[i] <= 3 * 10⁴

## Analysis

方法一：暴力算法

---

方法二：双指针算法

The max area is calculated by the following formula:

```
S = (j - i) * min(ai, aj)
```

We should choose (i, j) so that S is max. Note that `i, j` go through the range (1, n) and j > i. That's it.

The simple way is to take all possibilities of (i, j) and compare all obtained S. The time complexity is `n * (n-1) / 2`.（暴力算法）

**What we gonna do is to choose all possibilities of (i, j) in a wise way**. I noticed that many submitted solutions here can't explain why when :

- `ai < aj` we will check the next `(i+1, j)` (or move i to the right)
- `ai >= aj` we will check the next `(i, j-1)` (or move j to the left)

（也就是保留两者中最大的下标，移动最小值的下标（i的向右移动，j的向左移动））

Here is the explaination for that:

- When `ai < aj` , we don't need to calculate all `(i, j-1)`, `(i, j-2)`, .... Why? because these max areas are smaller than our S at `(i, j)`

Assume at `(i, j-1)` we have

```
ai < aj
S = (j - i) * min(ai, aj) = (j - i) * ai

if aj-1 >= ai
S' = (j - 1 - i) * min(ai, aj-1) = (j - 1 - i) * ai
S > S'

if aj-1 < ai
S' = (j - 1 - i) * min(ai, aj-1) = (j - 1 - i) * aj-1
S > S'

So no matter aj-1 >= ai or aj-1 < ai，S' < S always true
```

we don't need to calculate Similar at `(i, j-2)`, `(i, j-3)`, etc.

So, that's why when `ai < aj`, we should check the next at `(i+1, j)` (or move i to the right)

- When `ai >= aj`, the same thing, all `(i+1, j)`, `(i+2, j)`, .... are not needed to calculate.

```
ai >= aj
S = (j - i) * min(ai, aj) = (j - i) * aj

if ai+1 >= aj
S' = (j - (i + 1)) * min(ai+1, aj)
< (j - i - 1) * aj
S' < S

if ai+1 < aj
S' = (j - (i + 1)) * min(ai+1, aj)
< (j - i - 1) * ai+1
S' < S

So no matter ai+1 >= aj or ai+1 < aj，S' < S always true
```

We should check the next at `(i, j-1)` (or move j to the left)

**似非而是的解法**。

## Code

[Source Code](../../src/main/java/com/lun/medium/ContainerWithMostWater.java)

[Test Code](../../src/test/java/com/lun/medium/ContainerWithMostWaterTest.java)

