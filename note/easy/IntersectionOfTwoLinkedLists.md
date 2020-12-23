# IntersectionOfTwoLinkedLists #

## Topic

- Linked List
- Two Pointers

## Description

[https://leetcode.com/problems/intersection-of-two-linked-lists/](https://leetcode.com/problems/intersection-of-two-linked-lists/)

Write a program to find the node at which the intersection of two singly linked lists begins.

For example, the following two linked lists:

```
A:          a1 → a3
                   ↘
                     c1 → c2 → c3 → NULL
                   ↗
B:     b1 → b2 → b3
```

begin to intersect at node c1.

**Example 1**:

```
A:     4 → 1
            ↘
              8 → 4 → 5 → NULL
            ↗
B: 5 → 6 → 1

Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
Output: Reference of the node with value = 8
Input Explanation: The intersected node's value is 8 (note that this must not be 0 if the two lists intersect). From the head of A, it reads as [4,1,8,4,5]. From the head of B, it reads as [5,6,1,8,4,5]. There are 2 nodes before the intersected node in A; There are 3 nodes before the intersected node in B.
```

**Example 2**:

```
A: 1 → 9 → 1
            ↘
              2 → 4 → NULL
            ↗
B:         1

Input: intersectVal = 2, listA = [1,9,1,2,4], listB = [3,2,4], skipA = 3, skipB = 1
Output: Reference of the node with value = 2
Input Explanation: The intersected node's value is 2 (note that this must not be 0 if the two lists intersect). From the head of A, it reads as [1,9,1,2,4]. From the head of B, it reads as [3,2,4]. There are 3 nodes before the intersected node in A; There are 1 node before the intersected node in B.
```

**Example 3**:

```

A: 2 → 6 → 4 → NULL
B:     1 → 5 → NULL

Input: intersectVal = 0, listA = [2,6,4], listB = [1,5], skipA = 3, skipB = 2
Output: null
Input Explanation: From the head of A, it reads as [2,6,4]. From the head of B, it reads as [1,5]. Since the two lists do not intersect, intersectVal must be 0, while skipA and skipB can be arbitrary values.
Explanation: The two lists do not intersect, so return null.
```

**Notes**:

- If the two linked lists have no intersection at all, return `null`.
- The linked lists must retain their original structure after the function returns.
- You may assume there are no cycles anywhere in the entire linked structure.
- Each value on each linked list is in the range [1, 10^9].
- Your code should preferably run in O(n) time and use only O(1) memory.


## Analysis

方法一：我写的

1. 量两链表长度。
2. 用两指针分别指向两链表头，长链先跑，步数为两链表长度差。
3. 接着两指针齐步走，直到两指针相等，返回其中一个指针。

---

方法二：别人写的，比方法一精简些。

---

方法三：互补遍历，两次遍历便能得相交点（挺巧妙的）

We can use two iterations to do that. In the first iteration, we will reset the pointer of one linkedlist to the head of another linkedlist after it reaches the tail node. In the second iteration, we will move two pointers until they points to the same node. Our operations in first iteration will help us counteract the difference. So if two linkedlist intersects, the meeting point in second iteration must be the intersection point. If the two linked lists have no intersection at all, then the meeting pointer in second iteration must be the tail node of both lists, which is null.

**Visualization of this solution**:

**Case 1 (Have Intersection & Same Len)**:

```
       a
A:     a1 → a2 → a3
                   ↘
                     c1 → c2 → c3 → null
                   ↗
B:     b1 → b2 → b3
       b

            a
A:     a1 → a2 → a3
                   ↘
                     c1 → c2 → c3 → null
                   ↗
B:     b1 → b2 → b3
            b

                 a
A:     a1 → a2 → a3
                   ↘
                     c1 → c2 → c3 → null
                   ↗
B:     b1 → b2 → b3
                 b

A:     a1 → a2 → a3
                   ↘ a
                     c1 → c2 → c3 → null
                   ↗ b
B:     b1 → b2 → b3
```
Since a == b is true, end loop while(a != b), return the intersection node a = c1.


**Case 2 (Have Intersection & Different Len)**:

```
            a
A:          a1 → a2
                   ↘
                     c1 → c2 → c3 → null
                   ↗
B:     b1 → b2 → b3
       b

                 a
A:          a1 → a2
                   ↘
                     c1 → c2 → c3 → null
                   ↗
B:     b1 → b2 → b3
            b

A:          a1 → a2
                   ↘ a
                     c1 → c2 → c3 → null
                   ↗
B:     b1 → b2 → b3
                 b

A:          a1 → a2
                   ↘      a
                     c1 → c2 → c3 → null
                   ↗ b
B:     b1 → b2 → b3

A:          a1 → a2
                   ↘           a
                     c1 → c2 → c3 → null
                   ↗      b
B:     b1 → b2 → b3

A:          a1 → a2
                   ↘                a = null, then a = b1
                     c1 → c2 → c3 → null
                   ↗           b
B:     b1 → b2 → b3

A:          a1 → a2
                   ↘
                     c1 → c2 → c3 → null
                   ↗                b = null, then b = a1
B:     b1 → b2 → b3
       a

            b
A:          a1 → a2
                   ↘
                     c1 → c2 → c3 → null
                   ↗
B:     b1 → b2 → b3
            a

                 b
A:          a1 → a2
                   ↘
                     c1 → c2 → c3 → null
                   ↗
B:     b1 → b2 → b3
                 a

A:          a1 → a2
                   ↘ b
                     c1 → c2 → c3 → null
                   ↗ a
B:     b1 → b2 → b3
```

Since a == b is true, end loop while(a != b), return the intersection node a = c1.


**Case 3 (Have No Intersection & Same Len)**:

```
       a
A:     a1 → a2 → a3 → null
B:     b1 → b2 → b3 → null
       b

            a
A:     a1 → a2 → a3 → null
B:     b1 → b2 → b3 → null
            b

                 a
A:     a1 → a2 → a3 → null
B:     b1 → b2 → b3 → null
                 b

                      a = null
A:     a1 → a2 → a3 → null
B:     b1 → b2 → b3 → null
                      b = null
```
Since a == b is true (both refer to null), end loop while(a != b), return a = null.

**Case 4 (Have No Intersection & Different Len)**:

```
       a
A:     a1 → a2 → a3 → a4 → null
B:     b1 → b2 → b3 → null
       b

            a
A:     a1 → a2 → a3 → a4 → null
B:     b1 → b2 → b3 → null
            b

                 a
A:     a1 → a2 → a3 → a4 → null
B:     b1 → b2 → b3 → null
                 b

                      a
A:     a1 → a2 → a3 → a4 → null
B:     b1 → b2 → b3 → null
                      b = null, then b = a1

       b                   a = null, then a = b1
A:     a1 → a2 → a3 → a4 → null
B:     b1 → b2 → b3 → null

            b 
A:     a1 → a2 → a3 → a4 → null
B:     b1 → b2 → b3 → null
       a

                 b
A:     a1 → a2 → a3 → a4 → null
B:     b1 → b2 → b3 → null
            a

                      b
A:     a1 → a2 → a3 → a4 → null
B:     b1 → b2 → b3 → null
                 a

                           b = null
A:     a1 → a2 → a3 → a4 → null
B:     b1 → b2 → b3 → null
                      a = null
```

Since a == b is true (both refer to null), end loop while(a != b), return a = null.

Notice that if list A and list B have the **same length**, this solution will terminate in **no more than 1 traversal**; if both lists have different lengths, this solution will terminate in **no more than 2 traversals** -- in the second traversal, swapping a and b synchronizes a and b before the end of the second traversal. By synchronizing a and b I mean both have the same remaining steps in the second traversal so that it's guaranteed for them to reach the first intersection node, or reach null at the same time (technically speaking, in the same iteration) -- see **Case 2 (Have Intersection & Different Len)** and **Case 4 (Have No Intersection & Different Len)**.

PS: There are many great explanations of this solution for various cases, I believe to visualize it can resolve most of the doubts posted previously.

## Code

[Source Code](IntersectionOfTwoLinkedLists.java)

[Test Code](../../../../../test/java/com/lun/easy/IntersectionOfTwoLinkedListsTest.java)

