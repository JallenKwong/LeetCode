package com.lun.medium;

import org.junit.Assert;
import org.junit.Test;

public class TestNumberOfIslands {
    @Test
    public void testNumIslands() {
    	NumberOfIslands noi = new NumberOfIslands();
    	
    	
    	char[][] grid = {{'1','1','1','1','0'},
    					{'1','1','0','1','0'},
    					{'1','1','0','0','0'},
    					{'0','0','0','0','0'}};
    	Assert.assertEquals(1, noi.numIslands(grid));
    	
    	char[][] grid2 = {{'1','1','0','0','0'},
						{'1','1','0','0','0'},
						{'0','0','1','0','0'},
						{'0','0','0','1','1'}};
    	Assert.assertEquals(3, noi.numIslands(grid2));
    }
}
