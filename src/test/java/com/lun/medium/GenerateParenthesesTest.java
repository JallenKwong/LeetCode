package com.lun.medium;

import static org.junit.Assert.*;

import org.hamcrest.collection.IsIterableContainingInAnyOrder;
import org.hamcrest.core.IsCollectionContaining;
import org.junit.Test;

public class GenerateParenthesesTest {

	@Test
	public void test() {
		GenerateParentheses obj = new GenerateParentheses();

		assertThat(obj.generateParenthesis(3), //
				IsIterableContainingInAnyOrder.containsInAnyOrder("((()))", "(()())", "(())()", "()(())", "()()()"));

		assertThat(obj.generateParenthesis(1), IsCollectionContaining.hasItem("()"));
	}
}
