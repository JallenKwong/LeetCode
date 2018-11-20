package com.lun.easy;

import org.junit.Assert;
import org.junit.Test;

import com.lun.easy.DesignHashMap.MyHashMap;

public class DesignHashMapTest {

	@Test
	public void test() {
		MyHashMap hashMap = new MyHashMap();
		hashMap.put(1, 1);          
		hashMap.put(2, 2);         
		Assert.assertEquals(1, hashMap.get(1));            // returns 1
		Assert.assertEquals(-1, hashMap.get(3));            // returns 1
		
		hashMap.put(2, 1);          // update the existing value
		Assert.assertEquals(1, hashMap.get(2));            // returns 1
		
		hashMap.remove(2);          // remove the mapping for 2
		Assert.assertEquals(-1, hashMap.get(2));            // returns -1 (not found) 
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(Integer.valueOf(1287), Integer.valueOf(1287));
	}
}
