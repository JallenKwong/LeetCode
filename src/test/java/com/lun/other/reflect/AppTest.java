package com.lun.other.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

	@Test
	public void test() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		App app = new App();
		
		Method privateMethod = app.getClass().getDeclaredMethod("callPrivateMethod");
		privateMethod.setAccessible(true);
		
		Assert.assertEquals("Private method is called.", privateMethod.invoke(app));
	}
	
}
