# LongestPalindromicSubstring

## Topic

- String
- Dynamic Programming

## Description

[https://leetcode.com/problems/longest-palindromic-substring/](https://leetcode.com/problems/longest-palindromic-substring/)

Given a string `s`, return the longest palindromic substring in `s`.

**Example 1**:

```
Input: s = "babad"
Output: "bab"
Note: "aba" is also a valid answer.
```

**Example 2**:

```
Input: s = "cbbd"
Output: "bb"
```

**Example 3**:

```
Input: s = "a"
Output: "a"
```

**Example 4**:

```
Input: s = "ac"
Output: "a"
```

**Constraints**:

- 1 <= s.length <= 1000
- `s` consist of only digits and English letters (lower-case and/or upper-case),

## Analysis

方法一：以字符为中心向其两侧扩展探测是否回文。

---

方法二：动态规划。

`dp(i, j)` represents whether `s(i ... j)` can form a palindromic substring, `dp(i, j)` is true when `s(i)` equals to `s(j)` and `s(i+1 ... j-1)` is a palindromic substring.

When we found a palindrome, check if it's the longest one. Time complexity O(n^2).

以 s = "babad" 为例，dp数组如下：

```
  j 0 1 2 3 4
i   b a b a d
0 b t   t    
1 a   t   t  
2 b     t    
3 a       t  
4 d         t
```

- **`j` must be greater than or equal `i` at all times. Why**? `i` is the start index of the substring, `j` is the end index of the substring. It makes no sense for `i` to be greater than `j`. If you visualize the dp 2d array, think of a diagonal that cuts from top left to bottom right. We are only filling the top right half of dp.

- **Why are we counting down for `i`, but counting up for `j`**? Each sub-problem `dp[i][j]` depends on `dp[i+1][j-1]` (`dp[i+1][j-1]` must be true and `s.charAt(i)` must equal `s.charAt(j)` for `dp[i][j]` to be true).

- **How to understand `dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i < 3 || dp[i + 1][j - 1]);`**?
	- `j-i == 0`, only a character is a palindrome.
	- `j-i == 1` and `s.charAt(i) == s.charAt(j)`, `s[i:j]` is a palindrome.(like "aa"，"bb")
	- `j-i == 2` and `s.charAt(i) == s.charAt(j)`, no matter what between `i` and `j`, `s[i:j]` is a palindrome.(like "aba", "aza")


**动态规划解决问题的套路**：

- 需要用动态规划解决问题的味道
	- “最值”味道。（本题的 **the longest** palindromic substring in s）
- 用动态规划解决问题的4步曲
	1. 确定状态。（`dp(i, j)` represents whether `s(i ... j)` can form a palindromic substring）
	2. 求得方程。（`dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i < 3 || dp[i + 1][j - 1]);`）
	3. 设初置界。（0 <= i <= j < s.length）
	4. 确序而答。（由方程可知，`dp[i][j]`是依赖`dp[i + 1][j - 1]`的，因此，i从大到小，j则从小到大）

## Code

[Source Code](../../src/main/java/com/lun/medium/LongestPalindromicSubstring.java)

[Test Code](../../src/test/java/com/lun/medium/LongestPalindromicSubstringTest.java)

