Find the total area covered by two **rectilinear** rectangles in a 2D plane.

Each rectangle is defined by its bottom left corner and top right corner as shown in the figure.

![](image/rectangle_area.png)

Example:

	Input: A = -3, B = 0, C = 3, D = 4, E = 0, F = -1, G = 9, H = 2
	Output: 45

**Note**:

Assume that the total area is never beyond the maximum possible value of **int**.


**Thinking**

面积 = 两个矩形的面积和 - 重叠的面积

重心放在重叠面积的计算

也就是找出两个矩形的不同的相对位置得出左下点与右上点

分析两个矩形的不同的相对位置过程不复杂但繁琐，像中学时期的代数问题