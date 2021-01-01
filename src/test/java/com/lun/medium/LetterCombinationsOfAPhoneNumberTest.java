package com.lun.medium;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import org.junit.Test;
import org.hamcrest.collection.IsEmptyCollection;

public class LetterCombinationsOfAPhoneNumberTest {

	@Test
	public void test() {
		LetterCombinationsOfAPhoneNumber obj = new LetterCombinationsOfAPhoneNumber();

		assertThat(obj.letterCombinations1("23"),
				containsInAnyOrder("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"));
		assertThat(obj.letterCombinations1(""), IsEmptyCollection.empty());
		assertThat(obj.letterCombinations1("2"), containsInAnyOrder("a", "b", "c"));

		assertThat(obj.letterCombinations2_1("23"),
				containsInAnyOrder("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"));
		assertThat(obj.letterCombinations2_1(""), IsEmptyCollection.empty());
		assertThat(obj.letterCombinations2_1("2"), containsInAnyOrder("a", "b", "c"));

		assertThat(obj.letterCombinations2_2("23"),
				containsInAnyOrder("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"));
		assertThat(obj.letterCombinations2_2(""), IsEmptyCollection.empty());
		assertThat(obj.letterCombinations2_2("2"), containsInAnyOrder("a", "b", "c"));

		assertThat(obj.letterCombinations3("23"),
				containsInAnyOrder("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"));
		assertThat(obj.letterCombinations3(""), IsEmptyCollection.empty());
		assertThat(obj.letterCombinations3("2"), containsInAnyOrder("a", "b", "c"));
	}
}
