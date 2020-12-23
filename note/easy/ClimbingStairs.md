# ClimbingStairs #

## Topic

Dynamic Programming

## Description

[https://leetcode.com/problems/climbing-stairs/](https://leetcode.com/problems/climbing-stairs/)

You are climbing a staircase. It takes **n** steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

**Example 1**:

```
Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
```

**Example 2**:

```
Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
```

**Constraints**:

- 1 <= n <= 45

## Analysis

逐步分析，找出其中的规律。设f(n)为在n个阶梯上，每步1或2个阶梯，则有多少种方式登上顶。

由题目得f(1)=1，f(2)=2，f(3)=3。

---

n = 4，则有以下方案

1. 1 + **1 + 1 + 1**
2. 1 + **1 + 2**
3. 1 + **2 + 1**
4. 2 + **1 + 1**
5. 2 + **2**

总共有5种方案，观察其中规律：当第1步走1个阶梯，剩下有f(3)=3种走法（1~3加粗的部分），当第1步走2个阶梯，剩下有f(2)=2种走法（4~5加粗的部分）。

可得f(4)=f(3)+f(2)。那么，大胆推测一下，f(n) = f(n-1) + f(n-2)。我们再举n=5实证一下。

---

n = 5，则有以下方案

1. 1 + **1 + 1 + 1 + 1**
2. 1 + **1 + 1 + 2**
3. 1 + **1 + 2 + 1**
4. 1 + **2 + 1 + 1**
5. 1 + **2 + 2**
6. 2 + **1 + 1 + 1**
7. 2 + **1 + 2**
8. 2 + **2 + 1**

总共有8种方案，观察其中规律：当第1步走1个阶梯，剩下有f(4)=5种走法（1~5加粗的部分），当第1步走2个阶梯，剩下有f(3)=3种走法（6~8加粗的部分）。可得f(5)=f(4)+f(3)

因此，表达式f(n) = f(n-1) + f(n-2) 应该就是解决这题目的关键。

f(n) = f(n-1) + f(n-2)，这不就是**斐波那契数列**，当初学递归时接触的经典数列。

代码实现方法：

- 方法一：递归法，另分配数组作缓存
- 方法二：迭代法
- 方法三：尾递归法

## Code

[Source Code](ClimbingStairs.java)

[Test Code](../../../../../test/java/com/lun/easy/ClimbingStairsTest.java)

