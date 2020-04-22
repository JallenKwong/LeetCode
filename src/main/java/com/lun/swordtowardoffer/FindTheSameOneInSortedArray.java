package com.lun.swordtowardoffer;

public class FindTheSameOneInSortedArray {

	public int find(int[] array) {
		if(array == null|| array.length == 0) {
			return -1;
		}
		
		int start = 0;
		int end = array.length - 1;
		int mid = start + (end - start) / 2;
		
		while(start <= end) {
			if(mid == array[mid]) {
				return mid;
			}else if(mid > array[mid]) {
				start = mid + 1;
			}else {
				end = mid - 1;
			}
			mid = start + (end - start) / 2;
		}
		return -1;
	}
}
