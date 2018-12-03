package com.lun.hard;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class WordBreakIITest {

	@Test
	public void test() {
		String s = "catsanddog";
		List<String> wordDict = Arrays.asList("cat", "cats", "and", "sand", "dog");
		
		assertThat(new WordBreakII().wordBreak(s, wordDict)
				, containsInAnyOrder("cats and dog", "cat sand dog"));
	}

	@Test
	public void test2() {
		String s = "pineapplepenapple";
		List<String> wordDict = Arrays.asList("apple", "pen", "applepen", "pine", "pineapple");
		String[] results = {"pine apple pen apple",
										"pineapple pen apple", "pine applepen apple"};
		
		assertThat(new WordBreakII().wordBreak(s, wordDict), containsInAnyOrder(results));
	}
	
	@Test
	public void test3() {
		String s = "catsandog";
		List<String> wordDict = Arrays.asList("cat", "cats", "and", "sand", "dog");
		List<String> resultList = Arrays.asList();
		
		assertThat(new WordBreakII().wordBreak(s, wordDict), is(resultList));
	}

}
