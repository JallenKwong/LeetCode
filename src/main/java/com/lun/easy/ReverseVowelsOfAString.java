package com.lun.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ReverseVowelsOfAString {

	private static final Set<Character> VOWELS = //
			new HashSet<>(Arrays.asList('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'));

	public String reverseVowels(String s) {
		if (s == null || s.length() == 0)
			return s;

		char[] array = s.toCharArray();
		int left = 0, right = array.length - 1;

		while (left < right) {
			while (left < right && !VOWELS.contains(array[left]))
				left++;

			while (left < right && !VOWELS.contains(array[right]))
				right--;

			char temp = array[left];
			array[left++] = array[right];
			array[right--] = temp;
		}

		return new String(array);
	}
}
