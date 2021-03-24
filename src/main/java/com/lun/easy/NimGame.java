package com.lun.easy;

public class NimGame {
	public boolean canWinNim1(int n) {
		return n % 4 != 0;
	}

	public boolean canWinNim2(int n) {
		return (n & 3) != 0;
	}
	
	public static void main(String[] args) {
		
		int n = 16;
		String minusOneBinary = Integer.toBinaryString(n - 1);
		
		for(int i = 0; i < 1000; i++) {
			
			if(i % n == 0) {
				System.out.println(String.format("%d & %d = %s & %s = %d", i, n - 1, 
						Integer.toBinaryString(i), minusOneBinary, (i & (n - 1))));
				
//				System.out.println("  " + i + " & " + 3);
//				System.out.println("= " + Integer.toBinaryString(i) + " & " + Integer.toBinaryString(3));
//				System.out.println("= " + (i & 3));
			}
		}
		
	}

}
