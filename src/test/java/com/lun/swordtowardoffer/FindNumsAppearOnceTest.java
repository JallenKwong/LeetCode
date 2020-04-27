package com.lun.swordtowardoffer;

import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Test;


public class FindNumsAppearOnceTest {

	@Test
	public void testFind() {
		FindNumsAppearOnce fo = new FindNumsAppearOnce();
		
		int[] data = {2, 4, 3, 6, 3, 2, 5, 5};
		
		int[] actual = {6, 4};
		Arrays.sort(actual);
		
		int[] expecteds = fo.find(data);
		Arrays.sort(expecteds);
		
		assertArrayEquals(expecteds, actual);
		
		int result = 0;
		for(int i = 0; i < data.length; i++) {
			result ^= data[i];
			System.out.println("| " + i + " | " + data[i] + " | " 
					+ Integer.toBinaryString(data[i]) + " |" + Integer.toBinaryString(result));
		}
		
		System.out.println(Integer.toBinaryString(result));
		
	}

}

/*
2 : 010
4 : 100
3 : 011
6 : 110
3 : 011
2 : 010
5 : 101
5 : 101

result = 010

上面倒数第二位是1有  2, 3, 6, 3, 2
上面倒数第二位是0有 4, 5, 5

得出 

4 : 100

6 : 110

*/
