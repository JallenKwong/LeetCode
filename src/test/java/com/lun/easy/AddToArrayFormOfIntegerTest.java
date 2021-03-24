package com.lun.easy;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.Arrays;
import org.junit.Test;

public class AddToArrayFormOfIntegerTest {

	@Test
	public void test() {
		AddToArrayFormOfInteger obj = new AddToArrayFormOfInteger();

		assertThat(obj.addToArrayForm(new int[] { 1, 2, 0, 0 }, 34), is(Arrays.asList(1, 2, 3, 4)));
		assertThat(obj.addToArrayForm(new int[] { 2, 7, 4 }, 181), is(Arrays.asList(4, 5, 5)));
		assertThat(obj.addToArrayForm(new int[] { 2, 1, 5 }, 806), is(Arrays.asList(1, 0, 2, 1)));
		assertThat(obj.addToArrayForm(new int[] { 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 }, 1), //
				is(Arrays.asList(1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)));
	}
}
