package com.lun.swordtowardoffer;

import java.util.function.BiFunction;

public class IntegerPowerOfValue {
	
	public static double power(double base, int exponent) {
		if(equal(base, 0.0) && exponent < 0) {
			return 0.0;
		}
		int absExponent = Math.abs(exponent);
		double result = powerWithExponent(base, absExponent);
		if(exponent < 0) {
			result = 1 / result;
		}
		return result;
	}
	
	
	public static double powerWithExponent(double base, int absExponent) {
		double result = 1.0;
		
		for(int i = 1; i <= absExponent; i++) {
			result *= base;
		}
		
		return result;
	}
	
	public static boolean equal(double d1, double d2) {
		return Math.abs(d1 - d2) <= 0.000001;
	}
	
	public static double powerWithExponent2(double base, int exponent) {
		
		if(exponent == 0) {
			return 1;
		}
		if(exponent == 1) {
			return base;
		}
		
		double result = powerWithExponent2(base, exponent / 2);
		result *= result;
		
		if((exponent & 1) == 1) {//
			result *= base;
		}
		return result;
	}
	
	/**
	 * 
	 * @param base
	 * @param exponent
	 * @return
	 */
	public static double powerWithExponent3(double base, int exponent) {
		String binary = "";
		
		while(exponent != 0) {
			binary = (exponent & 1) + binary;
			exponent >>>= 1;
		}
		
		double result = 1;
		for(int i = 0; i < binary.length(); i++) {
			result = result * result * (binary.charAt(i) == '1' ? base : 1);
		}
		return result;
	}
	
	
	public static double power(double base, int exponent, BiFunction<Double, Integer, Double> coreFunction) {
		if(equal(base, 0.0) && exponent < 0) {
			return 0.0;
		}
		int absExponent = Math.abs(exponent);
		
		double result = coreFunction.apply(base, absExponent);
		if(exponent < 0) {
			result = 1 / result;
		}
		return result;
	}
	
}
