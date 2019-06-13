package com.lun.other.exception;

/**
 * 
 * 栈溢出示例
 * 
 * @author 白居布衣
 *
 */
public class ErrorPractise {

	public static void main(String[] args) {
		
		//例1
		//main(null);
		
		//例2
		System.out.println(new ErrorPractise());
		
	}

	@Override
	public String toString() {
		return "" + this;
	}
	
}
