package com.lun.swordtowardoffer;

import com.lun.util.MyUtils;

public class MultiplyArray {

	public long[] multiply(long[] src) {
		
		if(MyUtils.checkArrayEmpty(src)) {
			throw new IllegalArgumentException();
		}
		
		long[] result = new long[src.length]; 
		
		result[0] = 1;
		
		if(src.length > 1) {
		
			for(int i = 1; i < src.length; i++) {
				result[i] = result[i - 1] * src[i - 1];
			}
			
			long temp = 1;
			for(int i = src.length - 2; i >= 0; i--) {
				temp *= src[i + 1];
				result[i] *= temp;
			}
		}
		
		return result;
	} 
	
}
