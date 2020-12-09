package com.lun.swordtowardoffer;

import java.util.LinkedList;
import java.util.List;

import com.lun.util.MyUtils;

public class FindMaxInQueue {

	public List<Integer> maxInWindows(List<Integer> nums, int size) {
		
		if(size <= 0 || MyUtils.checkListEmpty(nums)) {
			throw new IllegalArgumentException();
		}
		
		LinkedList<Integer> maxInWindows = new LinkedList<>();
		
		if(nums.size() >= size) {
			LinkedList<Integer> index = new LinkedList<>();//用以保存索引
			
			for(int i = 0; i < size; i++) {//初始化
				
				while(!index.isEmpty() && nums.get(i) >= nums.get(index.peekLast())) {
					index.removeLast();
				}
				
				index.addLast(i);
			}
			
			for(int i = size; i < nums.size(); i++) {
				
				maxInWindows.addLast(nums.get(index.peekFirst()));
				
				while(!index.isEmpty() && nums.get(i) >= nums.get(index.peekLast())) {
					index.removeLast();
				}
				
				if(!index.isEmpty() && index.peekFirst() <= i - size) {//
					index.removeFirst();
				}
				
				index.addLast(i);
			}
			
			maxInWindows.addLast(nums.get(index.peekFirst()));
		}
		
		return maxInWindows;
	}
	
}
