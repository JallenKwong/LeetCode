package com.lun.swordtowardoffer;

import com.lun.util.MyUtils;

public class LeftRotateString {

	
	public String leftRotate(String str, int num) {
		
		if(MyUtils.checkStringEmpty(str) || num >= str.length() || num < 0) {
			return str;
		}
		
		char[] array = str.toCharArray();
		
		//翻转前n个字符
		swap(array, 0, num - 1);
		
		//翻转字符串的后面部分
		swap(array, num, str.length() - 1);			
	
		//翻转整个字符串
		swap(array, 0, str.length() - 1);			
		
		return new String(array);
	}
	
	private void swap(char[] array, int iStart, int jStart) {
		for(int i = iStart, j = jStart; i < j; i++, j--) {
			char temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
	
	}
	
}
