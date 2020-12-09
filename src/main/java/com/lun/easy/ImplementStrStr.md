# ImplementStrStr #

[Source Code](ImplementStrStr.java)

[Test Code](ImplementStrStrTest.java)

## Topic

Two Pointers, String

## Description

[https://leetcode.com/problems/implement-strstr/](https://leetcode.com/problems/implement-strstr/)

Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

> needle /ˈniːdl/ n.针
>
> haystack /ˈheɪstæk/ n.干草堆
>
> **a needle in a haystack**：something that is impossible or extremely difficult to find, especially because the area you have to search is too large（类似中文的“大海捞针”）:
>
> Finding the piece of paper I need in this huge pile of documents is like looking for/trying to find **a needle in a haystack**。
>
> [Link](https://dictionary.cambridge.org/us/dictionary/english/a-needle-in-a-haystack#:~:text=a%20needle%20in%20a%20haystack%20meaning%3A%201.%20something,find%2C%20especially%20because%20the%20area%20you%E2%80%A6.%20Learn%20more.)




**Clarification**:

What should we return when needle is an empty string? This is a great question to ask during an interview.

For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().


**Example 1**:

```
Input: haystack = "hello", needle = "ll"
Output: 2
```

**Example 2**:

```
Input: haystack = "aaaaa", needle = "bba"
Output: -1
```

**Example 3**:

```
Input: haystack = "", needle = ""
Output: 0
```

**Constraints**:

- 0 <= haystack.length, needle.length <= 5 * 104
- haystack and needle consist of only lower-case English characters.

## Analysis

方法一：双指针

方法二：KMP算法（略）

## Submission


```java
public class ImplementStrStr {
	public int strStr(String haystack, String needle) {
		
		for (int i = 0;; i++) {
			for (int j = 0;; j++) {
				if (j == needle.length())
					return i;
				if (i + j == haystack.length())
					return -1;
				if (needle.charAt(j) != haystack.charAt(i + j))
					break;
			}
		}
	}
}

```

## Test

```java
import static org.junit.Assert.*;
import org.junit.Test;

public class ImplementStrStrTest {

	@Test
	public void test() {
		ImplementStrStr obj = new ImplementStrStr();

		assertEquals(2, obj.strStr("hello", "ll"));
		assertEquals(-1, obj.strStr("aaaaaa", "bba"));
		assertEquals(0, obj.strStr("", ""));
		assertEquals(-1, obj.strStr("aaa", "aaaa"));
		
		//"".indexOf("");
	}
}
```
