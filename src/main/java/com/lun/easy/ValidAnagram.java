package com.lun.easy;

import java.util.Arrays;

public class ValidAnagram {
	
	public boolean isAnagram1(String s, String t) {
		if (s == null || t == null || s.length() != t.length())
			return false;

		int[] array = new int[26];

		for (int i = 0; i < s.length(); i++) {
			array[s.charAt(i) - 'a']++;
		}

		for (int i = 0; i < t.length(); i++) {
			array[t.charAt(i) - 'a']--;
		}

		for (int elem : array) {
			if (elem != 0)
				return false;
		}

		return true;
	}

	public boolean isAnagram2(String s, String t) {
		char[] sChar = s.toCharArray();
		char[] tChar = t.toCharArray();

		Arrays.sort(sChar);
		Arrays.sort(tChar);

		return Arrays.equals(sChar, tChar);
	}

}
