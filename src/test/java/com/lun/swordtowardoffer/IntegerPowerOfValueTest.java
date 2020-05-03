package com.lun.swordtowardoffer;

import java.util.function.BiFunction;

import org.junit.Assert;
import org.junit.Test;

public class IntegerPowerOfValueTest {

	private double delta = 1e-6;
	
	@Test
	public void testEqual() {
        double a = 1.000001;
        double b = 0.000001;
		
        //Assert.assertTrue(a - b == 1);
		Assert.assertTrue(IntegerPowerOfValue.equal(a - b, 1.0));
	}
	
	@Test
	public void testPowerWithExponent() {
		Assert.assertEquals(1, IntegerPowerOfValue.powerWithExponent(1, 0), delta);
		Assert.assertEquals(1, IntegerPowerOfValue.powerWithExponent(2, 0), delta);
		Assert.assertEquals(4, IntegerPowerOfValue.powerWithExponent(2, 2), delta);
		Assert.assertEquals(27, IntegerPowerOfValue.powerWithExponent(3, 3), delta);
		
		Assert.assertEquals(8, IntegerPowerOfValue.powerWithExponent(2, 3), delta);
		Assert.assertEquals(16, IntegerPowerOfValue.powerWithExponent(2, 4), delta);
		Assert.assertEquals(32, IntegerPowerOfValue.powerWithExponent(2, 5), delta);
		Assert.assertEquals(64, IntegerPowerOfValue.powerWithExponent(2, 6), delta);
		Assert.assertEquals(128, IntegerPowerOfValue.powerWithExponent(2, 7), delta);
	}
	
	@Test
	public void testPowerWithExponent2() {
		Assert.assertEquals(1, IntegerPowerOfValue.powerWithExponent2(1, 0), delta);
		Assert.assertEquals(1, IntegerPowerOfValue.powerWithExponent2(2, 0), delta);
		Assert.assertEquals(4, IntegerPowerOfValue.powerWithExponent2(2, 2), delta);
		Assert.assertEquals(27, IntegerPowerOfValue.powerWithExponent2(3, 3), delta);
		
		Assert.assertEquals(8, IntegerPowerOfValue.powerWithExponent2(2, 3), delta);
		Assert.assertEquals(16, IntegerPowerOfValue.powerWithExponent2(2, 4), delta);
		Assert.assertEquals(32, IntegerPowerOfValue.powerWithExponent2(2, 5), delta);
		Assert.assertEquals(64, IntegerPowerOfValue.powerWithExponent2(2, 6), delta);
		Assert.assertEquals(128, IntegerPowerOfValue.powerWithExponent2(2, 7), delta);
	}
	
	@Test
	public void testPowerWithExponent3() {
			
		Assert.assertEquals(1, IntegerPowerOfValue.powerWithExponent3(1, 0), delta);
		Assert.assertEquals(1, IntegerPowerOfValue.powerWithExponent3(2, 0), delta);
		Assert.assertEquals(4, IntegerPowerOfValue.powerWithExponent3(2, 2), delta);
		Assert.assertEquals(27, IntegerPowerOfValue.powerWithExponent3(3, 3), delta);
		
		Assert.assertEquals(8, IntegerPowerOfValue.powerWithExponent3(2, 3), delta);
		Assert.assertEquals(16, IntegerPowerOfValue.powerWithExponent3(2, 4), delta);
		Assert.assertEquals(32, IntegerPowerOfValue.powerWithExponent3(2, 5), delta);
		Assert.assertEquals(64, IntegerPowerOfValue.powerWithExponent3(2, 6), delta);
		Assert.assertEquals(128, IntegerPowerOfValue.powerWithExponent3(2, 7), delta);
		
		Assert.assertEquals(7776, IntegerPowerOfValue.powerWithExponent3(6, 5), delta);
		
	}
	
	@Test
	public void testPower() {
		Assert.assertEquals(1, IntegerPowerOfValue.power(1, 0), delta);
		Assert.assertEquals(1, IntegerPowerOfValue.power(2, 0), delta);
		Assert.assertEquals(4, IntegerPowerOfValue.power(2, 2), delta);
		Assert.assertEquals(27, IntegerPowerOfValue.power(3, 3), delta);
		Assert.assertEquals(8, IntegerPowerOfValue.power(2, 3), delta);
		Assert.assertEquals(16, IntegerPowerOfValue.power(2, 4), delta);
		Assert.assertEquals(32, IntegerPowerOfValue.power(2, 5), delta);
		Assert.assertEquals(64, IntegerPowerOfValue.power(2, 6), delta);
		Assert.assertEquals(128, IntegerPowerOfValue.power(2, 7), delta);
		Assert.assertEquals(7776, IntegerPowerOfValue.power(6, 5), delta);
		
		Assert.assertEquals(1, IntegerPowerOfValue.power(1, -0), delta);
		Assert.assertEquals(1, IntegerPowerOfValue.power(2, -0), delta);
		Assert.assertEquals(1.0 / 4, IntegerPowerOfValue.power(2, -2), delta);
		Assert.assertEquals(1.0 / 27, IntegerPowerOfValue.power(3, -3), delta);
		Assert.assertEquals(1.0 / 8, IntegerPowerOfValue.power(2, -3), delta);
		Assert.assertEquals(1.0 / 16, IntegerPowerOfValue.power(2, -4), delta);
		Assert.assertEquals(1.0 / 32, IntegerPowerOfValue.power(2, -5), delta);
		Assert.assertEquals(1.0 / 64, IntegerPowerOfValue.power(2, -6), delta);
		Assert.assertEquals(1.0 / 128, IntegerPowerOfValue.power(2, -7), delta);
		Assert.assertEquals(1.0 / 7776, IntegerPowerOfValue.power(6, -5), delta);
	}
	
	@Test
	public void testPowerWithBiFunction() {
		
		//Strategy pattern
		BiFunction<Double, Integer, Double> coreFunction = (base, exponent)->{
			return IntegerPowerOfValue.powerWithExponent3(base, exponent);
		};
		
		Assert.assertEquals(1, IntegerPowerOfValue.power(1, 0, coreFunction), delta);
		Assert.assertEquals(1.0 / 7776, IntegerPowerOfValue.power(6, -5, coreFunction), delta);
	}
	

}
