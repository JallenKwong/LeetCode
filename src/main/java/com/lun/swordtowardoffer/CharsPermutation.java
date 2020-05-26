package com.lun.swordtowardoffer;

import java.util.ArrayList;
import java.util.List;

import com.lun.util.MyUtils;

public class CharsPermutation {
	public List<String> permute(String src) {
		List<String> list = new ArrayList<>();
		
		if(!MyUtils.checkStringEmpty(src))
			permute(list, "", src.toCharArray(), 0);
		
		return list;
	}
	
	private void permute(List<String> list, String mid, char[] src, int index) {
		if(index == src.length) {
			list.add(mid.toString());
		}else {
			for(int i = index; i < src.length; i++) {
				swap(src, i , index);
				permute(list, mid + src[index], src, index + 1);
				swap(src, i , index);
			}
		}
	}
	
	private void swap(char[] src, int i, int j) {
		char temp = src[i];
		src[i] = src[j];
		src[j] = temp;
	}
	
}
