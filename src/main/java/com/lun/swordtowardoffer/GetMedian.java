package com.lun.swordtowardoffer;


import com.lun.hard.FindMedianFromDataStream;

public class GetMedian {
	
	private FindMedianFromDataStream fs;
	
	public GetMedian() {
		fs = new FindMedianFromDataStream();
	}
	
	public void addNum(int num) {
		fs.addNum(num);
	}
	
	public double findMedian() {
		return fs.findMedian();
	}
	
}
