# DivideTwoIntegers

## Topic

- Math

## Description

[https://leetcode.com/problems/divide-two-integers/](https://leetcode.com/problems/divide-two-integers/)

Given two integers `dividend` and `divisor`, divide two integers without using multiplication, division, and mod operator.

Return the quotient after dividing `dividend` by `divisor`.

The integer division should truncate toward zero, which means losing its fractional part. For example, `truncate(8.345) = 8` and `truncate(-2.7335) = -2`.

**Note**:

- Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [−2³¹,  2³¹ − 1]. For this problem, assume that your function **returns 2³¹ − 1 when the division result overflows**.


**Example 1**:

```
Input: dividend = 10, divisor = 3
Output: 3
Explanation: 10/3 = truncate(3.33333..) = 3.
```

**Example 2**:

```
Input: dividend = 7, divisor = -3
Output: -2
Explanation: 7/-3 = truncate(-2.33333..) = -2.
```

**Example 3**:

```
Input: dividend = 0, divisor = 1
Output: 0
```

**Example 4**:

```
Input: dividend = 1, divisor = 1
Output: 1
```

**Constraints**:

- -2³¹ <= dividend, divisor <= 2³¹ - 1
- divisor != 0

## Analysis

方法一：我写的。

一开始，打算将被除数，除数绝对值后（先得出结果正负号），然后二分查找一个候选商，然后除数累加商值数，累加值与被除数相比，从而得出最佳候选商。但这方法在溢出情况处理很棘手，特别是被除数是`Integer.MIN_VALUE`情况（另外，`Integer.MIN_VALUE == Math.abs(Integer.MIN_VALUE)`为`true`，负数的绝对值还是负数，这情况是不允许的）。因此，放弃这种方法。

换种另一个角度，先得出结果正负号，让被除数，除数都是变成负数，然后让除数左移若干位，逼近被除数，逼近得差不多，得出半成商。接着就换成用加法逼近，得出最佳近似商。最后，根据一开始保留结果正负号，得出最佳近似商正负号，并将近似商返回。

---

方法二 & 方法三：别人写的，简洁，优雅。

## Code

[Source Code](../../src/main/java/com/lun/medium/DivideTwoIntegers.java)

[Test Code](../../src/test/java/com/lun/medium/DivideTwoIntegersTest.java)

