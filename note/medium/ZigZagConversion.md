# ZigZagConversion

## Topic

- String

## Description

[https://leetcode.com/problems/zigzag-conversion/](https://leetcode.com/problems/zigzag-conversion/)

The string `"PAYPALISHIRING"` is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

```
P   A   H   N
A P L S I I G
Y   I   R
```

And then read line by line: `"PAHNAPLSIIGYIR"`

Write the code that will take a string and make this conversion given a number of rows:

```
string convert(string s, int numRows);
```

**Example 1**:

```
Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
```

**Example 2**:
```
Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I
```

**Example 3**:

```
Input: s = "A", numRows = 1
Output: "A"
```

**Constraints**:

- 1 <= s.length <= 1000
- `s` consists of English letters (lower-case and upper-case), ',' and '.'.
- 1 <= numRows <= 1000

## Analysis

分析Example 2，Input: s = "PAYPALISHIRING", numRows = 4

```
            3           3
group     2   2       2   2
        1       1   1        1     1
      0           0             0
index 0 1 2 3 4 5 6 7 8 9 10 11 12 13
  s   P A Y P A L I S H I R  I  N  G
```

按group号，分别收集字符，最后到汇总输出。


## Code

[Source Code](../../src/main/java/com/lun/medium/ZigZagConversion.java)

[Test Code](../../src/test/java/com/lun/medium/ZigZagConversionTest.java)

