package com.lun.easy;

import static org.junit.Assert.*;
import org.junit.Test;

public class ImplementStackUsingQueuesTest {

	@Test
	public void test1() {
		ImplementStackUsingQueues myStack = new ImplementStackUsingQueues();

		myStack.push(1);
		myStack.push(2);
		assertEquals(2, myStack.top()); // return 2
		assertEquals(2, myStack.pop()); // return 2
		assertFalse(myStack.empty()); // return False
	}

	@Test
	public void test2() {
		ImplementStackUsingQueues myStack = new ImplementStackUsingQueues();

		myStack.push(1);
		assertEquals(1, myStack.pop());
		assertTrue(myStack.empty()); // return False
	}

	@Test
	public void test3() {
		MyStack myStack = new MyStack();

		myStack.push(1);
		myStack.push(2);
		assertEquals(2, myStack.top()); // return 2
		assertEquals(2, myStack.pop()); // return 2
		assertFalse(myStack.empty()); // return False
	}

	@Test
	public void test4() {
		MyStack myStack = new MyStack();

		myStack.push(1);
		assertEquals(1, myStack.pop());
		assertTrue(myStack.empty()); // return False
	}
}
