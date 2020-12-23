# ValidPalindrome #

## Topic

- String
- Two Pointers

## Description

[https://leetcode.com/problems/valid-palindrome/](https://leetcode.com/problems/valid-palindrome/)

Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

**Example 1**:

```
Input: "A man, a plan, a canal: Panama"
Output: true
```

**Example 2**:

```
Input: "race a car"
Output: false
```

**Constraints**:

- s consists only of printable ASCII characters.

## Analysis

方法一：我写的方法。双指针，从字符串两端向中间，逐两个合法字符判断，直到双指针相遇为止

方法二：别人写的方法。原来存在Character.isLetterOrDigit()方便方法的，现在才知道。

方法三：用正则表达式将字符串非法字符剔除，转小写，然后克隆，逆转，跟原字符串相比是否相等。

## Code

[Source Code](ValidPalindrome.java)

[Test Code](../../../../../test/java/com/lun/easy/ValidPalindromeTest.java)

