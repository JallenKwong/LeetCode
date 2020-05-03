package com.lun.swordtowardoffer;

public class CountFrequencyOfOne {
	
	/**
	 * 使用>>>
	 * 
	 * @param src
	 * @return
	 */
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
	 * 使用 << 
	 * 
	 * @param src
	 * @return
	 */
	public int count2(int src) {
		int count = 0;
		int flag = 1;
		while(flag != 0) {
			
			if((src & flag) != 0) {
				count++;
			}
			flag <<= 1;
		}
		return count;
	}
	
	/**
	 * 
	 * 
	 * @param src
	 * @return
	 */
	public int count3(int src) {
		int count = 0;
		
		while(src != 0) {
			count++;
			src = (src - 1) & src;
		}
		
		return count;
	}
	
}
