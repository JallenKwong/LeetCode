package com.lun.swordtowardoffer;

import com.lun.util.MyUtils;

public class FindTheDuplicateNumberInArray2 {

	public int find(int[] array) {
		if(MyUtils.checkArrayEmpty(array)) {
			throw new IllegalArgumentException();
		}
		
		int start = 1;
		int end = array.length - 1;
		
		while(end >= start) {
			int middle = start + (end - start) / 2;
			
			int count = countRange(array, start, middle);
			if(end == start) {
				if(count > 1) {
					return start;
				}else {
					break;
				}
			}
			
			//统计数 与 范围区间的个数
			if(count > (middle - start + 1)) {
				end = middle;
			}else {
				start = middle + 1;
			}
		}
		return -1;
	}
	
	private int countRange(int[] array, int start, int end) {
		int count = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] >= start && array[i] <= end) {
				++count;
			}
		}
		return count;
	}
	
}
