package com.lun.medium;

import static org.junit.Assert.*;
import org.junit.Test;

public class LongestSubstringWithoutRepeatingCharactersTest {

	@Test
	public void test() {
		LongestSubstringWithoutRepeatingCharacters obj = new LongestSubstringWithoutRepeatingCharacters();

		assertEquals(3, obj.lengthOfLongestSubstring1("abcabcbb"));
		assertEquals(1, obj.lengthOfLongestSubstring1("bbbbb"));
		assertEquals(3, obj.lengthOfLongestSubstring1("pwwkew"));
		assertEquals(0, obj.lengthOfLongestSubstring1(""));
		assertEquals(1, obj.lengthOfLongestSubstring1(" "));
		assertEquals(3, obj.lengthOfLongestSubstring1("dvdf"));
		assertEquals(2, obj.lengthOfLongestSubstring1("abba"));
		
		assertEquals(3, obj.lengthOfLongestSubstring2("abcabcbb"));
		assertEquals(1, obj.lengthOfLongestSubstring2("bbbbb"));
		assertEquals(3, obj.lengthOfLongestSubstring2("pwwkew"));
		assertEquals(0, obj.lengthOfLongestSubstring2(""));
		assertEquals(1, obj.lengthOfLongestSubstring2(" "));
		assertEquals(3, obj.lengthOfLongestSubstring2("dvdf"));
		assertEquals(2, obj.lengthOfLongestSubstring2("abba"));
		
		assertEquals(3, obj.lengthOfLongestSubstring3("abcabcbb"));
		assertEquals(1, obj.lengthOfLongestSubstring3("bbbbb"));
		assertEquals(3, obj.lengthOfLongestSubstring3("pwwkew"));
		assertEquals(0, obj.lengthOfLongestSubstring3(""));
		assertEquals(1, obj.lengthOfLongestSubstring3(" "));
		assertEquals(3, obj.lengthOfLongestSubstring3("dvdf"));
		assertEquals(2, obj.lengthOfLongestSubstring3("abba"));
		
		assertEquals(3, obj.lengthOfLongestSubstring4("abcabcbb"));
		assertEquals(1, obj.lengthOfLongestSubstring4("bbbbb"));
		assertEquals(3, obj.lengthOfLongestSubstring4("pwwkew"));
		assertEquals(0, obj.lengthOfLongestSubstring4(""));
		assertEquals(1, obj.lengthOfLongestSubstring4(" "));
		assertEquals(3, obj.lengthOfLongestSubstring4("dvdf"));
		assertEquals(2, obj.lengthOfLongestSubstring4("abba"));
	}
}
