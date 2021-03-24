# UglyNumberII

## Topic

- Math
- Dynamic Programming
- Heap

## Description

[https://leetcode.com/problems/ugly-number-ii/](https://leetcode.com/problems/ugly-number-ii/)


## Analysis

方法一：遍历自然数，逐个判断是否是丑数。这方法很低效。

方法二：动态数组。

We have an array k of first n ugly number. We only know, at the beginning, the first one, which is 1. Then

k[1] = min( k[0]x2, k[0]x3, k[0]x5). The answer is k[0]x2. So we move 2's pointer to 1. Then we test:

k[2] = min( k[1]x2, k[0]x3, k[0]x5). And so on. Be careful about the cases such as 6, in which we need to forward both pointers of 2 and 3.

x here is multiplication.

方法三：用使用堆。

方法四：使用红黑树。

## Code

[Source Code](../../src/main/java/com/lun/medium/UglyNumberII.java)

[Test Code](../../src/test/java/com/lun/medium/UglyNumberIITest.java)

