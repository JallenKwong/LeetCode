package com.lun.swordtowardoffer;

public class CutRope {

	
	/**
	 * 动态规划
	 * 
	 * @param length
	 * @return
	 */
	public int maxProductAfterCutting1(int length) {
		
		if(length < 2)
			return 0;
		if(length == 2)
			return 1;
		if(length == 3)
			return 2;
		
		int[] products = new int[length + 1]; 
		
		products[0] = 0;
		products[1] = 1;
		products[2] = 2;
		products[3] = 3;
		
		int max = 0;
		
		for(int i = 4; i <= length; i++) {
			max = 0;
			
			for(int j = 1; j <= i/2; ++j) {
				int product = products[j] * products[i - j];
				
				if(max < product)
					max = product;
				
				products[i] = max;
			}
		}
		
		max = products[length];
		
		return max;		
	}
	
	
	/**
	 * 贪婪算法
	 * 
	 * @param length
	 * @return
	 */
	public int maxProductAfterCutting2(int length) {
		if(length < 0)
			return 0;
		if(length == 2)
			return 1;
		if(length == 3)
			return 2;
		
		//尽可能多的剪去长度为3的绳子段
		int timesOf3 = length / 3;
		
		//当绳子最后剩下的长度为4的时候，不能再剪去长度为3的绳子段
		if(length - timesOf3 * 3 == 1)
			timesOf3 -= 1;
		
		int timesOf2 = (length - timesOf3 * 3) / 2;
		
		return (int)(Math.pow(3, timesOf3)) * (int)(Math.pow(2, timesOf2));
	} 
	
}
