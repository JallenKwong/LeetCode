package com.lun.easy;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

	public boolean isIsomorphic1(String s, String t) {

		Map<Character, Integer> cache1 = new HashMap<>();
		Map<Character, Integer> cache2 = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			if (cache1.get(s.charAt(i)) != cache2.get(t.charAt(i)))
				return false;
			cache1.put(s.charAt(i), i + 1);
			cache2.put(t.charAt(i), i + 1);
		}

		return true;
	}

	public boolean isIsomorphic2(String s, String t) {
		int[] m = new int[512];
		for (int i = 0; i < s.length(); i++) {
			if (m[s.charAt(i)] != m[t.charAt(i) + 256])
				return false;
			m[s.charAt(i)] = m[t.charAt(i) + 256] = i + 1;
		}
		return true;
	}

}
