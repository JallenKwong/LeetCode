package com.lun.swordtowardoffer;

public class FindTheLostNumberInSortedArray {
	
	public int find(int[] array) {
		
		if(array == null|| array.length == 0) {
			return -1;
		}
		
		int start = 0;
		int end = array.length - 1;
		int mid = start + (end - start) / 2;//(start + end) / 2;
		
		while(start <= end) {
			if(mid == array[mid]) {
				start = mid + 1;
			}else {
				if(mid == 0 || array[mid - 1] == mid - 1) {
					return mid;
				}else {
					end = mid - 1;
				}
			}
			mid = start + (end - start) / 2;
		}
		
		return -1;
	}
	
}
