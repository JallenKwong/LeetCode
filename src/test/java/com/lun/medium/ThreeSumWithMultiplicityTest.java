package com.lun.medium;

import org.junit.Assert;
import org.junit.Test;

public class ThreeSumWithMultiplicityTest {

	@Test
	public void test() {
		ThreeSumWithMultiplicity t = new ThreeSumWithMultiplicity();
		
		Assert.assertEquals(20, t.threeSumMulti(new int[]{1,1,2,2,3,3,4,4,5,5}, 8));
	}
	
	@Test
	public void test2() {
		ThreeSumWithMultiplicity t = new ThreeSumWithMultiplicity();
		
		Assert.assertEquals(12, t.threeSumMulti(new int[]{1,1,2,2,2,2}, 5));
	}
}

/*After test():
DEBUG - No.0 loop
DEBUG - A[0]: 1
DEBUG - target - A[i]: 7
DEBUG - map.getOrDefault(target - A[i], 0): 0
DEBUG - res: 0
DEBUG - 

DEBUG - No.1 loop
DEBUG - A[1]: 1
DEBUG - target - A[i]: 7
DEBUG - map.getOrDefault(target - A[i], 0): 0
DEBUG - res: 0
DEBUG - 	No.0 inner loop
DEBUG - 	A[0]: 1
DEBUG - 	temp = A[1] + A[0]: 2
DEBUG - 	After putting map.getOrDefault(temp, 0): 1
DEBUG - 

DEBUG - 

DEBUG - No.2 loop
DEBUG - A[2]: 2
DEBUG - target - A[i]: 6
DEBUG - map.getOrDefault(target - A[i], 0): 0
DEBUG - res: 0
DEBUG - 	No.0 inner loop
DEBUG - 	A[0]: 1
DEBUG - 	temp = A[2] + A[0]: 3
DEBUG - 	After putting map.getOrDefault(temp, 0): 1
DEBUG - 

DEBUG - 	No.1 inner loop
DEBUG - 	A[1]: 1
DEBUG - 	temp = A[2] + A[1]: 3
DEBUG - 	After putting map.getOrDefault(temp, 0): 2
DEBUG - 

DEBUG - 

DEBUG - No.3 loop
DEBUG - A[3]: 2
DEBUG - target - A[i]: 6
DEBUG - map.getOrDefault(target - A[i], 0): 0
DEBUG - res: 0
DEBUG - 	No.0 inner loop
DEBUG - 	A[0]: 1
DEBUG - 	temp = A[3] + A[0]: 3
DEBUG - 	After putting map.getOrDefault(temp, 0): 3
DEBUG - 

DEBUG - 	No.1 inner loop
DEBUG - 	A[1]: 1
DEBUG - 	temp = A[3] + A[1]: 3
DEBUG - 	After putting map.getOrDefault(temp, 0): 4
DEBUG - 

DEBUG - 	No.2 inner loop
DEBUG - 	A[2]: 2
DEBUG - 	temp = A[3] + A[2]: 4
DEBUG - 	After putting map.getOrDefault(temp, 0): 1
DEBUG - 

DEBUG - 

DEBUG - No.4 loop
DEBUG - A[4]: 3
DEBUG - target - A[i]: 5
DEBUG - map.getOrDefault(target - A[i], 0): 0
DEBUG - res: 0
DEBUG - 	No.0 inner loop
DEBUG - 	A[0]: 1
DEBUG - 	temp = A[4] + A[0]: 4
DEBUG - 	After putting map.getOrDefault(temp, 0): 2
DEBUG - 

DEBUG - 	No.1 inner loop
DEBUG - 	A[1]: 1
DEBUG - 	temp = A[4] + A[1]: 4
DEBUG - 	After putting map.getOrDefault(temp, 0): 3
DEBUG - 

DEBUG - 	No.2 inner loop
DEBUG - 	A[2]: 2
DEBUG - 	temp = A[4] + A[2]: 5
DEBUG - 	After putting map.getOrDefault(temp, 0): 1
DEBUG - 

DEBUG - 	No.3 inner loop
DEBUG - 	A[3]: 2
DEBUG - 	temp = A[4] + A[3]: 5
DEBUG - 	After putting map.getOrDefault(temp, 0): 2
DEBUG - 

DEBUG - 

DEBUG - No.5 loop
DEBUG - A[5]: 3
DEBUG - target - A[i]: 5
DEBUG - map.getOrDefault(target - A[i], 0): 2
DEBUG - res: 2
DEBUG - 	No.0 inner loop
DEBUG - 	A[0]: 1
DEBUG - 	temp = A[5] + A[0]: 4
DEBUG - 	After putting map.getOrDefault(temp, 0): 4
DEBUG - 

DEBUG - 	No.1 inner loop
DEBUG - 	A[1]: 1
DEBUG - 	temp = A[5] + A[1]: 4
DEBUG - 	After putting map.getOrDefault(temp, 0): 5
DEBUG - 

DEBUG - 	No.2 inner loop
DEBUG - 	A[2]: 2
DEBUG - 	temp = A[5] + A[2]: 5
DEBUG - 	After putting map.getOrDefault(temp, 0): 3
DEBUG - 

DEBUG - 	No.3 inner loop
DEBUG - 	A[3]: 2
DEBUG - 	temp = A[5] + A[3]: 5
DEBUG - 	After putting map.getOrDefault(temp, 0): 4
DEBUG - 

DEBUG - 	No.4 inner loop
DEBUG - 	A[4]: 3
DEBUG - 	temp = A[5] + A[4]: 6
DEBUG - 	After putting map.getOrDefault(temp, 0): 1
DEBUG - 

DEBUG - 

DEBUG - No.6 loop
DEBUG - A[6]: 4
DEBUG - target - A[i]: 4
DEBUG - map.getOrDefault(target - A[i], 0): 5
DEBUG - res: 7
DEBUG - 	No.0 inner loop
DEBUG - 	A[0]: 1
DEBUG - 	temp = A[6] + A[0]: 5
DEBUG - 	After putting map.getOrDefault(temp, 0): 5
DEBUG - 

DEBUG - 	No.1 inner loop
DEBUG - 	A[1]: 1
DEBUG - 	temp = A[6] + A[1]: 5
DEBUG - 	After putting map.getOrDefault(temp, 0): 6
DEBUG - 

DEBUG - 	No.2 inner loop
DEBUG - 	A[2]: 2
DEBUG - 	temp = A[6] + A[2]: 6
DEBUG - 	After putting map.getOrDefault(temp, 0): 2
DEBUG - 

DEBUG - 	No.3 inner loop
DEBUG - 	A[3]: 2
DEBUG - 	temp = A[6] + A[3]: 6
DEBUG - 	After putting map.getOrDefault(temp, 0): 3
DEBUG - 

DEBUG - 	No.4 inner loop
DEBUG - 	A[4]: 3
DEBUG - 	temp = A[6] + A[4]: 7
DEBUG - 	After putting map.getOrDefault(temp, 0): 1
DEBUG - 

DEBUG - 	No.5 inner loop
DEBUG - 	A[5]: 3
DEBUG - 	temp = A[6] + A[5]: 7
DEBUG - 	After putting map.getOrDefault(temp, 0): 2
DEBUG - 

DEBUG - 

DEBUG - No.7 loop
DEBUG - A[7]: 4
DEBUG - target - A[i]: 4
DEBUG - map.getOrDefault(target - A[i], 0): 5
DEBUG - res: 12
DEBUG - 	No.0 inner loop
DEBUG - 	A[0]: 1
DEBUG - 	temp = A[7] + A[0]: 5
DEBUG - 	After putting map.getOrDefault(temp, 0): 7
DEBUG - 

DEBUG - 	No.1 inner loop
DEBUG - 	A[1]: 1
DEBUG - 	temp = A[7] + A[1]: 5
DEBUG - 	After putting map.getOrDefault(temp, 0): 8
DEBUG - 

DEBUG - 	No.2 inner loop
DEBUG - 	A[2]: 2
DEBUG - 	temp = A[7] + A[2]: 6
DEBUG - 	After putting map.getOrDefault(temp, 0): 4
DEBUG - 

DEBUG - 	No.3 inner loop
DEBUG - 	A[3]: 2
DEBUG - 	temp = A[7] + A[3]: 6
DEBUG - 	After putting map.getOrDefault(temp, 0): 5
DEBUG - 

DEBUG - 	No.4 inner loop
DEBUG - 	A[4]: 3
DEBUG - 	temp = A[7] + A[4]: 7
DEBUG - 	After putting map.getOrDefault(temp, 0): 3
DEBUG - 

DEBUG - 	No.5 inner loop
DEBUG - 	A[5]: 3
DEBUG - 	temp = A[7] + A[5]: 7
DEBUG - 	After putting map.getOrDefault(temp, 0): 4
DEBUG - 

DEBUG - 	No.6 inner loop
DEBUG - 	A[6]: 4
DEBUG - 	temp = A[7] + A[6]: 8
DEBUG - 	After putting map.getOrDefault(temp, 0): 1
DEBUG - 

DEBUG - 

DEBUG - No.8 loop
DEBUG - A[8]: 5
DEBUG - target - A[i]: 3
DEBUG - map.getOrDefault(target - A[i], 0): 4
DEBUG - res: 16
DEBUG - 	No.0 inner loop
DEBUG - 	A[0]: 1
DEBUG - 	temp = A[8] + A[0]: 6
DEBUG - 	After putting map.getOrDefault(temp, 0): 6
DEBUG - 

DEBUG - 	No.1 inner loop
DEBUG - 	A[1]: 1
DEBUG - 	temp = A[8] + A[1]: 6
DEBUG - 	After putting map.getOrDefault(temp, 0): 7
DEBUG - 

DEBUG - 	No.2 inner loop
DEBUG - 	A[2]: 2
DEBUG - 	temp = A[8] + A[2]: 7
DEBUG - 	After putting map.getOrDefault(temp, 0): 5
DEBUG - 

DEBUG - 	No.3 inner loop
DEBUG - 	A[3]: 2
DEBUG - 	temp = A[8] + A[3]: 7
DEBUG - 	After putting map.getOrDefault(temp, 0): 6
DEBUG - 

DEBUG - 	No.4 inner loop
DEBUG - 	A[4]: 3
DEBUG - 	temp = A[8] + A[4]: 8
DEBUG - 	After putting map.getOrDefault(temp, 0): 2
DEBUG - 

DEBUG - 	No.5 inner loop
DEBUG - 	A[5]: 3
DEBUG - 	temp = A[8] + A[5]: 8
DEBUG - 	After putting map.getOrDefault(temp, 0): 3
DEBUG - 

DEBUG - 	No.6 inner loop
DEBUG - 	A[6]: 4
DEBUG - 	temp = A[8] + A[6]: 9
DEBUG - 	After putting map.getOrDefault(temp, 0): 1
DEBUG - 

DEBUG - 	No.7 inner loop
DEBUG - 	A[7]: 4
DEBUG - 	temp = A[8] + A[7]: 9
DEBUG - 	After putting map.getOrDefault(temp, 0): 2
DEBUG - 

DEBUG - 

DEBUG - No.9 loop
DEBUG - A[9]: 5
DEBUG - target - A[i]: 3
DEBUG - map.getOrDefault(target - A[i], 0): 4
DEBUG - res: 20
DEBUG - 	No.0 inner loop
DEBUG - 	A[0]: 1
DEBUG - 	temp = A[9] + A[0]: 6
DEBUG - 	After putting map.getOrDefault(temp, 0): 8
DEBUG - 

DEBUG - 	No.1 inner loop
DEBUG - 	A[1]: 1
DEBUG - 	temp = A[9] + A[1]: 6
DEBUG - 	After putting map.getOrDefault(temp, 0): 9
DEBUG - 

DEBUG - 	No.2 inner loop
DEBUG - 	A[2]: 2
DEBUG - 	temp = A[9] + A[2]: 7
DEBUG - 	After putting map.getOrDefault(temp, 0): 7
DEBUG - 

DEBUG - 	No.3 inner loop
DEBUG - 	A[3]: 2
DEBUG - 	temp = A[9] + A[3]: 7
DEBUG - 	After putting map.getOrDefault(temp, 0): 8
DEBUG - 

DEBUG - 	No.4 inner loop
DEBUG - 	A[4]: 3
DEBUG - 	temp = A[9] + A[4]: 8
DEBUG - 	After putting map.getOrDefault(temp, 0): 4
DEBUG - 

DEBUG - 	No.5 inner loop
DEBUG - 	A[5]: 3
DEBUG - 	temp = A[9] + A[5]: 8
DEBUG - 	After putting map.getOrDefault(temp, 0): 5
DEBUG - 

DEBUG - 	No.6 inner loop
DEBUG - 	A[6]: 4
DEBUG - 	temp = A[9] + A[6]: 9
DEBUG - 	After putting map.getOrDefault(temp, 0): 3
DEBUG - 

DEBUG - 	No.7 inner loop
DEBUG - 	A[7]: 4
DEBUG - 	temp = A[9] + A[7]: 9
DEBUG - 	After putting map.getOrDefault(temp, 0): 4
DEBUG - 

DEBUG - 	No.8 inner loop
DEBUG - 	A[8]: 5
DEBUG - 	temp = A[9] + A[8]: 10
DEBUG - 	After putting map.getOrDefault(temp, 0): 1
DEBUG - 

DEBUG - 
*/

