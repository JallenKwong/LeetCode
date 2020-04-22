package com.lun.swordtowardoffer;

public class CountNumberInSortedArray {
	
	public static final boolean FIRST = false;
	public static final boolean LAST = true;
	
	public int count(int[] array, int target) {
		if(array == null || array.length == 0) {
			return 0;
		}
		
		int firstIndex = findIndexOfTarget(array, target, 0, array.length - 1, FIRST);
		int lastIndex = findIndexOfTarget(array, target, 0, array.length - 1, LAST);
		
		if(firstIndex > -1 && lastIndex > -1) {
			return lastIndex - firstIndex + 1;
		}
		
		return 0;
	}
	
	public int findIndexOfTarget(int[] array, int target, int start, int end, boolean firstOrLast) {
		int mid = start + (end - start) / 2;
		while(start <= end) {
			if(array[mid] == target) {
				if(firstOrLast == FIRST) {
					if(mid == 0 || array[mid - 1] != array[mid]) {
						return mid;
					}else {
						return findIndexOfTarget(array, target, start, mid - 1, firstOrLast);
					}
				}else{
					if(mid == array.length - 1 || array[mid + 1] != array[mid]) {
						return mid;
					}else {
						return findIndexOfTarget(array, target, mid + 1, end, firstOrLast);
					}
				}
			}else if(array[mid] < target){
				start = mid + 1;
			}else {
				end = mid - 1;
			}
			mid = start + (end - start) / 2;
		}
		return -1;
	}
	
}
