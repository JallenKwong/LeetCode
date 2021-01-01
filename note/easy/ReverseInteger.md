# ReverseInteger

## Topic

- Math

## Description

[https://leetcode.com/problems/reverse-integer/](https://leetcode.com/problems/reverse-integer/)

Given a 32-bit signed integer, reverse digits of an integer.

**Note**:

Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [−2³¹,  2³¹ − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

**Example 1**:

```
Input: x = 123
Output: 321
```

**Example 2**:

```
Input: x = -123
Output: -321
```

**Example 3**:

```
Input: x = 120
Output: 21
```

**Example 4**:

```
Input: x = 0
Output: 0
```

**Constraints**:

- -2³¹ <= x <= 2³¹ - 1

## Analysis

经验教训：

判断溢出时的老路：

```
boolean sign = x < 0;
...
if(sign && result > 0 || !sign && result < 0) {
	return 0;
}
```

但是用在本题就不好用了。

```
System.out.println(Integer.MAX_VALUE + 1);// -2147483648
System.out.println(964632435 * 10);// 1056389758
```

`964632435 * 10`明明溢出了，却还是正数。猜测原因是`964632435 * 10`底层算法为10个964632435进行累加，验证代码如下：

```
int result = 0;
for (int i = 0; i < 10; i++)
	result += 964632435;
System.out.println(result);// 1056389758
```

猜测正确。

## Code

[Source Code](../../src/main/java/com/lun/easy/ReverseInteger.java)

[Test Code](../../src/test/java/com/lun/easy/ReverseIntegerTest.java)

