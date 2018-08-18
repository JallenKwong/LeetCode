package com.lun.medium;

import org.junit.Assert;
import org.junit.Test;

public class EvaluateDivisionTest{
	
	@Test
	public void calcEquation(){
		String[][] equations = {{"a","b"},{"b","c"}};
		double[] values = {2.0,3.0};
		String[][] queries = {{"a","c"},{"b","a"},{"a","e"},{"a","a"},{"x","x"}};
		
		double[] result = new EvaluateDivision().calcEquation(equations, values, queries);
		Assert.assertArrayEquals(new double[]{6.0, 0.5, -1.0, 1.0, -1.0}, result , 0);
	}
}
