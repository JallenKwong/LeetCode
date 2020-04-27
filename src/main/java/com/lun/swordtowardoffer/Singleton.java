package com.lun.swordtowardoffer;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Singleton {
	
	//1.饿汉式（立即加载方式）（线性安全）
	public static class Singleton1 {
		// 私有构造
		private Singleton1() {
		}
	
		private static Singleton1 instance = new Singleton1();
	
		// 静态工厂方法
		public static Singleton1 getInstance() {
			return instance;
		}
	}
	
	//2.懒汉式（延迟加载方式）（线性不安全）
	public static class Singleton2 {
		
		// 私有构造
		private Singleton2() {
		}
	
		private static Singleton2 instance = null;
	
		public static Singleton2 getInstance() {
			if (instance == null) {
				instance = new Singleton2();
			}
			return instance;
		}
	}
	
	//3.懒汉式（延迟加载方式）（线性安全）
	public static class Singleton3 {
		private static Singleton3 instance;
	
		private Singleton3() {
		}
	
		public static synchronized Singleton3 getInstance() {
			if (instance == null) {
				instance = new Singleton3();
			}
			return instance;
		}
	}
	
	//4.双检锁Double-checked locking（线性安全）
	public static class Singleton4 {
		private volatile static Singleton4 singleton;
	
		private Singleton4() {
		}
	
		public static Singleton4 getInstance() {
			if (singleton == null) {
				synchronized (Singleton.class) {
					if (singleton == null) {
						singleton = new Singleton4();
					}
				}
			}
			return singleton;
		}
	}
	
	//5.登记式/静态内部类（线性安全）
	public static class Singleton5 {
		private static class SingletonHolder {
			private static final Singleton5 INSTANCE = new Singleton5();
		}
	
		private Singleton5() {
		}
	
		public static final Singleton5 getInstance() {
			return SingletonHolder.INSTANCE;
		}
	}
	
	//6.枚举
	public enum Singleton6 {
		INSTANCE;
		
		public void hello() {
			
		}
		
		/*
		private Resource instance;
	
		class Resource {
		}
		
		Singleton6() {
			instance = new Resource();
		}
	
		public Resource getInstance() {
			return instance;
		}
		*/
	}
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Constructor con = Singleton6.class.getDeclaredConstructor();
		//设置为可访问
		con.setAccessible(true);
		//构造两个不同的对象
		Singleton6 singleton1 = (Singleton6)con.newInstance();
		Singleton6 singleton2 = (Singleton6)con.newInstance();
		//验证是否是不同对象
		System.out.println(singleton1.equals(singleton2));
		
		
	}
	
}
