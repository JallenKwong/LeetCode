package com.lun.other.random;

import java.util.Random;

/**
 * 
 * 输出打乱页面
 * 
 * @author 白居布衣
 *
 */
public class RandomPageNum {
	
	public static final int PAGE_SIZE = 869;
	
	public static void main(String[] args) {
		Random rand = new Random(System.nanoTime());
		
		int[] array = new int[PAGE_SIZE];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}
		
		for(int i = 0; i < array.length; i++) {
			swap(array, i, rand.nextInt(array.length));
		}
		
		int j = 0;
		
		System.out.print("- [ ]" + ++j + ". ");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
			
			if((i + 1) % 2 == 0) {
				System.out.println();
				System.out.print("- [ ]" + ++j + ". ");
			}
		}
	}
	
	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
}
