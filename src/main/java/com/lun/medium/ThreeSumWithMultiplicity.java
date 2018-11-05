package com.lun.medium;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThreeSumWithMultiplicity {
	
	private Logger log = LoggerFactory.getLogger(ThreeSumWithMultiplicity.class);
	
    public int threeSumMulti(int[] A, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        int res = 0;
        int mod = 1000000007;
        for (int i = 0; i < A.length; i++) {
        	
        	log.debug("No.{} loop", i);
        	log.debug("A[{}]: {}", i, A[i]);
        	log.debug("target - A[i]: {}", target - A[i]);
        	log.debug("map.getOrDefault(target - A[i], 0): {}", map.getOrDefault(target - A[i], 0));
        	
            res = (res + map.getOrDefault(target - A[i], 0)) % mod;
            
            log.debug("res: {}", res);
            
            for (int j = 0; j < i; j++) {//为下一轮 A[i],也就是A[k]做准备
            	log.debug("	No.{} inner loop", j);
            	log.debug("	A[{}]: {}", j, A[j]);
                
            	int temp = A[i] + A[j];
                
                log.debug("	temp = A[{}] + A[{}]: {}", i, j, temp);
                
                map.put(temp, map.getOrDefault(temp, 0) + 1);
                
                log.debug("	After putting, map.getOrDefault(temp, 0): {}", map.getOrDefault(temp, 0));
                log.debug("\n");
            }
            log.debug("\n");
        }
        return res;
    }
}
