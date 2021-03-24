# Pow

## Topic

- Binary Search
- Math

## Description

[https://leetcode.com/problems/powx-n/](https://leetcode.com/problems/powx-n/)

Implement `pow(x, n)`, which calculates x raised to the power n (i.e. x^n).

**Example 1**:

```
Input: x = 2.00000, n = 10
Output: 1024.00000
```

**Example 2**:

```
Input: x = 2.10000, n = 3
Output: 9.26100
```

**Example 3**:

```
Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2^(-2) = 1/(2^2) = 1/4 = 0.25
```

Constraints:

- $$ -100.0 < x < 100.0 $$

- $$ -2^{31} <= n <= 2^{31}-1 $$

- $$ -10^{4} <= x^{n} <= 10^{4} $$


## Analysis

方法一：暴力算法，一个个地乘，但耗时，故弃。

方法二：递归算法，从上到下，与方法一相比，乘法的次数对数减少。

方法三：别人写的递归算法，简单优雅，特别是本方法不像方法二对n为-2147483648时需特别处理。

---

PS. 对n为Integer.MIN_VALUE(-2147483648)特殊情况，对其作出以下运算：

```
System.out.println(-Integer.MIN_VALUE);
System.out.println(Math.abs(Integer.MIN_VALUE));
```

**两行代码皆输出为-2147483648**，与事实不符，理应是2147483648，归因于32位整数的最大值只能为2147483647，再加1便会溢出。日后注意这特殊情况。



## Code

[Source Code](../../src/main/java/com/lun/medium/Pow.java)

[Test Code](../../src/test/java/com/lun/medium/PowTest.java)

