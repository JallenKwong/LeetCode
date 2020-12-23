package com.lun.other.list;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.junit.Assert.assertThat;

public class ObjectListTest {
	
	@Test
	@SuppressWarnings("unchecked")
	public void test() {

		List<Fruit> list = Arrays.asList(new Fruit("Banana", 99), 
				new Fruit("Apple", 20));

		// Test equals
		assertThat(list, hasItems(new Fruit("Banana", 99), //
				new Fruit("Apple", 20)));

		assertThat(list, containsInAnyOrder(new Fruit("Apple", 20), // 
				new Fruit("Banana", 99)));

		// Test class property, and its value
		assertThat(list, containsInAnyOrder(hasProperty("name", is("Apple")), 
				hasProperty("name", is("Banana"))));

	}
}
