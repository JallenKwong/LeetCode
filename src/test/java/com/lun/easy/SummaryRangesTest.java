package com.lun.easy;

import static org.junit.Assert.*;

import org.hamcrest.collection.IsEmptyCollection;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;

import org.junit.Test;

public class SummaryRangesTest {

	@Test
	public void test() {
		SummaryRanges obj = new SummaryRanges();

		assertThat(obj.summaryRanges1(new int[] {0, 1, 2, 4, 5, 7}), //
				contains("0->2", "4->5", "7"));
		assertThat(obj.summaryRanges1(new int[] {0, 2, 3, 4, 6, 8, 9}), // 
				contains("0","2->4","6","8->9"));
		assertThat(obj.summaryRanges1(new int[] {}), IsEmptyCollection.empty());
		
		assertThat(obj.summaryRanges1(new int[] {-1}), contains("-1"));
		assertThat(obj.summaryRanges1(new int[] {0}), contains("0"));
		
		
		assertThat(obj.summaryRanges2(new int[] {0, 1, 2, 4, 5, 7}), //
				contains("0->2", "4->5", "7"));
		assertThat(obj.summaryRanges2(new int[] {0, 2, 3, 4, 6, 8, 9}), // 
				contains("0","2->4","6","8->9"));
		assertThat(obj.summaryRanges2(new int[] {}), IsEmptyCollection.empty());
		
		assertThat(obj.summaryRanges2(new int[] {-1}), contains("-1"));
		assertThat(obj.summaryRanges2(new int[] {0}), contains("0"));
		
	}
}
