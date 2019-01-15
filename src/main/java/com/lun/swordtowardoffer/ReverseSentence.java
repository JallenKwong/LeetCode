package com.lun.swordtowardoffer;

import java.util.Arrays;
import java.util.LinkedList;

import com.lun.util.MyUtils;

public class ReverseSentence {
	
	public String reverse(String sentence) {
		if(MyUtils.checkStringEmpty(sentence)) {
			return sentence;
		}
				
		String[] strs = sentence.split(" ");
		LinkedList<String> stack = new LinkedList<>();
		Arrays.stream(strs).forEach((s)->stack.push(s));
		
		StringBuilder sb = new StringBuilder();
		stack.forEach((s)->sb.append(s + " "));
		
		return sb.substring(0, sb.length() - 1);
	}
	
}
