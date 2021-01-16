# MergeKSortedLists

## Topic

- Linked List
- Divide and Conquer
- Heap

## Description

[https://leetcode.com/problems/merge-k-sorted-lists/](https://leetcode.com/problems/merge-k-sorted-lists/)

You are given an array of `k` linked-lists `lists`, each linked-list is sorted in ascending order.

Merge all the linked-lists into one sorted linked-list and return it.

**Example 1**:

```
Input: lists = [[1,4,5],[1,3,4],[2,6]]
Output: [1,1,2,3,4,4,5,6]
Explanation: The linked-lists are:
[
  1->4->5,
  1->3->4,
  2->6
]
merging them into one sorted list:
1->1->2->3->4->4->5->6
```

**Example 2**:

```
Input: lists = []
Output: []
```

**Example 3**:

```
Input: lists = [[]]
Output: []
```

**Constraints**:

- `k == lists.length`
- `0 <= k <= 10^4`
- `0 <= lists[i].length <= 500`
- `-10^4 <= lists[i][j] <= 10^4`
- `lists[i]` is sorted in **ascending order**.
- The sum of `lists[i].length` won't exceed `10^4`.


## Analysis

[LeetCode 21. Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists)的延伸。个人本题不符Hard的难度。

## Code

[Source Code](../../src/main/java/com/lun/hard/MergeKSortedLists.java)

[Test Code](../../src/test/java/com/lun/hard/MergeKSortedListsTest.java)

