package com.lun.easy;

import java.util.ArrayList;
import java.util.List;

public class DesignHashMap {

public static class MyHashMap {

	private List<Integer>[] map;
	
    /** Initialize your data structure here. */
    public MyHashMap() {
        map = new ArrayList[97];
    }
    
    
    private int hash(int key) {
    	return key % 97;
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        int hash = hash(key);
        
        if(map[hash] == null) {
        	map[hash] = new ArrayList<>();
        }
        
    	List<Integer> list = map[hash];
    	
    	for(int i = 0; i < list.size(); i += 2) {
    		if(key == list.get(i)) {
    			list.set(i+1, value);
    			return;
    		}
    	}
    	
    	list.add(key);
    	list.add(value);
    	
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        int hash = hash(key);
        
        if(map[hash] != null) {
        	
        	List<Integer> list = map[hash];
        	
        	for(int i = 0; i < list.size(); i += 2) {
        		if(key == list.get(i)) {
        			return list.get(i + 1);
        		}
        	}
        }
    	
    	return -1;
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        
        int hash = hash(key);
        
        if(map[hash] != null) {
        	
        	List<Integer> list = map[hash];
        	
        	for(int i = 0; i < list.size(); i += 2) {
        		if(key == list.get(i)) {
        			list.remove(i + 1);
        			list.remove(i);
        			
        		}
        	}
        }
    	
    }
}

	/**
	 * Your MyHashMap object will be instantiated and called as such:
	 * MyHashMap obj = new MyHashMap();
	 * obj.put(key,value);
	 * int param_2 = obj.get(key);
	 * obj.remove(key);
	 */
	
}
