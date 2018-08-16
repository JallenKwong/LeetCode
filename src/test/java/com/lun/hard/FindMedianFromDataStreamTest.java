package com.lun.hard;

import org.junit.Assert;
import org.junit.Test;

public class FindMedianFromDataStreamTest {
    @Test
    public void test() {
    	FindMedianFromDataStream f = new FindMedianFromDataStream();
    	
    	f.addNum(1);
    	f.addNum(2);
    	Assert.assertEquals(1.5, f.findMedian(), 0);
    	
    	f.addNum(3);
    	Assert.assertEquals(2, f.findMedian(), 0);
    }
}
