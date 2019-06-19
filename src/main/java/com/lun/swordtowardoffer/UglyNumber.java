package com.lun.swordtowardoffer;

public class UglyNumber {

	public boolean isUgly(int number) {
		while(number % 2 == 0)
			number /= 2;
		while(number % 3 == 0)
			number /= 3;
		while(number % 5 == 0)
			number /= 5;
		
		return number == 1;
	}
	
	public int getUglyNumber(int index) {
		if(index <= 0) {
			return 0;
		}
		int number = 0;
		int uglyFound = 0;
		
		while(uglyFound < index) {
			
			++number;
			
			if(isUgly(number)) {
				++uglyFound;
			}
		}
		
		return number;
	}
	
	public int getUglyNumber2(int index) {
		if(index <= 0) 
			return 0;

		int[] uglyNumbers = new int[index];
		uglyNumbers[0] = 1;
		int nextUglyIndex = 1;

		int index2 = 0, index3 = 0, index5 = 0;
		
		while(nextUglyIndex < index) {
			int min = min(uglyNumbers[index2] * 2, uglyNumbers[index3] * 3
					, uglyNumbers[index5] * 5);
			
			uglyNumbers[nextUglyIndex] = min;
			
			//预测下一个丑数
			while(uglyNumbers[index2] * 2 <= min)
				++index2;
			while(uglyNumbers[index3] * 3 <= min)
				++index3;
			while(uglyNumbers[index5] * 5 <= min)
				++index5;
			
			++nextUglyIndex;
		}
		
		return uglyNumbers[nextUglyIndex - 1];
	}
	
	public int min(int num1, int num2, int num3) {
		return Math.min(Math.min(num1, num2), num3);
	}
	
	
	
}
