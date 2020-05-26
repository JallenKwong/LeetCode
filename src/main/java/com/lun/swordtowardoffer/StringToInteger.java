package com.lun.swordtowardoffer;

import com.lun.util.MyUtils;

public class StringToInteger {

	
	public int makeStringToInteger(String integerStr) {
		
		if(MyUtils.checkStringEmpty(integerStr)) {
			throw new IllegalArgumentException("str is empty.");
		}
		
		int result = 0;
		int index = 0;
		boolean plus = true;
		
		if(integerStr.charAt(index) == '-' || integerStr.charAt(index) == '+') {
			if(integerStr.charAt(index) == '-') {
				plus = false;
			}
			index++;
		}
		
		for(int i = index; i < integerStr.length(); i++) {
			
			if(integerStr.charAt(i) >= '0' && integerStr.charAt(i) <= '9') {
				result = result * 10 + ( plus ? 1 : -1) * (integerStr.charAt(i) - '0');
				
				if(plus && result < 0 || !plus && result > 0) {
					
					throw new IllegalArgumentException("Overflow.");
				}
				
			}else {
				String message = String.format("str.charAt(%d) is %s, not a number.", i, integerStr.charAt(i));
				throw new IllegalArgumentException(message);
			}
		}
		
		return result;
	}
	
}
