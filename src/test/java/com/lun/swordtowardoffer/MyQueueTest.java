package com.lun.swordtowardoffer;

import static org.junit.Assert.*;
import org.junit.Test;

public class MyQueueTest {

	@Test
	public void test() {
		
		MyQueue<Character> queue = new MyQueue<>();
		
		queue.appendTail('a');
		queue.appendTail('b');
		queue.appendTail('c');
		
		assertEquals(Character.valueOf('a'), queue.deleteHead());
		assertEquals(Character.valueOf('b'), queue.deleteHead());
		
		queue.appendTail('d');
		assertEquals(Character.valueOf('c'), queue.deleteHead());
	}

}
