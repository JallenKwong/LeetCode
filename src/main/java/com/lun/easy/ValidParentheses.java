package com.lun.easy;

import java.util.LinkedList;

public class ValidParentheses {

	// 方法一：我写的
	public boolean isValid1(String s) {
		LinkedList<Character> stack = new LinkedList<>();
		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);

			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
				continue;
			}

			if ((c == ')' || c == '}' || c == ']') && stack.isEmpty()) {
				return false;
			}

			char topOne = stack.peek();
			if (c == ')' && topOne == '(' || //
					c == '}' && topOne == '{' || //
					c == ']' && topOne == '[') {
				stack.pop();
				continue;
			}

			if ((c == ')' || c == '}' || c == ']')) {
				stack.push(c);
			}

		}

		return stack.isEmpty();
	}

	// 方法二：
	public boolean isValid2(String s) {
		LinkedList<Character> stack = new LinkedList<>();
		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);
			if (c == '(')
				stack.push(')');//栈中没必要存存左括号(、{、[
			else if (c == '{')
				stack.push('}');
			else if (c == '[')
				stack.push(']');
			else if (stack.isEmpty() || stack.pop() != c)
				return false;
		}
		return stack.isEmpty();
	}

	// 方法三：
	public boolean isValid3(String s) {
		LinkedList<Character> stack = new LinkedList<>();
		// Iterate through string until empty
		for (int i = 0; i < s.length(); i++) {
			// Push any open parentheses onto stack
			if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
				stack.push(s.charAt(i));
			// Check stack for corresponding closing parentheses, false if not valid
			else if (s.charAt(i) == ')' && !stack.isEmpty() && stack.peek() == '(')
				stack.pop();
			else if (s.charAt(i) == ']' && !stack.isEmpty() && stack.peek() == '[')
				stack.pop();
			else if (s.charAt(i) == '}' && !stack.isEmpty() && stack.peek() == '{')
				stack.pop();
			else
				return false;
		}
		// return true if no open parentheses left in stack
		return stack.isEmpty();
	}

	// 方法四：
	public boolean isValid4(String s) {
		LinkedList<Integer> stack = new LinkedList<>();
		for (int i = 0; i < s.length(); i++) {
			int q = "(){}[]".indexOf(s.substring(i, i + 1));
			if (q % 2 == 1) {// )、}、]的情况
				if (stack.isEmpty() || stack.pop() != q - 1)
					return false;
			} else { // (、{、[的情况
				stack.push(q);
			}
		}
		return stack.isEmpty();
	}

}
