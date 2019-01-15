package com.lun.swordtowardoffer;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseSentenceTest {

	@Test
	public void testReverse() {
		ReverseSentence rs = new ReverseSentence();
		assertEquals("student. a am I", rs.reverse("I am a student."));
	}

}
