package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

public class GuessNumberHigherOrLowerTest {

	@Test
	public void test() {
		GuessNumberHigherOrLower obj = new GuessNumberHigherOrLower();

		assertEquals(GuessGame.pick = 6, obj.guessNumber(10));
		assertEquals(GuessGame.pick = 1, obj.guessNumber(1));
		assertEquals(GuessGame.pick = 1, obj.guessNumber(2));
		assertEquals(GuessGame.pick = 2, obj.guessNumber(2));
	}
}
