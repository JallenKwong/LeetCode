package com.lun.easy;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PascalsTriangleTest {

	@Test
	public void test() {
		PascalsTriangle obj = new PascalsTriangle();

		List<List<Integer>> expected = new ArrayList<List<Integer>>();
		
		expected.add(Arrays.asList(1));
		expected.add(Arrays.asList(1,1));
		expected.add(Arrays.asList(1,2,1));
		expected.add(Arrays.asList(1,3,3,1));
		expected.add(Arrays.asList(1,4,6,4,1));
		
		assertThat(obj.generate1(5), is(expected));
		assertThat(obj.generate2(5), is(expected));
		
		
	}
}
