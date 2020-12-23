package com.lun.easy;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;
import java.util.Arrays;


import org.junit.Test;

public class PascalsTriangleIITest {

	@Test
	public void test() {
		PascalsTriangleII obj = new PascalsTriangleII();

		assertThat(obj.getRow(3), is(new ArrayList<>(Arrays.asList(1, 3, 3, 1))));
		assertThat(obj.getRow(0), is(new ArrayList<>(Arrays.asList(1))));
		assertThat(obj.getRow(1), is(new ArrayList<>(Arrays.asList(1, 1))));
		assertThat(obj.getRow(4), is(new ArrayList<>(Arrays.asList(1, 4, 6, 4, 1))));
	}
}
