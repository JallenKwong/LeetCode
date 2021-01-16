# PalindromeNumber

## Topic

- Math

## Description

[https://leetcode.com/problems/palindrome-number/](https://leetcode.com/problems/palindrome-number/)

Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

**Follow up**: Could you solve it without converting the integer to a string?

**Example 1**:

```
Input: x = 121
Output: true
```

**Example 2**:

```
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
```
**Example 3**:

```
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
```

**Example 4**:

```
Input: x = -101
Output: false
```

**Constraints**:

- -2³¹ <= x <= 2³¹ - 1

## Analysis

方法一：我写的，用一个10位整型数组存数位，然后首尾指针向中夹逼迭代数组元素过程中，判断所指元素的相等性，从而判断实参是否是回文数。

方法二：利用回文的轴对称性，也就是轴右半部分反转的数是否等于前半部分的数。

方法三：更方法二类似，一个数的如果是回文数，那么这数反转后，与原数相等。该方法并没有明显处理负数和溢出的情况的代码，是一个似非而是的方法。


## Code

[Source Code](../../src/main/java/com/lun/easy/PalindromeNumber.java)

[Test Code](../../src/test/java/com/lun/easy/PalindromeNumberTest.java)

