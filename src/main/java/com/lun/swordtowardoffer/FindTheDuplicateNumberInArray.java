package com.lun.swordtowardoffer;

import com.lun.util.MyUtils;

public class FindTheDuplicateNumberInArray {
	
	public int find(int[] array) {
		
		//---防御性代码
		if(MyUtils.checkArrayEmpty(array)) {
			throw new IllegalArgumentException();
		}
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] < 0 || array[i] > array.length - 1) {
				throw new IllegalArgumentException();
			}
		}
		//---防御性代码
		
		for(int i = 0; i < array.length; i++) {
			while(i != array[i]) {
				if(array[i] == array[array[i]]) {
					return array[i];
				}
				swap(array, i, array[i]);
			}
		}
		
		return -1;
	}
	
	private void swap(int[] array, int index1, int index2) {
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}
	
}
