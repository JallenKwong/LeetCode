package com.lun.swordtowardoffer;

import java.util.Arrays;

public class InversePairs {

	public int inverse(int[] data) {
		
		if(data == null || data.length == 0)
			return 0;
		
		int[] copy = Arrays.copyOf(data, data.length);
		int count = inverseCore(data, copy, 0, data.length - 1);
		
//		System.out.println(Arrays.toString(copy));//最后有序
//		System.out.println(Arrays.toString(data));//原数据已变
		
		return count;
	}
	
	private int inverseCore(int[] data, int[] copy, int start, int end){
		
		if(start == end) {
			copy[start] = data[start];
			return 0;
		}
		
		int length = (end - start) / 2;
		
		int left = inverseCore(copy, data, start, start + length);
		int right = inverseCore(copy, data, start + length + 1, end);
		
		//注意data, copy
//		int left = inverseCore(data, copy, start, start + length);
//		int right = inverseCore(data, copy, start + length + 1, end);
		
		//前半段最后一个数字的下标
		int i = start + length;
		
		//下半段最后一个数字的下标
		int j = end;
		int indexCopy = end;//辅助数组的下一数字的下标
		
		int count = 0;
		
		while(i >= start && j >= start + length + 1) {
			
			if(data[i] > data[j]) {
				copy[indexCopy--] = data[i--];
				count += j - start - length;
			}else {
				copy[indexCopy--] = data[j--];
			}
		}
		
		
		//把剩余的子数组复制到辅助元素
		while(i >= start) {
			copy[indexCopy--] = data[i--];
		}
		
		while(j >= start + length + 1) {
			copy[indexCopy--] = data[j--];
		}
		
		return left + right + count;
	}
	
}
