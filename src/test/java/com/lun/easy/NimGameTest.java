package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

public class NimGameTest {

	@Test
	public void test() {
		NimGame obj = new NimGame();

		for (int i = 0; i < 1000; i++)
			assertEquals(obj.canWinNim1(i), obj.canWinNim2(i));
	}
}
