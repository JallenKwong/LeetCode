package com.lun.swordtowardoffer;

public class FindTheMinOneInASpinnedSortedArray {

	
	public int find(int[] numbers) {
		
		if(numbers == null || numbers.length == 0) {
			throw new IllegalArgumentException();
		}
		
		int index1 = 0;
		int index2 = numbers.length - 1;
		
		int indexMid = index1;
		
		while(numbers[index1] >= numbers[index2]) {
			if(index2 - index1 == 1) {
				indexMid = index2;
				break;
			}
			
			indexMid = (index1 + index2) / 2;
			
			if(numbers[index1] == numbers[index2]
					&& numbers[indexMid] == numbers[index1])
				return minInOrder(numbers, index1, index2);
			
			if(numbers[index1] <= numbers[indexMid])
				index1 = indexMid;
			else if(numbers[indexMid] <= numbers[index2])
				index2 = indexMid;
			
		}
		
		return numbers[indexMid];
	}

	private int minInOrder(int[] numbers, int index1, int index2) {
		
		int result = numbers[index1];
		
		for(int i = index1 + 1;i <= index2;i++) {
			if(result > numbers[i])
				result = numbers[i];
		}
		
		return result;
	}
	
}
