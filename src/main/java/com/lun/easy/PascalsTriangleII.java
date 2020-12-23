package com.lun.easy;

import java.util.LinkedList;
import java.util.List;

public class PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {
    	List<Integer> result = new LinkedList<Integer>();
    	if(rowIndex < 0) return result;
    	
    	for(int i = 0; i <= rowIndex; i++) {
    		result.add(0, 1);
    		for(int j = 1 ; j < result.size() - 1; j++) 
    			result.set(j, result.get(j) + result.get(j + 1));
    	}
        return result;
    }
}
