package com.lun.swordtowardoffer;

import com.lun.util.MyUtils;

public class FindNumsAppearOnce2 {
	
	public int find(int[] data) {
		if(MyUtils.checkArrayEmpty(data)) {
			throw new IllegalArgumentException();
		}
		
		int result = 0;
		
		int[] bitSum = new int[Integer.SIZE];
		
		for(int temp : data) {
			int bitMask = 1;
			
			for(int j = 31; j >= 0; j--) {
				int bit = temp & bitMask;
				if(bit!=0)
					bitSum[j] += 1;
				bitMask <<= 1;
			}
		}
		
		for(int i = 0; i < Integer.SIZE; i++) {
			result <<= 1;
			result += bitSum[i] % 3;
		}
		
		
		return result;
	}
}
