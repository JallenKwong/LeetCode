package com.lun.swordtowardoffer;

public class VerifySquenceOfBST {
	
	public boolean verify(int[] array) {
		return verify(array, 0, array.length - 1);
	}
	
	private boolean verify(int[] array, int start, int end) {
		if(start > end || array == null || array.length == 0) {
			return false;
		}
		
		int root = array[end];
		
		int i = start;
		
		while(i < end) {
			if(array[i] > root) {
				break;
			}
			i++;
		}
		
		int j = i;
		while(j < end) {
			if(array[j] < root) {
				return false;
			}
			j++;
		}
		
		boolean left = true;
		if(i > start)
			left = verify(array, start, i - 1);
		
		boolean right = true;
		if(i < end)
			right = verify(array, i, end - 1);
		
		return left && right;
	}
	
}
