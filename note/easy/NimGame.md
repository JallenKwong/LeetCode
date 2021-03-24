# NimGame

## Topic

- Brainteaser
- Minimax
- Bit Manipulation

## Description

[https://leetcode.com/problems/nim-game/](https://leetcode.com/problems/nim-game/)

You are playing the following Nim Game with your friend:

- Initially, there is a heap of stones on the table.
- You and your friend will alternate taking turns, and **you go first**.
- On each turn, the person whose turn it is will remove 1 to 3 stones from the heap.
- The one who removes the last stone is the winner.

Given `n`, the number of stones in the heap, return `true` if you can win the game assuming both you and your friend play optimally, otherwise return `false`.

**Example 1**:

```
Input: n = 4
Output: false
Explanation: These are the possible outcomes:
1. You remove 1 stone. Your friend removes 3 stones, including the last stone. Your friend wins.
2. You remove 2 stones. Your friend removes 2 stones, including the last stone. Your friend wins.
3. You remove 3 stones. Your friend removes the last stone. Your friend wins.
In all outcomes, your friend wins.
```

**Example 2**:

```
Input: n = 1
Output: true
```

**Example 3**:

```
Input: n = 2
Output: true
```

**Constraints**:

- 1 <= n <= 2³¹ - 1

## Analysis

> Theorem: The first one who got the number that is multiple of 4 (i.e. n % 4 == 0) will lost, otherwise he/she will win.

Proof:

- the base case: when n = 4, as suggested by the hint from the problem, no matter which number that that first player, the second player would always be able to pick the remaining number.

- For 1* 4 < n < 2 * 4, (n = 5, 6, 7), the first player can reduce the initial number into 4 accordingly, which will leave the death number 4 to the second player. i.e. The numbers 5, 6, 7 are winning numbers for any player who got it first.

- Now to the beginning of the next cycle, n = 8, no matter which number that the first player picks, it would always leave the winning numbers (5, 6, 7) to the second player. Therefore, 8 % 4 == 0, again is a death number.

- Following the second case, for numbers between (2*4 = 8) and (3*4=12), which are 9, 10, 11, are winning numbers for the first player again, because the first player can always reduce the number into the death number 8.

---

**位操作**小技巧：

**2的n次方的整数倍和2的n次方减1按位与后值为0**。

$$(a\cdot2^n) \& (2^n-1)=0(a\in N, n\in N )$$

例如：

```
n = 2，2ⁿ = 4， 2ⁿ - 1 = 3

0 & 3 = 0 & 11 = 0
4 & 3 = 100 & 11 = 0
8 & 3 = 1000 & 11 = 0
12 & 3 = 1100 & 11 = 0
16 & 3 = 10000 & 11 = 0
20 & 3 = 10100 & 11 = 0
24 & 3 = 11000 & 11 = 0
28 & 3 = 11100 & 11 = 0
32 & 3 = 100000 & 11 = 0
36 & 3 = 100100 & 11 = 0
40 & 3 = 101000 & 11 = 0
44 & 3 = 101100 & 11 = 0
48 & 3 = 110000 & 11 = 0
52 & 3 = 110100 & 11 = 0
56 & 3 = 111000 & 11 = 0
60 & 3 = 111100 & 11 = 0
64 & 3 = 1000000 & 11 = 0
68 & 3 = 1000100 & 11 = 0
72 & 3 = 1001000 & 11 = 0
76 & 3 = 1001100 & 11 = 0
80 & 3 = 1010000 & 11 = 0
84 & 3 = 1010100 & 11 = 0
88 & 3 = 1011000 & 11 = 0
92 & 3 = 1011100 & 11 = 0
96 & 3 = 1100000 & 11 = 0
...

```

又例如：

```
n = 4，2ⁿ = 16， 2ⁿ - 1 = 15

0 & 15 = 0 & 1111 = 0
16 & 15 = 10000 & 1111 = 0
32 & 15 = 100000 & 1111 = 0
48 & 15 = 110000 & 1111 = 0
64 & 15 = 1000000 & 1111 = 0
80 & 15 = 1010000 & 1111 = 0
96 & 15 = 1100000 & 1111 = 0
112 & 15 = 1110000 & 1111 = 0
128 & 15 = 10000000 & 1111 = 0
144 & 15 = 10010000 & 1111 = 0
160 & 15 = 10100000 & 1111 = 0
176 & 15 = 10110000 & 1111 = 0
192 & 15 = 11000000 & 1111 = 0
208 & 15 = 11010000 & 1111 = 0
224 & 15 = 11100000 & 1111 = 0
240 & 15 = 11110000 & 1111 = 0
256 & 15 = 100000000 & 1111 = 0
272 & 15 = 100010000 & 1111 = 0
288 & 15 = 100100000 & 1111 = 0
304 & 15 = 100110000 & 1111 = 0
320 & 15 = 101000000 & 1111 = 0
336 & 15 = 101010000 & 1111 = 0
352 & 15 = 101100000 & 1111 = 0
368 & 15 = 101110000 & 1111 = 0
384 & 15 = 110000000 & 1111 = 0
400 & 15 = 110010000 & 1111 = 0
416 & 15 = 110100000 & 1111 = 0
432 & 15 = 110110000 & 1111 = 0
448 & 15 = 111000000 & 1111 = 0
464 & 15 = 111010000 & 1111 = 0
480 & 15 = 111100000 & 1111 = 0
496 & 15 = 111110000 & 1111 = 0
512 & 15 = 1000000000 & 1111 = 0
528 & 15 = 1000010000 & 1111 = 0
544 & 15 = 1000100000 & 1111 = 0
560 & 15 = 1000110000 & 1111 = 0
576 & 15 = 1001000000 & 1111 = 0
592 & 15 = 1001010000 & 1111 = 0
608 & 15 = 1001100000 & 1111 = 0
624 & 15 = 1001110000 & 1111 = 0
640 & 15 = 1010000000 & 1111 = 0
656 & 15 = 1010010000 & 1111 = 0
672 & 15 = 1010100000 & 1111 = 0
688 & 15 = 1010110000 & 1111 = 0
704 & 15 = 1011000000 & 1111 = 0
720 & 15 = 1011010000 & 1111 = 0
736 & 15 = 1011100000 & 1111 = 0
752 & 15 = 1011110000 & 1111 = 0
768 & 15 = 1100000000 & 1111 = 0
784 & 15 = 1100010000 & 1111 = 0
800 & 15 = 1100100000 & 1111 = 0
816 & 15 = 1100110000 & 1111 = 0
832 & 15 = 1101000000 & 1111 = 0
848 & 15 = 1101010000 & 1111 = 0
864 & 15 = 1101100000 & 1111 = 0
880 & 15 = 1101110000 & 1111 = 0
896 & 15 = 1110000000 & 1111 = 0
912 & 15 = 1110010000 & 1111 = 0
928 & 15 = 1110100000 & 1111 = 0
944 & 15 = 1110110000 & 1111 = 0
960 & 15 = 1111000000 & 1111 = 0
976 & 15 = 1111010000 & 1111 = 0
992 & 15 = 1111100000 & 1111 = 0

```

日后，判断一个数a能否被2的n次方整除，除了用求余，还可以用刚介绍**位操作小技巧**：2的n次方的整数倍和2的n次方减1按位与后值为0。

$$(a\%2^n)=(a\&(2^n-1))(a\in N,n\in N)$$

## Code

[Source Code](../../src/main/java/com/lun/easy/NimGame.java)

[Test Code](../../src/test/java/com/lun/easy/NimGameTest.java)

