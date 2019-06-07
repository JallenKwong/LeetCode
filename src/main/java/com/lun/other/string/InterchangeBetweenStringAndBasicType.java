package com.lun.other.string;

import java.io.UnsupportedEncodingException;

public class InterchangeBetweenStringAndBasicType {
	
	public static void main(String[] args) {
		int a = Integer.parseInt("73");
		Integer b = Integer.valueOf("73");
	
		String s1 = "" + 1;
		String s2 = String.valueOf(1);
		
		String s3 = "你好";
		
		try {
			String s4 = new String(s3.getBytes("UTF-16"), "utf-32");
			System.out.println(s4);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		
		//--------
		
		int i = 0xB0AE;//爱的GBK编码
		
		byte[] ba = new byte[2];
		
		ba[1] = (byte)i;
		ba[0] = (byte)(i >>> 8);
		
		try {
			
			String love = new String(ba, "GBK");
			System.out.println(love);
			
			
			System.out.println(new String(love.getBytes(), "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
