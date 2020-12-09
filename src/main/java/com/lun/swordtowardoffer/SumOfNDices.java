package com.lun.swordtowardoffer;

import java.util.Arrays;

public class SumOfNDices {

	public static int DICE_MAX_VALUE = 6;
	
	public double[] getProbability(int numOfDice) {
		if(numOfDice < 1) {
			throw new IllegalArgumentException();
		}
		
		int maxSum = DICE_MAX_VALUE * numOfDice;
		int[] sums = new int[maxSum - numOfDice + 1];
		Arrays.fill(sums, 0);
		setSums(numOfDice, sums);
		double total = Math.pow(DICE_MAX_VALUE, numOfDice);
		return Arrays.stream(sums).mapToDouble((a)->(a / total)).toArray();
	}
	
	private void setSums(int numOfDice, int[] sums) {
		for(int i = 1; i <= DICE_MAX_VALUE; i++) {
			setSums(numOfDice, numOfDice - 1, i, sums);
		}
	}
	
	private void setSums(int numOfDice, int leftNumOfDice, int sum, int[] sums) {
		if(leftNumOfDice == 0) {
			sums[sum - numOfDice]++;
		}else {
			for(int i = 1; i <= DICE_MAX_VALUE; i++) {
				setSums(numOfDice, leftNumOfDice - 1, i + sum, sums);
			}
		}
	}
	
	public double[] getProbability2(int numOfDice) {
		if(numOfDice < 1) {
			throw new IllegalArgumentException();
		}
		int[][] dp = new int[numOfDice + 1][numOfDice * DICE_MAX_VALUE + 1];
		double[] result = new double[numOfDice * DICE_MAX_VALUE - numOfDice + 1];
		double total = Math.pow(DICE_MAX_VALUE, numOfDice);
		
		Arrays.fill(dp[1], 1, DICE_MAX_VALUE + 1, 1);
		
		for(int i = 1; i <= numOfDice; i++) {//如1, 2, 3, 4, 5, 6 
			for(int j = i; j <= DICE_MAX_VALUE * numOfDice; j++) {//n个6面骰子的和的可能值 ：6, 7, 8, 9, ...  
				for(int k = 1; k <= DICE_MAX_VALUE; k++) {//f(n, s) = f(n - 1, s - 1) + f(n - 1, s - 2) + f(n - 1, s - 3) + ...  
					dp[i][j] += (j >= k ? dp[i - 1][j - k] : 0); // j >= k 预防数组越界 
					
					if(i == numOfDice) {
						result[j - i] = dp[i][j] / total;
					}
				}
			}
		}
		
		return result;
	}
	
public double[] getProbability3(int numOfDice) {
	if(numOfDice < 1) {
		throw new IllegalArgumentException();
	}
	int[] dp = new int[numOfDice * DICE_MAX_VALUE + 1];
	double[] result = new double[numOfDice * DICE_MAX_VALUE - numOfDice + 1];
	double total = Math.pow(DICE_MAX_VALUE, numOfDice);
	
	for(int i = 1; i <= DICE_MAX_VALUE; i++) {
		dp[i] = 1;
		result[i - 1] = 1.0 / DICE_MAX_VALUE;
	}
	
	for(int i = 2; i <= numOfDice; i++) {
		for(int j = DICE_MAX_VALUE * numOfDice; j >= 1; j--) {
			
			int temp = 0;
			for(int k = 1; k <= DICE_MAX_VALUE; k++) {
				temp += (j >= k) ? dp[j - k] : 0;
			}
			dp[j] = temp;
			
			if(i == numOfDice && j >= numOfDice) {
				result[j - i] = dp[j] / total;
			}
			
		}
	}
	
	return result;
}
	
}
