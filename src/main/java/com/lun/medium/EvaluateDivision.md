# Evaluate Division #

Equations are given in the format **A / B = k**, where **A** and **B** are variables represented as strings, and **k** is a real number (floating point number). Given some queries, return the answers. If the answer does not exist, return **-1.0**.

Example:
Given **a / b = 2.0, b / c = 3.0.** 
queries are: **a / c = ?, b / a = ?, a / e = ?, a / a = ?, x / x = ? .** 
return **[6.0, 0.5, -1.0, 1.0, -1.0 ]**.

The input is: **vector<pair<string, string>> equations, vector<double>& values, vector<pair<string, string>> queries** , where **equations.size() == values.size()**, and the values are positive. This represents the equations. Return **vector<double>**.

According to the example above:

	equations = [ ["a", "b"], ["b", "c"] ],
	values = [2.0, 3.0],
	queries = [ ["a", "c"], ["b", "a"], ["a", "e"], ["a", "a"], ["x", "x"] ].

The input is always valid. You may assume that evaluating the queries will result in no division by zero and there is no contradiction.

**Thinking**

Image a/b = k as a link between node a and b, the weight from a to b is k, the reverse link is 1/k. Query is to find a path between two nodes.

应用图论中寻找路径