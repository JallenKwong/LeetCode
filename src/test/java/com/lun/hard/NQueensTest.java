package com.lun.hard;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;

import org.hamcrest.collection.IsEmptyCollection;
import org.junit.Test;

public class NQueensTest {

	@Test
	public void test() {
		NQueens obj = new NQueens();

		assertThat(obj.solveNQueens(1), is(Arrays.asList(Arrays.asList("Q"))));
		
		assertThat(obj.solveNQueens(3), IsEmptyCollection.empty());
		
		assertThat(obj.solveNQueens(4), is(Arrays.asList(Arrays.asList(".Q..","...Q","Q...","..Q."), //
														Arrays.asList("..Q.","Q...","...Q",".Q.."))));
	}
}
