# FindMedianFromDataStream #

tag:优先队列

[https://leetcode.com/problems/find-median-from-data-stream/](https://leetcode.com/problems/find-median-from-data-stream/)

Median is the middle value in an ordered integer list. If the size of the list is even, there is no middle value. So the median is the mean of the two middle value.

For example,

[2,3,4] , the median is 3 

[2,3], the median is (2 + 3) / 2 = 2.5 

Design a data structure that supports the following two operations:

- void addNum(int num) - Add a integer number from the data stream to the data structure.
- double findMedian() - Return the median of all elements so far.

**Example**:

	addNum(1)
	addNum(2)
	findMedian() -> 1.5
	addNum(3) 
	findMedian() -> 2

**Thinking**:

用其他排序的话，会超时的

用两个优先队列（二叉堆），一个存小于中位数的数，另一个存大于中位数的数