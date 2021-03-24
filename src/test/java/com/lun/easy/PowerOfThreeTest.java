package com.lun.easy;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;


import org.junit.Test;

public class PowerOfThreeTest {

	public static List<Integer> POWER_OF_THREE_LIST;
	
	static {
		List<Integer> result = new ArrayList<Integer>();
		for(int i = 0; ; i++) {
			int product = 1, lastPrduct = 0;
			
			for(int j = 1; j <= i; j++) {
				lastPrduct = product;
				product *= 3;
			}
			
			if(product / 3 != lastPrduct)
				break;
			
			//System.out.println(product + " : " + Integer.toBinaryString(product));
			//System.out.println("case " + product + ": return true;");
			result.add(product);
		}
		
		POWER_OF_THREE_LIST = result;
	}
	
	@Test
	public void test() {
		PowerOfThree obj = new PowerOfThree();

		for(int num : POWER_OF_THREE_LIST) {
			assertTrue(obj.isPowerOfThree1(num));
			assertTrue(obj.isPowerOfThree2(num));
			assertTrue(obj.isPowerOfThree3(num));
			assertTrue(obj.isPowerOfThree4(num));
			assertTrue(obj.isPowerOfThree5(num));
			assertTrue(obj.isPowerOfThree6(num));
		}
		
	}
	
}
