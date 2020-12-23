package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

public class ReverseBitsTest {

	@Test
	public void test() {
		ReverseBits obj = new ReverseBits();
		
		assertEquals(Integer.parseInt("00000000000000001111111111111110", 2), //
				obj.reverseBits1(Integer.parseInt("01111111111111110000000000000000", 2)));
		assertEquals(964176192, obj.reverseBits1(Integer.parseInt("00000010100101000001111010011100", 2)));
		assertEquals(-1073741825, obj.reverseBits1(-3));
		
		assertEquals(Integer.parseInt("00000000000000001111111111111110", 2), //
				obj.reverseBits2(Integer.parseInt("01111111111111110000000000000000", 2)));
		assertEquals(964176192, obj.reverseBits2(Integer.parseInt("00000010100101000001111010011100", 2)));
		assertEquals(-1073741825, obj.reverseBits2(-3));

		assertEquals(Integer.parseInt("00000000000000001111111111111110", 2), //
				obj.reverseBits3(Integer.parseInt("01111111111111110000000000000000", 2)));
		assertEquals(964176192, obj.reverseBits3(Integer.parseInt("00000010100101000001111010011100", 2)));
		assertEquals(-1073741825, obj.reverseBits3(-3));
		
		assertEquals(Integer.parseInt("00000000000000001111111111111110", 2), //
				obj.reverseBits4(Integer.parseInt("01111111111111110000000000000000", 2)));
		assertEquals(964176192, obj.reverseBits4(Integer.parseInt("00000010100101000001111010011100", 2)));
		assertEquals(-1073741825, obj.reverseBits4(-3));
		
	}
}
