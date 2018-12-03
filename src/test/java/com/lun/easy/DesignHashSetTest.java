package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

import com.lun.easy.DesignHashSet.MyHashSet;

public class DesignHashSetTest {

	@Test
	public void test() {
		MyHashSet hashSet = new MyHashSet();
		hashSet.add(1);         
		hashSet.add(2);         
		hashSet.contains(1);    // returns true
		hashSet.contains(3);    // returns false (not found)
		hashSet.add(2);          
		hashSet.contains(2);    // returns true
		hashSet.remove(2);          
		hashSet.contains(2);    // returns false (already removed)
	}
}
