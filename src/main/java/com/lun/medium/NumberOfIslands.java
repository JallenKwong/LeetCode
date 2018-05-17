package com.lun.medium;

public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        
        if(grid == null|| grid.length == 0) 
            return 0;
        
    	boolean[][] marked = new boolean[grid.length][grid[0].length];
    	int result = 0;
    	
    	for(int i = 0; i < grid.length; i++) {
    		for(int j = 0; j < grid[i].length; j++) {
    			if(!marked[i][j] && grid[i][j] == '1') {
    				dfs(grid, marked, i, j);
    				result++;
    			}
    		}
    	}    	
    	return result;        
    }
    
    private void dfs(char[][] grid, boolean[][] marked, int i, int j) {
    	marked[i][j] = true;
    	
    	if(i - 1 >= 0) {
    		if(!marked[i - 1][j] && grid[i - 1][j] == '1')
    			dfs(grid, marked, i - 1, j);
    	}
    	
    	if(i + 1 < grid.length) {
    		if(!marked[i + 1][j] && grid[i + 1][j] == '1')
    			dfs(grid, marked, i + 1, j);
    	}
    	
    	if(j - 1 >= 0) {
    		if(!marked[i][j - 1] && grid[i][j - 1] == '1')
    			dfs(grid, marked, i, j - 1);
    	}
    	
    	if(j + 1 < grid[i].length) {
    		if(!marked[i][j + 1] && grid[i][j + 1] == '1')
    			dfs(grid, marked, i, j + 1);    		
    	}
    }
}
