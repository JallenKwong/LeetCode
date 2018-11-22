package com.lun.medium;

import java.util.Arrays;

public class BoatsToSavePeople {
    
	/**
     * <h4>Approach : Greedy (Two Pointer)</h4>
     * <p><strong>Intuition</strong></p>
     * <p>If the heaviest person can share a boat with the lightest person, then do so.  Otherwise, the heaviest person can't pair with anyone, so they get their own boat.</p>
     * <p>The reason this works is because if the lightest person can pair with anyone, they might as well pair with the heaviest person.</p>
     * <p><strong>Algorithm</strong></p>
     * <p>Let <code>people[i]</code> to the currently lightest person, and <code>people[j]</code> to the heaviest.</p>
     * <p>Then, as described above, if the heaviest person can share a boat with the lightest person (if <code>people[j] + people[i] &lt;= limit</code>) then do so; otherwise, the heaviest person sits in their own boat.</p>
     * 
     * <p><strong>Complexity Analysis</strong></p>
     * <ul>
     * 	<li>Time Complexity: O(NlogN), where N is the length of people.</li>
     * 	<li>Space Complexity: O(N).---I think there is O(1)</li>
     * </ul>
     * @param people
     * @param limit
     * @return
     */
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0, j = people.length - 1;
        int ans = 0;

        while (i <= j) {
            ans++;
            
            //When i == j you are on the last person 
            //,so if you don't do i <= j I believe you are leaving the last person behind
            if (people[i] + people[j] <= limit)
                i++;
            j--;
        }

        return ans;
    }
    /*numRescueBoats(int[] people, int limit)运行轨迹
	
	输入：people = {3, 2, 2, 1}, limit = 3
	
	people排升序, people = [1, 2, 2, 3]
	
	i = 0, j = people.length = 4 - 1 = 3
	ans = 0
	
	循环部分
		(i = 0) <= (j = 3)为true
			ans++, ans = 1
			if检测: (people[i = 0] + people[j = 3] = 4) <= limit = 3 为 false
			j--, j = 2
			
		(i = 0) <= (j = 2)为true
			ans++, ans = 2
			if检测: (people[i = 0] + people[j = 2] = 3) <= limit = 3 为 true
				i++, i = 1
			j--, j = 1
			
		(i = 1) <= (j = 1)为true
			ans++, ans = 3
			if检测: (people[i = 1] + people[j = 1] = 4) <= limit = 3 为 false
			j--, j = 0
			
		(i = 1) <= (j = 0)为false, 跳出 循环
		
	ans = 3

	输出：3
    */
    
}
