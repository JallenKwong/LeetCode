# FactorialTrailingZeroes #

## Topic

- Math

## Description

[https://leetcode.com/problems/factorial-trailing-zeroes/](https://leetcode.com/problems/factorial-trailing-zeroes/)

Given an integer `n`, return the number of trailing zeroes in `n!`.

**Follow up**: Could you write a solution that works in logarithmic time complexity?

**Example 1**:

Input: n = 3
Output: 0
Explanation: 3! = 6, no trailing zero.

**Example 2**:

Input: n = 5
Output: 1
Explanation: 5! = 120, one trailing zero.

**Example 3**:

Input: n = 0
Output: 0

**Constraints**:

- 0 <= n <= 10⁴


## Analysis

方法一：暴力算法（用到Java的BigInteger）。

方法二：分析成阶乘后出现0的情况。

出现0情况是乘子中有5, 10, 15...等5的整数倍的数。

5可与偶数乘子相乘等出10的整数倍，而且偶数个数是明显大大多于5的整数倍的数，于是一个数阶乘后低位出现0的个数有至少有 n / 5 个。

另外注意乘子中有25, 125, 625...5的整数幂的整数倍（如50, 75, 100, 250 ...），25 = 5 \* 5，125 = 5 \* 5 \* 5，625 = 5 \* 5 \* 5 \* 5，额外的5需要更多偶数与它们配对。也就是说一个数阶乘后低位出现0的个数有 n / 5 + n / 25 + n / 125 + n / 625... 。这样程序基本成型。

方法三：别人写的，更精简。

## Code

[Source Code](FactorialTrailingZeroes.java)

[Test Code](../../../../../test/java/com/lun/easy/FactorialTrailingZeroesTest.java)

