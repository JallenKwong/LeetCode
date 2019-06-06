package com.lun.other.clone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CloneUtil {
	@SuppressWarnings("unchecked")
	public static <T> T clone(T t) throws Exception {
	    //Check if T is instance of Serializeble other throw CloneNotSupportedException
	    ByteArrayOutputStream bos = new ByteArrayOutputStream();
	    ObjectOutputStream out = new ObjectOutputStream(bos);
	    //Serialize it
	    //serializeToOutputStream(t, bos);
	    
	    out.writeObject(t);
	    
	    out.close();
	    bos.close();
	    
	    byte[] bytes = bos.toByteArray();
	    ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(bytes));
	 
	    //Deserialize it and return the new instance
	    return (T)ois.readObject();
	}
	
	public static void main(String[] args) throws Exception {
		Department d = new Department(1, "hello");
		Department clone = clone(d);
		
		System.out.println(clone);
		
	}
	
}
