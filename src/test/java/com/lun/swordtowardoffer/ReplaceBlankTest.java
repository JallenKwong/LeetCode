package com.lun.swordtowardoffer;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReplaceBlankTest {

	@Test
	public void test() {
		ReplaceBlank rb = new ReplaceBlank();
		
		assertEquals("We%20are%20happy.", rb.replace("We are happy."));
	}

}
