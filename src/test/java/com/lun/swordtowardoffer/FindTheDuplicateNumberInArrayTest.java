package com.lun.swordtowardoffer;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

public class FindTheDuplicateNumberInArrayTest {
	
	@Test
	public void test() {
		FindTheDuplicateNumberInArray fa = new FindTheDuplicateNumberInArray();
		int[] array = {2, 3, 1, 0, 2, 5, 3};
		Assert.assertThat(fa.find(array), anyOf(is(2), is(3)));
	}
	
}
