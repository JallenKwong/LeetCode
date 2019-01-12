package com.lun.swordtowardoffer;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

import com.lun.util.Pair;

public class FindNumbersWithSum2Test {

	@Test
	@SuppressWarnings("unchecked")
	public void testFind() {
		FindNumbersWithSum2 fs = new FindNumbersWithSum2();
		
		fs.find(15).forEach((s)->System.out.println(s));
		
		assertThat(fs.find(15), containsInAnyOrder(new Pair<>(1,5), new Pair<>(4,6), new Pair<>(7,8)));
	}

}
