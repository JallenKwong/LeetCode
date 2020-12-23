# AddDigits #

tag:Math

[Source Code](AddDigits.java)

[Test Code](AddDigitsTest.java)

## Description

[https://leetcode.com/problems/add-digits/](https://leetcode.com/problems/add-digits/)

Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

Example:

	Input: 38
	Output: 2
	Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2.
				 Since 2 has only one digit, return it.

Follow up:
Could you do it without any loop/recursion in O(1) runtime?

## Analysis

### 1 

按照正常的套路完成算法

### 2

用数学分析它的算法

> I'll try to explain the math behind this:
>
> First you should understand:
>
> **10^k % 9 = 1**
>
> **a*10^k % 9 = a % 9 **
>
> Then let's use an example to help explain.
>
> Say a number x = 23456
>
> x = 2 \* 10000 + 3 \* 1000 + 4 \* 100 + 5 \* 10 + 6
>
> 2 * 10000 % 9 = 2 % 9
>
> 3 * 1000 % 9 = 3 % 9
>
> 4 * 100 % 9 = 4 % 9
>
> 5 * 10 % 9 = 5 % 9
>
> Then x % 9 = ( 2 + 3 + 4 + 5 + 6) % 9, note that x = 2 \* 10000 + 3 \* 1000 + 4 \* 100 + 5 \* 10 + 6
>
> So we have 23456 % 9 = (2 + 3 + 4 + 5 + 6) % 9