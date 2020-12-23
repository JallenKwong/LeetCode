# ValidPerfectSquare #

tag:Math,Binary Search

[https://leetcode.com/problems/valid-perfect-square/](https://leetcode.com/problems/valid-perfect-square/)

Given a positive integer num, write a function which returns True if num is a perfect square else False.

**Note**: **Do not** use any built-in library function such as sqrt.

**Example 1:**

	Input: 16
	Output: true

**Example 2:**

	Input: 14
	Output: false

**Thinking:**

一、

观察数列

1^2, 2^2, 3^2, 4^2, 5^2, 6^2, ...

即

1, 4, 9, 16, 25, 36, ...

发现上条数列中相邻的后项与前项之差形成首项为1，差为2的等差数列：

3, 5, 7, 9, ...

也就是

1 = 1

4 = 1 + 3

9 = 1 + 3 + 5

16 = 1 + 3 + 5 + 7

25 = 1 + 3 + 5 + 7 + 9

36 = 1 + 3 + 5 + 7 + 9 + 11

....

so 1+3+...+(2n-1) = (2n-1 + 1)n/2 = nn

[ValidPerfectSquare#isPerfectSquare2](ValidPerfectSquare.java)

The time complexity is **O(sqrt(n))**

二、

使用二分查找

[ValidPerfectSquare#isPerfectSquare3](ValidPerfectSquare.java)

A more efficient one using binary search whose time complexity is **O(log(n))**

三、

牛顿迭代法

为了方便理解，就先以本题为例：

计算x2 = n的解，令f(x)=x2-n，相当于求解f(x)=0的解，如下图所示。

![](image/Newton's-method.jpg)

首先取x0，如果x0不是解，做一个经过(x0,f(x0))这个点的切线，与x轴的交点为x1。

同样的道理，如果x1不是解，做一个经过(x1,f(x1))这个点的切线，与x轴的交点为x2。

以此类推。

以这样的方式得到的xi会无限趋近于f(x)=0的解。

判断xi是否是f(x)=0的解有两种方法：

一是直接计算f(xi)的值判断是否为0，二是判断前后两个解xi和xi-1是否无限接近。

经过(xi, f(xi))这个点的切线方程为f(x) = f(xi) + f’(xi)(x - xi)，其中f'(x)为f(x)的导数，本题中为2x。令切线方程等于0，即可求出xi+1=xi - f(xi) / f'(xi)。

继续化简，xi+1=xi - (xi2 - n) / (2xi) = xi - xi / 2 + n / (2xi) = xi / 2 + n / 2xi = (xi + n/xi) / 2。

[算法 - 牛顿迭代法求平方根](https://www.cnblogs.com/qlky/p/7735145.html)

[ValidPerfectSquare#isPerfectSquare4](ValidPerfectSquare.java)
