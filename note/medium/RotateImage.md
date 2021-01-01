# RotateImage #

## Topic

- Array

## Description

[https://leetcode.com/problems/rotate-image/](https://leetcode.com/problems/rotate-image/)

You are given an n x n 2D **matrix** representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image **in-place**, which means you have to modify the input 2D matrix directly. **DO NOT** allocate another 2D matrix and do the rotation.


**Example 1**:

```
1 2 3        7 4 1
4 5 6   ->   8 5 2
7 8 9        9 6 3

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]
```

**Example 2**:

```
5  1  9  11           15  13 2  5
2  4  8  10           14  3  4  1
13 3  6  7     ->     12  6  8  9
15 14 12 16           16  7  10 11

Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
```

**Example 3**:

```
Input: matrix = [[1]]
Output: [[1]]
```

**Example 4**:

```
Input: matrix = [[1,2],[3,4]]
Output: [[3,1],[4,2]]
```

**Constraints**:

- matrix.length == n
- matrix[i].length == n
- 1 <= n <= 20
- -1000 <= matrix[i][j] <= 1000


## Analysis

方法一：

用示例试探矩阵m转置90度时元素下标之间的规律：

i\j|0|1|2|3
---|---|---|---|---
**0**|5|1|9|11
**1**|2|4|8|10
**2**|1|3|6|7
**3**|15|14|12|16

从m[0][0]元素开始，该元素相关转换路径如下：

1. m[0][0] -> m[0][3]
2. m[0][3] -> m[3][3]
3. m[3][3] -> m[3][0]
4. m[3][0] -> m[0][3]

再观察m[0][1]元素的相关转换路径如下：

1. m[0][1] -> m[1][3]
2. m[1][3] -> m[3][2]
3. m[3][2] -> m[2][0]
4. m[2][0] -> m[0][1]

似乎可以看出一些端倪：

1. 前元素位置的第二下标 与 后元素位置的第一下标 **相等**。
2. 前元素位置的第一下标 与 后元素位置的第二下标 之和 **等于** 矩阵边长n减1。

再换个元素，以m[1][1]开始， 相关转换路径如下：

1. m[1][1] -> m[1][2]
2. m[1][2] -> m[2][2]
3. m[2][2] -> m[2][1]
4. m[2][1] -> m[1][1]

这可更加确信上述两条规则的正确性。

接着，再确定起始，结束条件：

i\j|0|1|2|3
---|---|---|---|---
**0**|**5**|**1**|**9**|11
**1**|2|**4**|8|10
**2**|1|3|6|7
**3**|15|14|12|16

上表中加粗的元素，作启动元素，其他元素在启动元素转置过程中被动转置，也就是重点关注启动元素们的位置范围即可。

到此，程序思路基本成型。

---

方法二：

The idea was firstly transpose the matrix and then flip it symmetrically. For instance,

```
1  2  3
4  5  6
7  8  9
```
after transpose, it will be swap(matrix[i][j], matrix[j][i])

```
1  4  7
2  5  8
3  6  9
```
Then flip the matrix horizontally. (swap(matrix[i][j], matrix[i][matrix.length-1-j])

```
7  4  1
8  5  2
9  6  3
```

涉及矩阵运算。


## Code

[Source Code](../../src/main/java/com/lun/medium/RotateImage.java)

[Test Code](../../src/test/java/com/lun/medium/RotateImageTest.java)

