package com.lun.medium;

import java.util.Arrays;

public class MaximumLengthOfPairChain {
    
	
	/**
	 * 
	 * <strong>Intuition</strong> 
	 * 
	 * <p>If a chain of length k ends at some pairs[i], and pairs[i][1] < pairs[j][0], we can extend this chain to a chain of length k+1.</p>
	 * 
	 * <strong>Algorithm</strong> 
	 * 
	 * <p>Sort the pairs by first coordinate, and let dp[i] be the length of the longest chain ending at pairs[i]. When i < j and pairs[i][1] < pairs[j][0], we can extend the chain, and so we have the candidate answer dp[j] = max(dp[j], dp[i] + 1).</p>
	 * 
	 * <strong>Complexity Analysis</strong>
	 * 
	 * <ul>
	 * <li>Time Complexity: O(N^2) where N is the length of pairs. There are two for loops, and N^2 dominates the sorting step.</li>
	 * <li>Space Complexity: O(N) for sorting and to store dp.</li>
	 * </ul>
	 * 
	 * @param pairs pairs of numbers
	 * @return find the length longest chain which can be formed
	 */
	public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> a[0] - b[0]);//根据子元素数组的第[0]个元素排序
        int N = pairs.length;
        int[] dp = new int[N];
        Arrays.fill(dp, 1);//最大长度至少只有一个

        for (int j = 1; j < N; ++j) {//数组第[1]个元素开始
            for (int i = 0; i < j; ++i) {
                if (pairs[i][1] < pairs[j][0])
                    dp[j] = Math.max(dp[j], dp[i] + 1);
            }
        }

        //选出dp中最大值max
        int ans = 0;
        for (int x: dp) 
        	if (x > ans) ans = x;
        return ans;    	
    }
	
	/*findLongestChain(pairs) 运行轨迹
	
	输入：pairs = {{6, 7}, {5, 6}, {2, 4}, {1, 2}, {2, 3}, {3, 4}}
	N = pairs.length = 6
	
	根据子元素数组的第[0]个元素排序
	pairs排序后：[[1, 2], [2, 4], [2, 3], [3, 4], [5, 6], [6, 7]]
	dp数组初始：[1, 1, 1, 1, 1, 1]
	
	循环部分
		第0层循环：
			j = 1; j < (N = 6) 为 true
				第1层循环：
					i = 0; i < (j = 1) 为 true
						if检测：pairs[i = 0][1] = 2 < pairs[j = 1][0] = 2 为 false
						i++
					i = 1; i < (j = 1) 为 false, 跳出 第1层循环
				j++
				
			j = 2; j < (N = 6) 为 true
				第1层循环：
					i = 0; i < (j = 2) 为 true
						if检测：(pairs[i = 0][1] = 2) < (k = pairs[j = 2][0] = 2) 为 false
						i++
					i = 1; i < (j = 2) 为 true
						if检测：(pairs[i = 1][1] = 4) < (k = 2) 为 false
						i++
					i = 2; i < (j = 2) 为 false, 跳出 第1层循环
				j++
			
			j = 3; j < (N = 6) 为 true
				第1层循环：
					k = pairs[j = 3][0] = 3
					i = 0; i < (j = 3) 为 true
						if检测：(pairs[i = 0][1] = 2) < (k = 3) 为 true
							dp[j = 3] = max(dp[j = 3] = 1, dp[i = 0] + 1 = 2) = 2, dp = [1, 1, 1, 2, 1, 1]
						i++
					i = 1; i < (j = 3) 为 true
						if检测：(pairs[i = 1][1] = 4) < (k = 3) 为 false
						i++
					i = 2; i < (j = 3) 为 true
						if检测：(pairs[i = 2][1] = 3) < (k = 3) 为 false
						i++
					i = 3; i < (j = 3) 为 false, 跳出 第1层循环
				j++
			
			j = 4; j < (N = 6) 为 true
				第1层循环：
					k = pairs[j = 4][0] = 5
					i = 0; i < (j = 4) 为 true
						if检测：(pairs[i = 0][1] = 2) < (k = 5) 为 true
							dp[j = 4] = max(dp[j = 4] = 1, dp[i = 0] + 1 = 2) = 2, dp = [1, 1, 1, 2, 2, 1]
						i++
					i = 1; i < (j = 4) 为 true
						if检测：(pairs[i = 1][1] = 4) < (k = 5) 为 true
							dp[j = 4] = max(dp[j = 4] = 2, dp[i = 1] + 1 = 2) = 2, dp = [1, 1, 1, 2, 2, 1]与上次比没变
						i++
					i = 2; i < (j = 4) 为 true
						if检测：(pairs[i = 2][1] = 3) < (k = 5) 为 true
							dp[j = 4] = max(dp[j = 4] = 2, dp[i = 2] + 1 = 2) = 2, dp = [1, 1, 1, 2, 2, 1]与上次比没变
						i++
					i = 3; i < (j = 4) 为 true
						if检测：(pairs[i = 3][1] = 4) < (k = 5) 为 true
							dp[j = 4] = max(dp[j = 4] = 2, dp[i = 3] + 1 = 3) = 3, dp = [1, 1, 1, 2, 3, 1]
						i++
					i = 4; i < (j = 4) 为 false, 跳出 第1层循环				
				j++

			j = 5; j < (N = 6) 为 true
				第1层循环：
					k =  pairs[j = 5][0] = 6
					i = 0; i < (j = 5) 为 true
						if检测：(pairs[i = 0][1] = 2) < (k = 6) 为 true
							dp[j = 5] = max(dp[j = 5] = 1, dp[i = 0] + 1 = 2) = 2, dp = [1, 1, 1, 2, 3, 2]
						i++
					i = 1; i < (j = 5) 为 true
						if检测：(pairs[i = 1][1] = 4) < (k = 6) 为 true
							dp[j = 5] = max(dp[j = 5] = 2, dp[i = 1] + 1 = 2) = 2, dp = [1, 1, 1, 2, 3, 2]与上次比没变
						i++
					i = 2; i < (j = 5) 为 true
						if检测：(pairs[i = 2][1] = 3) < (k = 6) 为 true
							dp[j = 5] = max(dp[j = 5] = 2, dp[i = 2] + 1 = 2) = 2, dp = [1, 1, 1, 2, 3, 2]与上次比没变
						i++
					i = 3; i < (j = 5) 为 true
						if检测：(pairs[i = 3][1] = 4) < (k = 6) 为 true
							dp[j = 5] = max(dp[j = 5] = 2, dp[i = 3] + 1 = 3) = 3, dp = [1, 1, 1, 2, 3, 3]
						i++
					i = 4; i < (j = 5) 为 true
						if检测：(pairs[i = 4][1] = 6) < (k = 6) 为 false
						i++
					i = 5; i < (j = 5) 为 false, 跳出 第1层循环	
				j++			

			j = 6; j < (N = 6) 为 false, 跳出 第0层循环
		
	dp = [1, 1, 1, 2, 3, 3]
	
	max = 选出dp中最大值 = 3
	
	输出：max = 3
	*/
    
    /**
	 * 
	 * <strong>Intuition</strong> 
	 * 
	 * <p>We can greedily add to our chain. Choosing the next addition to be the one with the lowest second coordinate is at least better than a choice with a larger second coordinate.</p>
	 * 
	 * <strong>Algorithm</strong> 
	 * 
	 * <p>Consider the pairs in increasing order of their second coordinate. We'll try to add them to our chain. If we can, by the above argument we know that it is correct to do so.</p>
	 * 
	 * <strong>Complexity Analysis</strong>
	 * 
	 * 
	 * <ul>
	 * <li>Time Complexity: O(N log N) where N is the length of S. The complexity comes from the sorting step, but the rest of the solution does linear work.</li>
	 * <li>Space Complexity: O(N) The additional space complexity of storing <strong>cur</strong> and <strong>ans</strong>, but sorting uses O(N) space. Depending on the implementation of the language used, sorting can sometimes use less space.</li>
	 * </ul>
     * @param pairs pairs of numbers
     * @return find the length longest chain which can be formed
     */
    public int findLongestChain2(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> a[1] - b[1]);
        int cur = Integer.MIN_VALUE, ans = 0;
        for (int[] pair : pairs) 
        	if (cur < pair[0]) {
	            cur = pair[1];
	            ans++;
        	}
        return ans; 	
    }
    
    /*findLongestChain(pairs) 运行轨迹
	输入：pairs = {{6, 7}, {5, 6}, {2, 4}, {1, 2}, {2, 3}, {3, 4}}
	根据子元素数组的第[1]个元素 排升序
	
	pairs排序后：[[1, 2], [2, 3], [2, 4], [3, 4], [5, 6], [6, 7]]
	cur = -2147483648, ans = 0
	
	循环部分 for (int[] pair : pairs) 
		pair = [1, 2]
			if检测：cur =  -2147483648 < pair[0] = 1 为 true
				cur = pair[1] = 2
				ans++, ans = 1
		
		pair = [2, 3]
			if检测：cur =  2 < pair[0] = 2 为 false
		
		pair = [2, 4]
			if检测：cur =  2 < pair[0] = 2 为 false
		
		pair = [3, 4]
			if检测：cur =  2 < pair[0] = 3 为 true
				cur = pair[1] = 4
				ans++, ans = 2			
		
		pair = [5, 6]
			if检测：cur =  4 < pair[0] = 5 为 true
				cur = pair[1] = 6
				ans++, ans = 3	
		
		pair = [6, 7]	
			if检测：cur =  6 < pair[0] = 6 为 false
				
	输出：ans = 3
    
 	也就是[[1, 2],[3, 4],[5, 6]]
 	
    */
    
    
}
