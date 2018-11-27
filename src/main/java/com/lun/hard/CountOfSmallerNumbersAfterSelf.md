# CountOfSmallerNumbersAfterSelf #

tag:二叉树 归并排序

[https://leetcode.com/problems/count-of-smaller-numbers-after-self/](https://leetcode.com/problems/count-of-smaller-numbers-after-self/)


You are given an integer array nums and you have to return a new counts array. The counts array has the property where **counts[i]** is the number of smaller elements to the right of **nums[i]**.

**Example**:

	Input: [5,2,6,1]
	Output: [2,1,1,0] 
	Explanation:
	To the right of 5 there are 2 smaller elements (2 and 1).
	To the right of 2 there is only 1 smaller element (1).
	To the right of 6 there is 1 smaller element (1).
	To the right of 1 there is 0 smaller element.

**thinking**

我原思路是利用TreeMap的有序性，键值对性，结果比最简单暴力算法还要慢 T_T)

可能是我生硬用TreeMap的API生硬的拼装，别人的算法是和谐地运用二叉树特性，值得我改进学习

