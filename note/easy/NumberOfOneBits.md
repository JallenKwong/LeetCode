# NumberOfOneBits #

## Topic

- Bit Manipulation

## Description

[https://leetcode.com/problems/number-of-1-bits/](https://leetcode.com/problems/number-of-1-bits/)

Write a function that takes an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).

Note:

Note that in some languages such as Java, there is no unsigned integer type. In this case, the input will be given as a signed integer type. It should not affect your implementation, as the integer's internal binary representation is the same, whether it is signed or unsigned.

In Java, the compiler represents the signed integers using 2's complement notation. Therefore, in Example 3 above, the input represents the signed integer. -3.

**Follow up**: If this function is called many times, how would you optimize it?


**Example 1**:

```
Input: n = 00000000000000000000000000001011
Output: 3
Explanation: The input binary string 00000000000000000000000000001011 has a total of three '1' bits.
```

**Example 2**:

```
Input: n = 00000000000000000000000010000000
Output: 1
Explanation: The input binary string 00000000000000000000000010000000 has a total of one '1' bit.
```

**Example 3**:

```
Input: n = 11111111111111111111111111111101
Output: 31
Explanation: The input binary string 11111111111111111111111111111101 has a total of thirty one '1' bits.
```

## Analysis

方法一：

- An Integer in Java has 32 bits, e.g. 00101000011110010100001000011010.
- To count the 1s in the Integer representation we put the input int n in bit AND with 1 (that is represented as 00000000000000000000000000000001, and if this operation result is 1, that means that the last bit of the input integer is 1. Thus we add it to the 1s count.`ones = ones + (n & 1);`
- Then we shift the input Integer by one on the right, to check for the next bit.`n = n>>>1;`
- We keep doing this until the input Integer is 0.

---

方法二：

n & (n - 1) drops the lowest set bit. It's a neat little bit trick.

Let's use n = 00101100 as an example. This binary representation has three 1s.

- If n = 00101100, then n - 1 = 00101011, so n & (n - 1) = 00101100 & 00101011 = 00101000. Count = 1.
- If n = 00101000, then n - 1 = 00100111, so n & (n - 1) = 00101000 & 00100111 = 00100000. Count = 2.
- If n = 00100000, then n - 1 = 00011111, so n & (n - 1) = 00100000 & 00011111 = 00000000. Count = 3.

n is now zero, so the while loop ends, and the final count (the numbers of set bits) is returned.

## Code

[Source Code](NumberOfOneBits.java)

[Test Code](../../../../../test/java/com/lun/easy/NumberOfOneBitsTest.java)

