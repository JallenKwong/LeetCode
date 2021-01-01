# CountPrimes

## Topic

- Hash Table
- Math

## Description

[https://leetcode.com/problems/count-primes/](https://leetcode.com/problems/count-primes/)

Count the number of prime numbers less than a non-negative number, n.

**Example 1**:

```
Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
```

**Example 2**:

```
Input: n = 0
Output: 0
```

**Example 3**:

```
Input: n = 1
Output: 0
```

**Constraints**:

- 0 <= n <= 5 * 10⁶

## Analysis


埃拉托色尼筛选法(the Sieve of Eratosthenes)简称埃氏筛法，是古希腊数学家埃拉托色尼(Eratosthenes 274B.C.～194B.C.)提出的一种筛选法。 是针对自然数列中的自然数而实施的，用于求一定范围内的质数，它的容斥原理之完备性条件是p=H~。[埃拉托色尼筛选法_百度百科](https://baike.baidu.com/item/%E5%9F%83%E6%8B%89%E6%89%98%E8%89%B2%E5%B0%BC%E7%AD%9B%E9%80%89%E6%B3%95/4524938?fr=aladdin)

![](https://assets.leetcode.com/static_assets/public/images/solutions/Sieve_of_Eratosthenes_animation.gif)


## Code

[Source Code](../../src/main/java/com/lun/easy/CountPrimes.java)

[Test Code](../../src/test/java/com/lun/easy/CountPrimesTest.java)

