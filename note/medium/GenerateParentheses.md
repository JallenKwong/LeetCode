# GenerateParentheses

## Topic

- String
- Backtracking

## Description

[https://leetcode.com/problems/generate-parentheses/](https://leetcode.com/problems/generate-parentheses/)

Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

**Example 1**:

```
Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
```

**Example 2**:

```
Input: n = 1
Output: ["()"]
```

**Constraints**:

- 1 <= n <= 8

## Analysis

方法一：暴力算法，生成可能结果，然后验证排除结果，时杂O(2²ⁿ)，效率不高。

方法二：回溯算法。根据代码理解下面n=3例子树图：

```
                (
              /   \
            /       \
          /           \
        ((            ()
      /     \           \
    (((     (()         ()(
    /     /    \       /    \
  ((()  (()(  (())   ()((   ()()
  /      |     |      |      |
((())  (()()  (())(  ()(()  ()()(
 |       |     |      |      |
((())) (()()) (())() ()(()) ()()()
```



## Code

[Source Code](../../src/main/java/com/lun/medium/GenerateParentheses.java)

[Test Code](../../src/test/java/com/lun/medium/GenerateParenthesesTest.java)

