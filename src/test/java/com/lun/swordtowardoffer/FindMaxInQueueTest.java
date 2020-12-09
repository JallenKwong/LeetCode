package com.lun.swordtowardoffer;

import java.util.Arrays;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class FindMaxInQueueTest {

	@Test
	public void test() {
		FindMaxInQueue fq = new FindMaxInQueue();
		
		Assert.assertThat(fq.maxInWindows(Arrays.asList(2, 3, 4, 2, 6, 2, 5, 1), 3)
				, CoreMatchers.is(Arrays.asList(4, 4, 6, 6, 6, 5)));
	}
	
}
