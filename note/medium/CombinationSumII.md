# CombinationSumII

## Topic

- Array
- Backtracking

## Description

[https://leetcode.com/problems/combination-sum-ii/](https://leetcode.com/problems/combination-sum-ii/)

Given a collection of candidate numbers (`candidates`) and a target number (`target`), find all unique combinations in `candidates` where the candidate numbers sum to `target`.

Each number in `candidates` may only be used **once** in the combination.

**Note**: The solution set must not contain duplicate combinations.


**Example 1**:

```
Input: candidates = [10,1,2,7,6,1,5], target = 8
Output:
[
[1,1,6],
[1,2,5],
[1,7],
[2,6]
]
```

**Example 2**:

```
Input: candidates = [2,5,2,1,2], target = 5
Output:
[
[1,2,2],
[5]
]
```

**Constraints**:

- 1 <= `candidates.length` <= 100
- 1 <= `candidates[i]` <= 50
- 1 <= `target` <= 30

## Analysis

[回溯算法：求组合总和（三）](https://mp.weixin.qq.com/s?__biz=MzUxNjY5NTYxNA==&mid=2247485360&idx=1&sn=2256a0f01a304d82a2b59252327f3edb&scene=21#wechat_redirect)


## Code

[Source Code](../../src/main/java/com/lun/medium/CombinationSumII.java)

[Test Code](../../src/test/java/com/lun/medium/CombinationSumIITest.java)

