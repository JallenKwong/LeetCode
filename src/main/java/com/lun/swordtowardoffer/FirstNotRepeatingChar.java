package com.lun.swordtowardoffer;

import java.util.Arrays;

import com.lun.util.MyUtils;

public class FirstNotRepeatingChar {
	
	private static final int tableSize = 256;//ASCII
	
	public char find(String str) {
		if(MyUtils.checkStringEmpty(str))
			return '\0';

		int[] hashTable = new int[tableSize];
		//Arrays.fill(hashTable, 0);
		
		int index = 0;
		
		//统计
		while(index < str.length())
			hashTable[str.charAt(index++)]++;
		
		//求出结果
		index = 0;
		while(index < str.length()) {
			if(hashTable[str.charAt(index)] == 1)
				return str.charAt(index);
			
			index++;
		}
			
		return '\0';
	}
	
	
}
