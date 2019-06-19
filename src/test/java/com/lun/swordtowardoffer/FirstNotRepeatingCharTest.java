package com.lun.swordtowardoffer;

import static org.junit.Assert.*;

import org.junit.Test;

public class FirstNotRepeatingCharTest {

	@Test
	public void testFind() {
		FirstNotRepeatingChar fc = new FirstNotRepeatingChar();
		
		assertEquals('b', fc.find("abaccdeff"));
		
	}

}
