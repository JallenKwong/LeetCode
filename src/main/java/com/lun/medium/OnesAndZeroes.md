# OnesAndZeroes #

tag:动态规划

[https://leetcode.com/problems/ones-and-zeroes/](https://leetcode.com/problems/ones-and-zeroes/)

In the computer world, use restricted resource you have to generate maximum benefit is what we always want to pursue.

For now, suppose you are a dominator of m 0s and n 1s respectively. On the other hand, there is an array with strings consisting of only 0s and 1s.

Now **your task** is to find the maximum number of strings that you can form with given m 0s and n 1s. Each 0 and 1 can be used at most once.

Note:

- The given numbers of 0s and 1s will both not exceed 100
- The size of given string array won't exceed 600.

---

	Example 1:
	Input: Array = {"10", "0001", "111001", "1", "0"}, m = 5, n = 3
	Output: 4
	
	Explanation: 
	This are totally 4 strings can be formed by the using of 5 0s and 3 1s, 
	which are “10,”0001”,”1”,”0”

---

	Example 2:
	Input: Array = {"10", "0", "1"}, m = 1, n = 1
	Output: 2
	
	Explanation: You could form "10", but then you'd have nothing left. Better form "0" and "1".

---

# Easy to understand Recursive Solutions in Java with Explanation #

[link](https://leetcode.com/problems/ones-and-zeroes/discuss/95845/Easy-to-understand-Recursive-Solutions-in-Java-with-Explanation)


As everyone told, this is a 0-1 Knapsack problem. In my solution, the focus is not time or memory efficiency. Instead, I would like to generate a code which is simple to understand and easy to maintain.

So, the main idea is, for each string, we will decide whether

- use remaining 0s and 1s (if there are enough of them) and count that string or
- do not use any 0s and 1s and skip that string entirely

Here is this solution:

```java
public class Solution {

  public int findMaxForm(String[] strs, int m, int n) {
    return findMaxFormStartingWith(strs, m, n, 0);
  }
	
  private int findMaxFormStartingWith(String[] strs, int m, int n, int begin) {
    if ((begin==strs.length) || (m+n==0)) {
      return 0;
    }
    int countByAddingString = 0;

    String current = strs[begin];
    int zeroes = countZeroesIn(current);
    int ones = current.length()-zeroes;

    if (m>=zeroes && n>=ones) {
      countByAddingString = 1 + findMaxFormStartingWith(strs, m-zeroes, n-ones, begin+1);
    }

    int countBySkippingString = findMaxFormStartingWith(strs, m, n, begin+1);
    if (countByAddingString > countBySkippingString) {
      return countByAddingString;
    }
    return countBySkippingString;
  }
	
  private int countZeroesIn(String str) {
    int count = 0;
    for (int i=0; i<str.length(); i++) {
      if (str.charAt(i) == '0') {
        count++;
      }
    }
    return count;
  }
}
```

With this code, for each string, we count the zeroes in it by **countZeroesIn(String str)** and see if there are enough 0s and 1s for it. If so, we accumulate that string and proceed with the remaining strings, 0s and 1s by means of the following code:

	countByAddingString = 1 + findMaxFormStartingWith(strs, m-zeroes, n-ones, begin+1);

We also take the other route, which simply skips the string and does not use any 0s and 1s.

	countBySkippingString = findMaxFormStartingWith(strs, m, n, begin+1);

Whichever is bigger, is that the result.

**The main problem with this approach is, it is too slow.** Why? Beacause, it does not take advantage of previously solved subproblems. The Dynamic Programming comes in to the scene. What we will add is a simple table, which holds the previous answers and return them whenever we need them.

**findMaxFormStartingWith(strs, m, n, begin)** is called by 4 parameters. The string array is provided for practical purposes. It can be simply left out by declaring a private field for the class. The actual parameters are the remaining 0s (**m**), 1s (**n**) and current string index **begin**. I preferred to create a 3D integer array to store and retrieve the results of subproblems. Each dimension represents the respective values of the parameters.

```java
  private int[][][] dpTable;

  public int findMaxForm(String[] strs, int m, int n) {
    dpTable = new int[m+1][n+1][strs.length];
    return findMaxFormStartingWith(strs, m, n, 0);
  }
```

The arrays in Java are 0-indexed, hence **m+1** and **n+1** make the array operations easier for us. With this array in our hands, we will have two extra operations:

- return the result if we have solved for these parameters before
- store the result for further access

These are the steps that decrease the time required to solve the problem. And these are the steps that we can use as **Dynamic Programming**.

This modification can be seen in the final version below.

```
  private int findMaxFormStartingWith(String[] strs, int m, int n, int begin) {
    if ((begin==strs.length) || (m+n==0)) {
      return 0;
    }
    // return the result if we have solved for these parameters before
    if (dpTable[m][n][begin] > 0) {
      return dpTable[m][n][begin];
    }
    int countByAddingString = 0;
    String current = strs[begin];
    int zeroes = countZeroesIn(current);
    int ones = current.length()-zeroes;
    if (m>=zeroes && n>=ones) {
      countByAddingString = 1 + findMaxFormStartingWith(strs, m-zeroes, n-ones, begin + 1);
    }
    int countBySkippingString = findMaxFormStartingWith(strs, m, n, begin+1);
    // store the result for further access
    if (countByAddingString > countBySkippingString) {
      dpTable[m][n][begin] = countByAddingString;
    } else {
      dpTable[m][n][begin] = countBySkippingString;
    }
    return dpTable[m][n][begin];
  }
```













