package com.lun.swordtowardoffer;

import java.util.LinkedList;

public class LastRemaining {

	public int lastRemaining(int n, int m) {
		if(n < 1 || m < 1) {
			throw new IllegalArgumentException();
		}
		
		LinkedList<Integer> list = new LinkedList<>();
		
		for(int i = 0; i < n; i++) {
			list.add(i);
		}
		
		int count = 0, index = 0;
		while(list.size() > 1) {
			count++;
			if(count == m) {
				list.remove(index);
				count = 0;
			}else {
				index++;
			}
			if(index == list.size()) {
				index = 0;
			}
		}
		
		return list.get(0);
	}
	
	public int lastRemaining2(int n, int m) {
		if(n < 1 || m < 1) {
			throw new IllegalArgumentException();
		}
		return n == 1 ? 0 : (lastRemaining2(n - 1, m) + m) % n;
	}
	
}
