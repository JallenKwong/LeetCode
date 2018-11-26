package com.lun.hard;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.lun.util.MyUtils;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;


public class CountOfSmallerNumbersAfterSelfTest {

	@Test
	public void test() {
		//Note: If you don't care about the order of the elements,
		//you should be using a Set or Collection, not a List.
		
		List<String> actual = asList("fee", "foe", "fi");
		List<String> expected = asList("fee", "foe", "fi");

		assertThat(expected, is(actual));
		assertThat(expected, hasItems("fee"));
		assertTrue(expected.equals(actual));
	}
	
	@Test
	public void test2() {
		CountOfSmallerNumbersAfterSelf cs = new CountOfSmallerNumbersAfterSelf();
		
		assertThat(cs.countSmaller(new int[] {5,2,6,1}), is(asList(2, 1, 1, 0)));
		assertThat(cs.countSmaller(new int[] {5,2,6,1,1}), is(asList(3, 2, 2, 0, 0)));
		assertThat(cs.countSmaller(new int[] {5,2,1,6,1,1}), is(asList(4, 3, 0, 2, 0, 0)));

		assertThat(cs.countSmaller(new int[] {1, 2, 3, 4}), is(asList(0, 0, 0, 0)));
		assertThat(cs.countSmaller(new int[] {2, 1, -1, 4}), is(asList(2, 1, 0, 0)));
		assertThat(cs.countSmaller(new int[] {}), is(asList()));
		assertThat(cs.countSmaller(new int[] {2,0,0}), is(asList(2,0,0)));
	}
	
	@Test
	public void test3() {
		assertTrue(new Integer(1111) != new Integer(1111));
		assertTrue(new Integer(1111).equals(new Integer(1111)));
	}
	
	@Test
	public void test4() {
		CountOfSmallerNumbersAfterSelf cs = new CountOfSmallerNumbersAfterSelf();
		assertThat(cs.countSmaller(new int[] {2,0,1}), is(asList(2,0,0)));
		
		//<---
		assertThat(cs.countSmaller(new int[] {1,9,7,8,5}), is(asList(0,3,1,1,0)));
	}
	
	@Test
	public void test5() {
		CountOfSmallerNumbersAfterSelf cs = new CountOfSmallerNumbersAfterSelf();
		assertThat(cs.countSmaller(new int[] {26,78,27,100,33,67,90,23,66,5,38,7,35,23,52,22,83,51,98,69,81,32,78,28,94,13,2,97,3,76,99,51,9,21,84,66,65,36,100,41}), 
									is(asList(10,27,10,35,12,22,28,8,19,2,12,2,9,6,12,5,  17, 9, 19,12,14,6,12,5,12,3,0,10,0,7,8,4,0,0,4,3,2,0,1,0)));
	}
	
	@Test
	public void test6() {
		CountOfSmallerNumbersAfterSelf cs = new CountOfSmallerNumbersAfterSelf();
		int[] input = {26,78,27,100,33,67,90,23,66,5,38,7,35,23,52,22,83,51,98,69,81,32,78,28,94,13,2,97,3,76,99,51,9,21,84,66,65,36,100,41};
		
		List<Integer> expected = Arrays.asList(10,27,10,35,12,22,28,8,19,2,12,2,9,6,12,5,17,9,19,12,14,6,12,5,12,3,0,10,0,7,8,4,0,0,4,3,2,0,1,0);
		List<Integer> actual = cs.countSmaller(input);
		
		System.out.println("i|input[i]|expected.get(i)|actual.get(i)|-");
		System.out.println("---|---|---|---|---");
		for(int i = 0;i < input.length; i++) {
			System.out.print(i);
			System.out.print("|");
			System.out.print(input[i]);
			System.out.print("|");
			System.out.print(expected.get(i));
			System.out.print("|");
			System.out.print(actual.get(i));
			
			if(!expected.get(i).equals(actual.get(i))) {
				System.out.print("|<---");
			}else {
				System.out.print("|-");
			}
			System.out.print("\n");
		}
	}
	
	@Test
	public void test7() {
		CountOfSmallerNumbersAfterSelf cs = new CountOfSmallerNumbersAfterSelf();
		assertThat(cs.countSmaller(new int[] {1, 0, 1, 3, 1, 1}), is(asList(1, 0, 0, 2, 0, 0)));
	}
	
	@Test
	public void test8() throws IOException {
		int[] input = MyUtils.readIntArray("src/test/resources/bigArray.txt");
		CountOfSmallerNumbersAfterSelf cs = new CountOfSmallerNumbersAfterSelf();
		//System.out.println(cs.countSmaller(input));
		
		assertThat(cs.countSmaller(input), is(cs.countSmaller4(input)));
		
	}
	
	@Test
	public void test9() {
		CountOfSmallerNumbersAfterSelf cs = new CountOfSmallerNumbersAfterSelf();
		assertThat(cs.countSmaller(new int[] {1,9,7,8,5}), is(asList(0,3,1,1,0)));
	}
	
	
}
