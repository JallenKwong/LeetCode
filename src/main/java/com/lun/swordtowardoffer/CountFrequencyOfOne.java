package com.lun.swordtowardoffer;

public class CountFrequencyOfOne {
	public int count(int src) {
		int count = 0;
		
		while(src != 0) {
			if((src & 1) == 1) {
				count++;
			}
			src >>>= 1;
		}
		
		return count;
	}
	
	/**
	 * 比较神奇的算法
	 * 
	 * @param src
	 * @return
	 */
	public int count2(int src) {
		int count = 0;
		
		while(src != 0) {
			count++;
			src = (src - 1) & src;
		}
		
		return count;
	}
	
}
