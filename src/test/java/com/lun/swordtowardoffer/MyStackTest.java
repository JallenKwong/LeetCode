package com.lun.swordtowardoffer;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyStackTest {

	@Test
	public void test() {
		MyStack<Integer> stack = new MyStack<>();
		
		stack.push(3);
		assertEquals(3, stack.min().intValue());
		
		stack.push(4);
		assertEquals(3, stack.min().intValue());

		stack.push(2);
		assertEquals(2, stack.min().intValue());
		
		stack.push(1);
		assertEquals(1, stack.min().intValue());
		
		assertEquals(1, stack.pop().intValue());
		assertEquals(2, stack.min().intValue());
		
		assertEquals(2, stack.pop().intValue());
		assertEquals(3, stack.min().intValue());
		
		stack.push(0);
		assertEquals(0, stack.min().intValue());
		
	}

}
