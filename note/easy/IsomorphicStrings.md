# IsomorphicStrings

## Topic

- Hash Table

## Description

[https://leetcode.com/problems/isomorphic-strings/](https://leetcode.com/problems/isomorphic-strings/)

Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

**Example 1**:

```
Input: s = "egg", t = "add"
Output: true
```

**Example 2**:

```
Input: s = "foo", t = "bar"
Output: false
```

**Example 3**:

```
Input: s = "paper", t = "title"
Output: true
```

**Note**:

You may assume both **s** and **t** have the same length.

## Analysis

The idea is that we need to map a char to another one, for example, "egg" and "add", we need to constract the mapping 'e' -> 'a' and 'g' -> 'd'.（双向映射） Instead of directly mapping 'e' to 'a', another way is to mark them with same value, for example, 'e' -> 1, 'a'-> 1, and 'g' -> 2, 'd' -> 2, this works same.（在Java中，用两个Map或两个数组实现）

> isomorphic
>
> adj.	同形（态）的;



## Code

[Source Code](../../src/main/java/com/lun/easy/IsomorphicStrings.java)

[Test Code](../../src/test/java/com/lun/easy/IsomorphicStringsTest.java)

