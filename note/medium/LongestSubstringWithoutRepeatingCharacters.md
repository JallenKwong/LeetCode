# LongestSubstringWithoutRepeatingCharacters

## Topic

- Hash Table
- Two Pointers
- String
- Sliding Window

## Description

[https://leetcode.com/problems/longest-substring-without-repeating-characters/](https://leetcode.com/problems/longest-substring-without-repeating-characters/)

Given a string s, find the length of the **longest substring** without repeating characters.

**Example 1**:

```
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
```

**Example 2**:

```
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
```

**Example 3**:

```
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
```

**Example 4**:

```
Input: s = ""
Output: 0
```

**Constraints**:

- 0 <= s.length <= 5 * 10⁴
- s consists of English letters, digits, symbols and spaces.

## Analysis

基本思想：用缓存以字符串的字符为键，下标为值。用左右指针标记最大子字符串起始与末尾下标。移动右指针扫描字符串的字符，与此同时，更新缓存，更新最长值。当发现重复的字符，查找缓存这字符对应下标，左指针指向这下标+1。

方法一：双指针+哈希表

方法二：比方法一精简些

方法三：移动窗口（队列）

方法四：双指针+哈希集


## Code

[Source Code](../../src/main/java/com/lun/medium/LongestSubstringWithoutRepeatingCharacters.java)

[Test Code](../../src/test/java/com/lun/medium/LongestSubstringWithoutRepeatingCharactersTest.java)

