# PowerOfFour #

tag:Bit Manipulation

[https://leetcode.com/problems/power-of-four/](https://leetcode.com/problems/power-of-four/)

Given an integer (signed 32 bits), write a function to check whether it is a power of 4.

**Example 1:**

	Input: 16
	Output: true

**Example 2:**

	Input: 5
	Output: false

**Follow up**: Could you solve it without loops/recursion?

---

**thinking:**

对于一个整数而言，如果这个数是 4 的幂次方，那它必定也是 2 的幂次方。


十进制|二进制
---|---
2|10
4|100 （1 在第 3 位）
8|1000
16|10000（1 在第 5 位）
32|100000
64|1000000（1 在第 7 位）
128|10000000
256|100000000（1 在第 9 位）
512|1000000000
1024|10000000000（1 在第 11 位）

从上表看出，是4的幂次方的数二进制形式中的1在奇数位。

于是，检测值与一个特殊的数做 & 位运算，用来判断检测值的二进制形式中的1是否在奇数位。

这个特殊的数有如下特点：

- 足够大，但不能超过 32 位，即最大为 31 个 1 
- 它的二进制表示中奇数位为 1 ，偶数位为 0

符合这两个条件的二进制数是`1010101010101010101010101010101`，转换成`0x55555555`。

