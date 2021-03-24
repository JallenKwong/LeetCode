# ValidPerfectSquare #

## Topic

- Binary Search
- Math

## Description

[https://leetcode.com/problems/valid-perfect-square/](https://leetcode.com/problems/valid-perfect-square/)

Given a **positive** integer num, write a function which returns True if num is a perfect square else False.

**Follow up**: Do not use any built-in library function such as `sqrt`.

**Example 1**:

```
Input: num = 16
Output: true
```

**Example 2**:

```
Input: num = 14
Output: false
```

**Constraints**:

- 1 <= num <= 2³¹ - 1

## Analysis

方法一：将符合要求的数缓存好，再二分查找。

方法二：巧用奇数数列求和公式。

$$1 = 1$$

$$4 = 1 + 3$$

$$9 = 1 + 3 + 5$$

$$16 = 1 + 3 + 5 + 7$$

$$25 = 1 + 3 + 5 + 7 + 9$$

$$36 = 1 + 3 + 5 + 7 + 9 + 11$$

$$. . .$$

$$1+3+. . .+(2n-1)=\frac{(2n-1 + 1)\cdot n}{2}=n^2$$


方法三：二分查找法

方法四：[牛顿迭代法](https://blog.csdn.net/u011863024/article/details/113095704)


## Code

[Source Code](../../src/main/java/com/lun/easy/ValidPerfectSquare.java)

[Test Code](../../src/test/java/com/lun/easy/ValidPerfectSquareTest.java)

