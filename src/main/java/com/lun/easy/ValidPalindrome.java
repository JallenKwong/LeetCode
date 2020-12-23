package com.lun.easy;

public class ValidPalindrome {

	public boolean isPalindrome1(String s) {
		if (s == null)
			return false;
		s = s.toLowerCase();

		int left = 0, right = s.length() - 1;
		while (left < right) {
			char leftChar = s.charAt(left);
			if (!isNum(leftChar) && !isLetter(leftChar)) {
				left++;
				continue;
			}

			char rightChar = s.charAt(right);
			if (!isNum(rightChar) && !isLetter(rightChar)) {
				right--;
				continue;
			}

			if (leftChar == rightChar) {
				left++;
				right--;
			} else {
				return false;
			}
		}

		return true;
	}

	private boolean isNum(char c) {
		return '0' <= c && c <= '9';
	}

	private boolean isLetter(char c) {
		return 'a' <= c && c <= 'z';
	}

	public boolean isPalindrome2(String s) {
		if (s.isEmpty()) {
			return true;
		}
		int head = 0, tail = s.length() - 1;
		char cHead, cTail;
		while (head <= tail) {
			cHead = s.charAt(head);
			cTail = s.charAt(tail);
			if (!Character.isLetterOrDigit(cHead)) {
				head++;
			} else if (!Character.isLetterOrDigit(cTail)) {
				tail--;
			} else {
				if (Character.toLowerCase(cHead) != Character.toLowerCase(cTail)) {
					return false;
				}
				head++;
				tail--;
			}
		}

		return true;
	}

	public boolean isPalindrome3(String s) {
		String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
		String rev = new StringBuffer(actual).reverse().toString();
		return actual.equals(rev);
	}

}
