package com.lun.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 私人工具类
 * 
 * @author 白居布衣
 *
 */
public class MyUtils {

	/**
	 * 包装整型list转换成原始整型类型数组
	 * 
	 * @param src
	 * @return
	 */
	public static int[] integerListToIntArray(List<Integer> src) {
		
		if(src == null || src.isEmpty()) {
			throw new IllegalArgumentException();
		}
		
		int[] result = new int[src.size()];
		
		for(int i = 0; i < src.size(); i++) {
			result[i] = src.get(i);
		}
		
		return result;
	}
	
	/**
	 * 
	 * 从文件中读取整型集合。文件内容确保不要int溢出，一个整数一行。
	 * 
	 * @param filePath
	 * @return
	 */
	public static int[] readIntArray(String filePath) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File(filePath));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		List<Integer> list = new ArrayList<>();
		
		while(scanner.hasNextInt()) {
			list.add(scanner.nextInt());
		}

		return integerListToIntArray(list);
	}
	
	/**
	 * 
	 * 读取二维整型数组
	 * 
	 * @param filePath
	 * @return
	 */
	public static int[][] read2DIntArray(String filePath){
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File(filePath));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		List<Integer[]> list = new ArrayList<>();
		
		while(scanner.hasNextLine()) {
			String[] strings = scanner.nextLine().split(",");
			Integer[] array = new Integer[strings.length];
			for(int i = 0; i < array.length; i++) {
				array[i] = Integer.parseInt(strings[i]);
			}
			list.add(array);
		}
		
		int[][] result = new int[list.size()][];
		
		for(int i = 0; i < list.size(); i++) {
			result[i] = integerArray2intArray(list.get(i));
		}
		
		
		return result;
	}
	
	
	/**
	 * 
	 * 包装整型数组转换成基本整型数组
	 * 
	 * @param src
	 * @return
	 */
	public static int[] integerArray2intArray(Integer[] src) {
		if(src == null || src.length == 0) {
			throw new IllegalArgumentException();
		}
		
		int[] result = new int[src.length];
		
		for(int i = 0; i < src.length; i++) {
			result[i] = src[i];
		}
		
		return result;
	}
	
	
}
