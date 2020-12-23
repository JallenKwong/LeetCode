# ReverseBits #

方法一：双指针 + 位操作（我写的）

PS:

在二进制中，设置特定的数位：

- 设置特定的数位为1，其他数位保持不变，用到 | 位运算符。如，设置01101的左边第1位为1，则01101 | 10000 = 11101
- 设置特定的数位为0，其他数位保持不变，用到 ~、& 位运算符。如，设置11101的左边第1位为0，11101 & (~10000) = 11101 & 01111 = 01101

---

方法二：位操作（乾坤大挪移）

for 8 bit binary number abcdefgh, the process is as follow:

abcdefgh -> efghabcd -> ghefcdab -> hgfedcba

---

方法三：类似队列 + 位操作

We first intitialize result to 0. We then iterate from 0 to 31 (an integer has 32 bits). In each iteration:
We first shift result to the left by 1 bit.
Then, if the last digit of input n is 1, we add 1 to result. To
find the last digit of n, we just do: (n & 1)
Example, if n=5 (101), n&1 = 101 & 001 = 001 = 1;
however, if n = 2 (10), n&1 = 10 & 01 = 00 = 0).

Finally, we update n by shifting it to the right by 1 (n >>= 1). This is because the last digit is already taken care of, so we need to drop it by shifting n to the right by 1.

At the end of the iteration, we return result.

**Example**, if input n = 13 (represented in binary as 0000,0000,0000,0000,0000,0000,0000,1101, the "," is for readability),
calling reverseBits(13) should return:
1011,0000,0000,0000,0000,0000,0000,0000

Here is how our algorithm would work for input n = 13:

**Initially**, result = 0 = 0000,0000,0000,0000,0000,0000,0000,0000,
n = 13 = 0000,0000,0000,0000,0000,0000,0000,1101

Starting for loop:

**i = 0**:

result = result << 1 = 0000,0000,0000,0000,0000,0000,0000,0000.
n&1 = 0000,0000,0000,0000,0000,0000,0000,1101
& 0000,0000,0000,0000,0000,0000,0000,0001
= 0000,0000,0000,0000,0000,0000,0000,0001 = 1
therefore result = result + 1 =
0000,0000,0000,0000,0000,0000,0000,0000 + 0000,0000,0000,0000,0000,0000,0000,0001 
= 0000,0000,0000,0000,0000,0000,0000,0001 = 1

Next, we right shift n by 1 (n >>= 1) (i.e. we drop the least significant bit) to get:
n = 0000,0000,0000,0000,0000,0000,0000,0110.
We then go to the next iteration.

**i = 1**:

result = result << 1 = 0000,0000,0000,0000,0000,0000,0000,0010;
n&1 = 0000,0000,0000,0000,0000,0000,0000,0110 &
0000,0000,0000,0000,0000,0000,0000,0001
= 0000,0000,0000,0000,0000,0000,0000,0000 = 0;
therefore we don't increment result.
We right shift n by 1 (n >>= 1) to get:
n = 0000,0000,0000,0000,0000,0000,0000,0011.
We then go to the next iteration.

**i = 2**:

result = result << 1 = 0000,0000,0000,0000,0000,0000,0000,0100.
n&1 = 0000,0000,0000,0000,0000,0000,0000,0011 &
0000,0000,0000,0000,0000,0000,0000,0001 =
0000,0000,0000,0000,0000,0000,0000,0001 = 1
therefore result = result + 1 =
0000,0000,0000,0000,0000,0000,0000,0100 +
0000,0000,0000,0000,0000,0000,0000,0001 =
result = 0000,0000,0000,0000,0000,0000,0000,0101
We right shift n by 1 to get:
n = 0000,0000,0000,0000,0000,0000,0000,0001.
We then go to the next iteration.

**i = 3**:

result = result << 1 = 0000,0000,0000,0000,0000,0000,0000,1010.
n&1 = 0000,0000,0000,0000,0000,0000,0000,0001 &
0000,0000,0000,0000,0000,0000,0000,0001 =
0000,0000,0000,0000,0000,0000,0000,0001 = 1
therefore result = result + 1 =
= 0000,0000,0000,0000,0000,0000,0000,1011
We right shift n by 1 to get:
n = 0000,0000,0000,0000,0000,0000,0000,0000 = 0.

Now, from here to the end of the iteration, n is 0, so (n&1)
will always be 0 and and n >>=1 will not change n. The only change
will be for result <<=1, i.e. shifting result to the left by 1 digit.
Since there we have i=4 to i = 31 iterations left, this will result
in padding 28 0's to the right of result. i.e at the end, we get
result = 1011,0000,0000,0000,0000,0000,0000,0000

This is exactly what we expected to get.

---

方法四：比方法三精简些

## Code

[Source Code](ReverseBits.java)

[Test Code](../../../../../test/java/com/lun/easy/ReverseBitsTest.java)

