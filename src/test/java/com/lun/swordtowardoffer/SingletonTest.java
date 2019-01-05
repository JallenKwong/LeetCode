package com.lun.swordtowardoffer;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lun.swordtowardoffer.Singleton.*;
import com.lun.swordtowardoffer.Singleton.SomeThing;

public class SingletonTest {

	@Test
	public void test() {
		
		//1.饿汉式（立即加载方式）（线性安全）
		assertEquals(Singleton1.getInstance(), Singleton1.getInstance());
		
		//2.懒汉式（延迟加载方式）（线性不安全）
		assertEquals(Singleton2.getInstance(), Singleton2.getInstance());
		
		//3.懒汉式（延迟加载方式）（线性安全）
		assertEquals(Singleton3.getInstance(), Singleton3.getInstance());
		
		//4.双检锁Double-checked locking（线性安全）
		assertEquals(Singleton4.getInstance(), Singleton4.getInstance());

		//5.登记式/静态内部类（线性安全）
		assertEquals(Singleton5.getInstance(), Singleton5.getInstance());
		
		//6.枚举
		assertEquals(SomeThing.INSTANCE.getInstance(), SomeThing.INSTANCE.getInstance());;
	}

}
