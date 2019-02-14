package com.lun.other.jvm.c07;

public class DeadLoopClass {
	static class DeadLoopClass2 {
		static {
			// 如果不加上这个if语句，编译器将提示“Initializer does not complete normally”并拒绝编译
			if (true) {
				System.out.println(Thread.currentThread() + "init DeadLoopClass");
				while (true) {
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Runnable script = new Runnable() {
			public void run() {
				System.out.println(Thread.currentThread() + "start");
				DeadLoopClass2 dlc = new DeadLoopClass2();
				System.out.println(Thread.currentThread() + " run over");
			}
		};

		Thread thread1 = new Thread(script);
		Thread thread2 = new Thread(script);
		thread1.start();
		thread2.start();
	}
}
