package com.lun.easy;

public class LengthOfLastWord {
    public int lengthOfLastWord1(String s) {
        String[] array = s.split(" ");
        return array.length > 0 ? array[array.length - 1].length() : 0;
    }
    
    public int lengthOfLastWord2(String s) {
    	String temp = s.trim();
        return temp.length() - temp.lastIndexOf(" ") - 1;
    }
}
