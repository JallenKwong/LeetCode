package com.lun.swordtowardoffer;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Assert;
import org.junit.Test;

public class FindTheDuplicateNumberInArray2Test {

	@Test
	public void test() {
		FindTheDuplicateNumberInArray2 fa = new FindTheDuplicateNumberInArray2();
		int[] array = {2, 3, 5, 4, 3, 2, 6, 7};
		Assert.assertThat(fa.find(array), anyOf(is(2), is(3)));
	}
	
}
