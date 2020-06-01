package com.lun.medium;

import static org.junit.Assert.*;
import org.junit.Test;

public class AddTwoNumbersTest {

	@Test
	public void testTransform() {
		AddTwoNumbers an = new AddTwoNumbers();
		assertEquals("1", an.transform(1).toString());
		assertEquals("9->8->7->6->9->8->7->6", an.transform(67896789).toString());
		assertEquals("3->2->1", an.transform(123).toString());
		assertEquals(an.transform(123).toString(), an.transform(123).toString());
	}
	
	@Test
	public void testAddTwoNumbers() {
		AddTwoNumbers an = new AddTwoNumbers();
		assertEquals("2->2->2", an.addTwoNumbers(an.transform(111), an.transform(111)).toString());
		assertEquals("7->0->8", an.addTwoNumbers(an.transform(342), an.transform(465)).toString());
		assertEquals("0->0->0->1", an.addTwoNumbers(an.transform(990), an.transform(10)).toString());
	}
}
