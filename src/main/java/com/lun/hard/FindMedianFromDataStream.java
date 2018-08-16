package com.lun.hard;

import java.util.Collections;
import java.util.PriorityQueue;


public class FindMedianFromDataStream {
	
    PriorityQueue<Integer> minPQ; // bigger half poll minimum
    PriorityQueue<Integer> maxPQ; // smaller half poll maximum
	
	public FindMedianFromDataStream() {
        minPQ = new PriorityQueue<>();
        maxPQ = new PriorityQueue<>(Collections.reverseOrder());
	}
		
    public void addNum(int num) {
        maxPQ.add(num);
        minPQ.add(maxPQ.poll());
        if (maxPQ.size() < minPQ.size()) {
            maxPQ.add(minPQ.poll());
        }
    }
    
    public double findMedian() {
        if (minPQ.size() == maxPQ.size()) {
            return (minPQ.peek() + maxPQ.peek()) / 2.0;
        }
        return maxPQ.peek();
    }
    
}
