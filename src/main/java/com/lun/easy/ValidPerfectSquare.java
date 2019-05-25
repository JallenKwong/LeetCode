package com.lun.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ValidPerfectSquare {
	
	private static List<Integer> squareList;
	
	static {
    	squareList = new ArrayList<>();
    	
    	int i = 1, product;
    	while(true) {
    		if((product = i * i) < 0) 
    			break;
    		
    		squareList.add(product);
    		i++;
    	}		
	}
	
    public boolean isPerfectSquare(int num) {
    	return Collections.binarySearch(squareList, num) >= 0;
    }
    
    public boolean isPerfectSquare2(int num) {
        int i = 1;
        while (num > 0) {
            num -= i;
            i += 2;
        }
        return num == 0;
    }
    
    public boolean isPerfectSquare3(int num) {
        int low = 1, high = num;
        while (low <= high) {
            long mid = (low + high) >>> 1;
            if (mid * mid == num) {
                return true;
            } else if (mid * mid < num) {
                low = (int) mid + 1;
            } else {
                high = (int) mid - 1;
            }
        }
        return false;
    }
    
    public boolean isPerfectSquare4(int num) {
        long x = num;
        while (x * x > num) {
            x = (x + num / x) >> 1;
        }
        return x * x == num;
    }
    
}
