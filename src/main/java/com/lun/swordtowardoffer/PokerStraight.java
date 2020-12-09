package com.lun.swordtowardoffer;

import java.util.Arrays;

import com.lun.util.MyUtils;

public class PokerStraight {

	public boolean isStraight(int[] array) {
		if(MyUtils.checkArrayEmpty(array)) {
			throw new IllegalArgumentException();
		}
		
		Arrays.sort(array);
		
		int numOfZero = 0, numOfGap = 0;
		
		for(int i = 0; i < array.length && array[i] == 0; i++) {
			numOfZero++;
		}
		
		int first = numOfZero;
		int second = first + 1;
		
		while(second < array.length) {
			
			if(array[first] == array[second]) {
				return false;
			}
			numOfGap = array[second] - array[first] - 1;
			first = second;
			second++;
			
		}
		
		return !(numOfGap > numOfZero);
	}

}
