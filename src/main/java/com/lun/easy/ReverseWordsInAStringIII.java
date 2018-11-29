package com.lun.easy;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWordsInAStringIII {
	
    public String reverseWords(String s) {
		int lastSpaceIndex = -1;
		char[] array = s.toCharArray();
		for(int i = 0; i <= array.length; i++) {
			if(i == array.length || array[i] == ' ') {
				int a = i;
				
				while(++lastSpaceIndex < --a) {
					char temp = array[a];
					array[a] = array[lastSpaceIndex];
					array[lastSpaceIndex] = temp;
				}
				
				lastSpaceIndex = i;
				
			}
		}
    	return new String(array);
    }
    
    /**
     * 
     * 使用Java8 Lamda 表达式
     * 
     * @param s
     * @return
     */
    public String reverseWords2(String s) {
        return Arrays.stream(s.split(" "))
            .map(word -> new StringBuilder(word).reverse().toString())
            .collect(Collectors.joining(" "));
    }
    
}
