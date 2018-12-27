package com.lun.swordtowardoffer;

import java.util.LinkedList;

public class IsPopOrder {
	
	public boolean check(int[] array1, int[] array2) {
		if(array1 == null || array2 == null 
				|| array1.length == 0 || array2.length == 0
				|| array1.length != array2.length) {
			return false;
		}
		
		LinkedList<Integer> stack = new LinkedList<>();
		int index2 = 0;
		
		//入栈
		for(int i : array1) {
			if(i == array2[index2]) {
				index2++;
			}else {
				stack.push(i);
			}
		}
		
		//出栈
		while(!stack.isEmpty()) {
			
			if(stack.pop() == array2[index2]) {
				index2++;
			}else {
				return false;
			}
		}
		
		if(index2 == array2.length) {
			return true;
		}
		
		return false;
	}
	
}
