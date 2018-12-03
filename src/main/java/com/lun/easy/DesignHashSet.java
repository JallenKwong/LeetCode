package com.lun.easy;

import java.util.ArrayList;
import java.util.List;

public class DesignHashSet {
	public static class MyHashSet {

		private List<Integer>[] set;
		
	    /** Initialize your data structure here. */
	    public MyHashSet() {
	        set = new ArrayList[97];
	    }
	    
	    private int hash(int key) {
	        return key % 97;
	    }
	    
	    public void add(int key) {
	        int hash = hash(key);

	        if(set[hash] == null) {
	        	set[hash] = new ArrayList<>();
	        }

	        List<Integer> list = set[hash];

	        for(int i = 0; i < list.size(); i++) {
	            if(key == list.get(i)) {
	                return;
	            }
	        }

	        list.add(key);
	    }
	    
	    public void remove(int key) {
	        int hash = hash(key);

	        if(set[hash] != null) {

	            List<Integer> list = set[hash];

	            for(int i = 0; i < list.size(); i++) {
	                if(key == list.get(i)) {
	                    list.remove(i);
	                }
	            }
	        }
	    }
	    
	    /** Returns true if this set contains the specified element */
	    public boolean contains(int key) {
	        int hash = hash(key);

	        if(set[hash] != null) {
	            List<Integer> list = set[hash];

	            for(int i = 0; i < list.size(); i++) {
	                if(key == list.get(i)) {
	                    return true;
	                }
	            }
	        }
	        
	        return false;
	    }
	}
}
