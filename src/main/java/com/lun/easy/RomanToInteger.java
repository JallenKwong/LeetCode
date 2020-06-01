package com.lun.easy;

public class RomanToInteger {
	public int translate(String romanNum){
		int sum = 0;
		int[] in = new int[romanNum.length()];
		for(int i = 0; i != in.length; i++){
			in[i] = conv(romanNum.charAt(i));
			if(i != 0){
				if(in[i - 1] < in[i]){
					in[i - 1] = - in[i - 1];
				}
			}
		}
		for(int t : in){
			sum += t;
		}
		return sum;
	}

	private int conv(char c){
		switch (c) {
			case 'I':return 1;
			case 'V':return 5;
			case 'X':return 10;
			case 'L':return 50;
			case 'C':return 100;
			case 'D':return 500;
			case 'M':return 1000;
			default:return -1;
		}
	}
}
