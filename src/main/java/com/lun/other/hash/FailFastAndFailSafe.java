package com.lun.other.hash;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastAndFailSafe {

	public static void main(String[] args) {
	    List<Integer> list = new ArrayList<>();
	    for(int i = 0; i < 20; i++){
	        list.add(i);
	    }
	    Iterator<Integer> it = list.iterator();
	    int temp = 0;
	    while(it.hasNext()){
	        if(temp == 3){
	            temp++;
	            list.remove(3);
	        }else{
	            temp++;
	            System.out.println(it.next());
	        }
	    }		
	}

}
