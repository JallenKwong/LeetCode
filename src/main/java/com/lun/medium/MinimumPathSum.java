package com.lun.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinimumPathSum {
    
	/**
     * 
     * 根据Dijkstra最短路径算法
     * 
     * @param grid
     * @return
     */
    public int minPathSum(int[][] grid) {
    	
    	if(grid == null || grid.length == 0) {
    		throw new IllegalArgumentException("illegal grid");
    	}
    	
    	int rowLength = grid.length;
    	int colLength = grid[0].length;
    	
    	int[] distTo = new int[rowLength * colLength]; //二维转换成一维 	
    	Arrays.fill(distTo, Integer.MAX_VALUE);
    	
    	distTo[0] = grid[0][0];//起点
    	
    	Map<Integer,Integer> pq = new HashMap<>();//假冒索引优先队列
    	pq.put(0, distTo[0]);
    	
    	while(!pq.isEmpty()) {
    		
    		//迭代选出pq最小值
    		Integer key = null;
    		Integer min = Integer.MAX_VALUE;
    		for(Map.Entry<Integer, Integer> entry : pq.entrySet()) {
    			if(entry.getValue() < min) {
    				key = entry.getKey();
    				min = entry.getValue();
    			}
    		}
    		
    		pq.remove(key);
    		relax(key, rowLength, colLength, grid, distTo, pq);
    	}
    	
        return distTo[distTo.length - 1];
    }
    
    private void relax(int index, int rowLength, int colLength, 
    		int[][] grid, int[] distTo, Map<Integer,Integer> pq) {
    	
    	//一维转二维
    	int row = index / colLength, col = index % colLength;
    	
		//右向
		if(col < colLength - 1) {
			int weight = grid[row][col + 1];//右向权重
			int index2 = row * colLength + col + 1;
			
			if(distTo[index2] > distTo[index] + weight) {
				distTo[index2] = distTo[index] + weight;
				pq.put(index2, distTo[index2]);
			}
		}
		
    	//下向
		if(row < rowLength - 1) {
			int weight = grid[row + 1][col];//下向权重
			int index2 = (row + 1) * colLength + col;
			
			if(distTo[index2] > distTo[index] + weight) {
				distTo[index2] = distTo[index] + weight;
				pq.put(index2, distTo[index2]);
			}
		}
    }
    
    
    /**
     * 
     * 
     * 空间使用原数组
     * 
     * @param grid 
     * @return
     */
    public int minPathSum2(int[][] grid) {
    	int m = grid.length, n = grid[0].length;
    	
    	for(int i = 0; i < m; i++){
    		for(int j = 0; j < n; j++){
	    		if(i == 0 && j != 0) //第一行
	    			grid[i][j] += grid[i][j-1];
	    		
	    		if(i != 0 && j == 0) //第一列
	    			grid[i][j] += grid[i-1][j];
	    		
	    		if (i != 0 && j != 0) 
	    			grid[i][j] += Math.min(grid[i-1][j], grid[i][j-1]);
    		}
    	}
    	
    	return grid[m - 1][n - 1];
    }
    
    /*minPathSum2(grid)的运行轨迹
     * 
	输入：grid = {{1,3,1},
			    {1,5,1},
			    {4,2,1}};
	
	m = grid.length = 3, n = grid[0].length = 3
	
	第0级循环部分
		i = 0; i < m = 3 为 true
			第1级循环部分
				j = 0; j < 3 为 true
					grid[i = 0][j = 0] 没事可做
					j++
					
				j = 1; j < 3 为 true
					grid[i = 0][j = 1] = (grid[i = 0][j = 1] = 3) + (grid[i = 0][j - 1 = 0] = 1) = 4
					j++	
					
				j = 2; j < 3 为 true
					grid[i = 0][j = 2] = (grid[i = 0][j = 2] = 1) + (grid[i = 0][j - 1 = 1] = 4) = 5
					j++
					
				j = 3; j < 3 为 false, 跳出 第1级循环
			i++
			
		i = 1; i < m = 3 为 true
			第1级循环部分
				j = 0; j < 3 为 true
					grid[i = 1][j = 0] = (grid[i = 1][j = 0] = 1) + (grid[i - 1 = 0][j = 0] = 1) = 2
					j++
					
				j = 1; j < 3 为 true
					min = min((grid[i - 1 = 0][j = 1] = 4), (grid[i = 1][j - 1 = 0] = 2)) = 2
					grid[i = 1][j = 1] = (grid[i = 1][j = 1] = 5) + (min = 2) = 7
					j++
					
				j = 2; j < 3 为 true
					min = min((grid[i - 1 = 0][j = 2] = 5), (grid[i = 1][j - 1 = 1] = 7)) = 5
					grid[i = 1][j = 2] = (grid[i = 1][j = 2] = 5) + (min = 1) = 6
					j++
					
				j = 3; j < 3 为 false, 跳出 第1级循环
			i++
			
		i = 2; i < m = 3 为 true
			第1级循环部分
				j = 0; j < 3 为 true
					grid[i = 2][j = 0] = (grid[i = 2][j = 0] = 4) + (grid[i - 1 = 1][j = 0] = 1) = 6
					j++
					
				j = 1; j < 3 为 true
					min = min((grid[i - 1 = 1][j = 1] = 7), (grid[i = 2][j - 1 = 0] = 6)) = 6
					grid[i = 2][j = 1] = (grid[i = 2][j = 1] = 2) + (min = 6) = 8
					j++
					
				j = 2; j < 3 为 true
					min = min((grid[i - 1 = 1][j = 2] = 6), (grid[i = 2][j - 1 = 1] = 8)) = 6
					grid[i = 2][j = 2] = (grid[i = 2][j = 2] = 1) + (min = 6) = 7
					j++
					
				j = 3; j < 3 为 false, 跳出 第1级循环
			i++
				
		i = 3; i < m = 3 为 false, 跳出 第0级循环
		
	输出：grid[m - 1][n - 1] = grid[i = 2][j = 2] = 7
			
	//////////////////////////////////////////////////	
				
	循环内，grid内的数据变化	
	
	[i = 0, j = 0]
	
	{{1,3,1},
	{1,5,1},
	{4,2,1}};
	
	---
	
	**.**:跟上一次相比有变化的部分
	
	[i = 0, j = 1]
	
	{{1,**4**,1},
	{1,5,1},
	{4,2,1}};
	
	---
	
	[i = 0, j = 2]
	
	{{1,4,**5**},
	{1,5,1},
	{4,2,1}};
	
	---
	
	[i = 1, j = 0]
	
	{{1,4,5},
	{**2**,5,1},
	{4,2,1}};
	
	---
	
	[i = 1, j = 1]
	
	{{1,4,5},
	{2,**7**,1},
	{4,2,1}};
	
	---
	
	[i = 1, j = 2]
	
	{{1,4,5},
	{2,7,**6**},
	{4,2,1}};
	
	---
	
	[i = 2, j = 0]
	
	{{1,4,5},
	{2,7,6},
	{**6**,2,1}};
	
	---
	
	[i = 2, j = 1]
	
	{{1,4,5},
	{2,7,6},
	{6,**8**,1}};
	
	---
	
	[i = 2, j = 2]
	
	{{1,4,5},
	{2,7,6},
	{6,8,**7**}};
	
	---	
	这个过程有点像织布

    */
    
    
    public int minPathSum3(int[][] grid) {
        
    	if(grid == null || grid.length == 0|| grid[0].length == 0) {
    		throw new IllegalArgumentException("illegal grid");
    	}
    	int rowNum = grid.length, colNum = grid[0].length;
        int[] dist = new int[colNum];
        
        for(int i = 0; i < rowNum; i++) {
        	for(int j = 0; j < colNum; j++) {
        		if(i == 0 && j == 0) {
        			dist[j] = grid[i][j];
        		}else if(i == 0 && j != 0) {
        			dist[j] = dist[j - 1] + grid[i][j];
        		}else if(i != 0 && j == 0) {
        			dist[j] = dist[j] + grid[i][j];
        		}else {
        			dist[j] = Math.min(dist[j], dist[j - 1]) + grid[i][j];
        		}
        		/* 另一种写法
        		int left = 0, up = 0;
        		
        		if(i > 0) {
        			up = dist[j];
        			if(j == 0) {//第一列特殊情况
        				left = Integer.MAX_VALUE;
        			}
        		}
        		
        		if(j > 0) {
        			left = dist[j - 1];
        			if(i == 0) {//第一行特殊情况
        				up = Integer.MAX_VALUE;
        			}
        		}

        		dist[j] = Math.min(up, left) + grid[i][j];
        		 */
        		
        	}
        }
        
        return dist[colNum - 1];
    }

}
