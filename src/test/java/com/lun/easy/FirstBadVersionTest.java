package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

public class FirstBadVersionTest {

	@Test
	public void test() {
		FirstBadVersion obj = new FirstBadVersion();
		VersionControl.badVersion = 4;
		assertEquals(4, obj.firstBadVersion(5));
		
		VersionControl.badVersion = 1;
		assertEquals(1, obj.firstBadVersion(1));
	}
}
