package com.lun.swordtowardoffer;

import com.lun.util.MyUtils;

public class FindNumbersWithSum {
	public int[] find(int[] data, int sum) {
		int[] result = null;
		
		if(MyUtils.checkArrayEmpty(data)) {
			return result;
		}
		
		int left = 0, right = data.length - 1;
		
		while(left < right) {
			int tempSum = data[left] + data[right];
			
			if(sum == tempSum) {
				result = new int[] {data[left], data[right]};
				break;
			}else if(tempSum < sum) {
				left++;
			}else {
				right--;
			}
			
		}
		
		return result;
	}
}