/*After test2():
DEBUG - No.0 loop
DEBUG - A[0]: 1
DEBUG - target - A[i]: 4
DEBUG - map.getOrDefault(target - A[i], 0): 0
DEBUG - res: 0
DEBUG - 

DEBUG - No.1 loop
DEBUG - A[1]: 1
DEBUG - target - A[i]: 4
DEBUG - map.getOrDefault(target - A[i], 0): 0
DEBUG - res: 0
DEBUG - 	No.0 inner loop
DEBUG - 	A[0]: 1
DEBUG - 	temp = A[1] + A[0]: 2
DEBUG - 	After putting, map.getOrDefault(temp, 0): 1
DEBUG - 

DEBUG - 

DEBUG - No.2 loop
DEBUG - A[2]: 2
DEBUG - target - A[i]: 3
DEBUG - map.getOrDefault(target - A[i], 0): 0
DEBUG - res: 0
DEBUG - 	No.0 inner loop
DEBUG - 	A[0]: 1
DEBUG - 	temp = A[2] + A[0]: 3
DEBUG - 	After putting, map.getOrDefault(temp, 0): 1
DEBUG - 

DEBUG - 	No.1 inner loop
DEBUG - 	A[1]: 1
DEBUG - 	temp = A[2] + A[1]: 3
DEBUG - 	After putting, map.getOrDefault(temp, 0): 2
DEBUG - 

DEBUG - 

DEBUG - No.3 loop
DEBUG - A[3]: 2
DEBUG - target - A[i]: 3
DEBUG - map.getOrDefault(target - A[i], 0): 2
DEBUG - res: 2
DEBUG - 	No.0 inner loop
DEBUG - 	A[0]: 1
DEBUG - 	temp = A[3] + A[0]: 3
DEBUG - 	After putting, map.getOrDefault(temp, 0): 3
DEBUG - 

DEBUG - 	No.1 inner loop
DEBUG - 	A[1]: 1
DEBUG - 	temp = A[3] + A[1]: 3
DEBUG - 	After putting, map.getOrDefault(temp, 0): 4
DEBUG - 

DEBUG - 	No.2 inner loop
DEBUG - 	A[2]: 2
DEBUG - 	temp = A[3] + A[2]: 4
DEBUG - 	After putting, map.getOrDefault(temp, 0): 1
DEBUG - 

DEBUG - 

DEBUG - No.4 loop
DEBUG - A[4]: 2
DEBUG - target - A[i]: 3
DEBUG - map.getOrDefault(target - A[i], 0): 4
DEBUG - res: 6
DEBUG - 	No.0 inner loop
DEBUG - 	A[0]: 1
DEBUG - 	temp = A[4] + A[0]: 3
DEBUG - 	After putting, map.getOrDefault(temp, 0): 5
DEBUG - 

DEBUG - 	No.1 inner loop
DEBUG - 	A[1]: 1
DEBUG - 	temp = A[4] + A[1]: 3
DEBUG - 	After putting, map.getOrDefault(temp, 0): 6
DEBUG - 

DEBUG - 	No.2 inner loop
DEBUG - 	A[2]: 2
DEBUG - 	temp = A[4] + A[2]: 4
DEBUG - 	After putting, map.getOrDefault(temp, 0): 2
DEBUG - 

DEBUG - 	No.3 inner loop
DEBUG - 	A[3]: 2
DEBUG - 	temp = A[4] + A[3]: 4
DEBUG - 	After putting, map.getOrDefault(temp, 0): 3
DEBUG - 

DEBUG - 

DEBUG - No.5 loop
DEBUG - A[5]: 2
DEBUG - target - A[i]: 3
DEBUG - map.getOrDefault(target - A[i], 0): 6
DEBUG - res: 12
DEBUG - 	No.0 inner loop
DEBUG - 	A[0]: 1
DEBUG - 	temp = A[5] + A[0]: 3
DEBUG - 	After putting, map.getOrDefault(temp, 0): 7
DEBUG - 

DEBUG - 	No.1 inner loop
DEBUG - 	A[1]: 1
DEBUG - 	temp = A[5] + A[1]: 3
DEBUG - 	After putting, map.getOrDefault(temp, 0): 8
DEBUG - 

DEBUG - 	No.2 inner loop
DEBUG - 	A[2]: 2
DEBUG - 	temp = A[5] + A[2]: 4
DEBUG - 	After putting, map.getOrDefault(temp, 0): 4
DEBUG - 

DEBUG - 	No.3 inner loop
DEBUG - 	A[3]: 2
DEBUG - 	temp = A[5] + A[3]: 4
DEBUG - 	After putting, map.getOrDefault(temp, 0): 5
DEBUG - 

DEBUG - 	No.4 inner loop
DEBUG - 	A[4]: 2
DEBUG - 	temp = A[5] + A[4]: 4
DEBUG - 	After putting, map.getOrDefault(temp, 0): 6
DEBUG - 

DEBUG - 
*/
