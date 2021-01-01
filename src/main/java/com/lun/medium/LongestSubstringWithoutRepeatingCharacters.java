package com.lun.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

	//方法一：我写的，使用双指针 +哈希集
	public int lengthOfLongestSubstring1(String s) {
		int max = 0, count = 0;
		Map<Character, Integer> cache = new HashMap<>();
		for (int leftIndex = 0, rightIndex = 0; rightIndex < s.length(); rightIndex++) {
			char character = s.charAt(rightIndex);
			Integer existIndex = cache.get(character);

			if (existIndex != null && existIndex >= leftIndex) {
				if (count > max)
					max = count;
				count = rightIndex - existIndex;
				leftIndex = existIndex + 1;
			} else {
				count++;
			}
			cache.put(character, rightIndex);
		}
		return Math.max(max, count);// max()针对字符串完全无重复字符(如："abc")的情况
	}

	//方法二：比方法一精简些
	public int lengthOfLongestSubstring2(String s) {
		int max = 0, leftIndex = 0, rightIndex = 0;
		Map<Character, Integer> cache = new HashMap<>();
		for (; rightIndex < s.length(); rightIndex++) {
			char character = s.charAt(rightIndex);
			Integer existIndex = cache.get(character);
			if (existIndex != null && existIndex >= leftIndex) {
				max = Math.max(max, rightIndex - leftIndex);
				leftIndex = existIndex + 1;
			}
			cache.put(character, rightIndex);
		}
		return Math.max(max, rightIndex - leftIndex);
	}

	//方法三：使用移动窗口（队列）
	public int lengthOfLongestSubstring3(String s) {
		Queue<Character> queue = new LinkedList<>();
		int res = 0;
		for (char c : s.toCharArray()) {
			while (queue.contains(c)) {
				queue.poll();
			}
			queue.offer(c);
			res = Math.max(res, queue.size());
		}
		return res;
	}

	//方法四：使用双指针 +哈希集
	public int lengthOfLongestSubstring4(String s) {
		int maxLen = 0;
		Set<Character> window = new HashSet<>();

		int left = 0, right = 0;
		while (right < s.length()) {
			while (window.contains(s.charAt(right)))
				window.remove(s.charAt(left++));
			window.add(s.charAt(right++));
			maxLen = Math.max(maxLen, right - left);
		}

		return maxLen;
	}

}
