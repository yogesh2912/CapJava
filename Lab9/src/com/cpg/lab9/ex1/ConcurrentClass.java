package com.cpg.lab9.ex1;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ConcurrentClass {
	
	
	
	public ConcurrentClass() {
		Executor executor=Executors.newSingleThreadExecutor();
		Runnable task=()->System.out.println("Hi from Runnable");
		executor.execute(task);
		
		
		ExecutorService executor1=Executors.newSingleThreadExecutor();
		
		
		
		Callable<String> task1=()->System.out.println("Hi from callable");
		
		Future<String> future=executor1.submit(task1);
		
		//String result=future.get();
		
		//System.out.println(result);
		
		
		
	}
	


}
