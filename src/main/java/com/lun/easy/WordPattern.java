package com.lun.easy;

import java.util.HashMap;
import java.util.Objects;

public class WordPattern {
	// 方法一：我写的，双向映射
	public boolean wordPattern1(String pattern, String s) {
		// 双向映射
		HashMap<Character, Integer> aMap = new HashMap<>();
		HashMap<String, Integer> bMap = new HashMap<>();

		String[] words = s.split(" ");

		if (pattern.length() != words.length)
			return false;

		int count = 0;// 这可省略，改用下面循环体的i变量

		for (int i = 0; i < pattern.length(); i++) {
			Character cr = pattern.charAt(i);
			Integer id1 = aMap.get(cr);
			Integer id2 = bMap.get(words[i]);
			if (id1 == null && id2 == null) {
				aMap.put(cr, count);
				bMap.put(words[i], count++);
			} else {
				if (id1 != id2)// 这要改成Objects.equals()
					return false;
			}
		}

		return true;
	}

	// 方法二：双向映射，比方法一更简洁
	public boolean wordPattern2(String pattern, String s) {
		String[] words = s.split(" ");
		if (words.length != pattern.length())
			return false;
		HashMap<Object, Object> index = new HashMap<>();// key即可放Character，亦可放String，很聪明
		for (Integer i = 0; i < words.length; ++i)
			if (!Objects.equals(index.put(pattern.charAt(i), i), //
					index.put(words[i], i)))
				return false;
		return true;
	}

}
