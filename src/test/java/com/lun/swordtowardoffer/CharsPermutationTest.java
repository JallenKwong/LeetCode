package com.lun.swordtowardoffer;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import java.util.List;
import org.junit.Test;


public class CharsPermutationTest {

	@Test
	public void testPermute() {
		CharsPermutation cp = new CharsPermutation();
		
		List<String> list = cp.permute("abc");
		//System.out.println(list);
		assertThat(list, containsInAnyOrder("abc","acb","bac","bca","cba","cab"));
	}

}
