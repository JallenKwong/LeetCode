package com.lun.swordtowardoffer;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class SumOfNDicesTest {

	@Test
	public void test() {
		SumOfNDices sd = new SumOfNDices();
		double[] result = sd.getProbability(1);
		System.out.println(result.length);
		System.out.println(Arrays.toString(result));
	}

	@Test
	public void test2() {
		SumOfNDices sd = new SumOfNDices();
		double[] result = sd.getProbability(3);
		double[] result2 = sd.getProbability2(3);
		
		Assert.assertArrayEquals(result, result2, 1E-10);
	}
	
	@Test
	public void test3() {
		SumOfNDices sd = new SumOfNDices();
		double[] result = sd.getProbability(3);
		double[] result3 = sd.getProbability3(3);

		Assert.assertArrayEquals(result, result3, 1E-10);
	}
}
