package com.lun.other.clazz;

public class AnonymousInnerClazz {
	
	private Integer temp = 1;
	
	//匿名类实现
	Runnable r = new Runnable() {

		@Override
		public void run() {
			temp = 2;
		}
		
	};
	
	
	
	public static void main(String[] args) {
		

		
		
		//匿名类继承
		new Object() {
			
			@Override
			public boolean equals(Object o) {
				return true;
			}
			
			
		};
		
	}
}
