package com.lun.swordtowardoffer;

import com.lun.util.MyUtils;

public class FindNumsAppearOnce {
	
	public int[] find(int[] data) {
		int[] result = null;
		
		if(MyUtils.checkArrayEmpty(data) || data.length < 4) {
			return result;
		}

		int resultExclusiveOr = 0;
		
		for(int temp : data) {
			resultExclusiveOr ^= temp;
		}
		
		int indexOfOne = findFirstBitIsOne(resultExclusiveOr);
		
		int num1 = 0, num2 = 0;
		for(int temp : data) {
			if(isBitOne(temp, indexOfOne)) {
				num1 ^= temp;
			}else {
				num2 ^= temp;
			}
		}
		
		return new int[] {num1, num2};
	}
	
	private int findFirstBitIsOne(int num) {
		int indexBit = 0;
		while(((num & 1) == 0) && indexBit < Integer.SIZE) {
			num >>= 1;
			indexBit++;
		}
		return indexBit;
	}
	
	private boolean isBitOne(int num, int indexBit) {
		num >>= indexBit;
		return (num & 1) == 1;
	}
	
}
