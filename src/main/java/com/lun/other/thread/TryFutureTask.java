package com.lun.other.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class TryFutureTask {
	
	public static void main(String[] args) {
		ExecutorService executor = Executors.newSingleThreadExecutor();   
		FutureTask<String> futureTask =   
		       new FutureTask<String>(new Callable<String>() {

				@Override
				public String call() throws Exception {
					
					return "Hello, FutureTask";
				}
			});   
		executor.execute(futureTask);   
		
		//在这里可以做别的任何事情   
		try {   
		    String result = futureTask.get(5000, TimeUnit.MILLISECONDS); //取得结果，同时设置超时执行时间为5秒。同样可以用future.get()，不设置执行超时时间取得结果
		    
		    System.out.println(result);
		} catch (InterruptedException e) {   
		    futureTask.cancel(true);   
		} catch (ExecutionException e) {   
		    futureTask.cancel(true);   
		} catch (TimeoutException e) {   
		    futureTask.cancel(true);   
		} finally {   
		    executor.shutdown();   
		} 
	}
	
}
