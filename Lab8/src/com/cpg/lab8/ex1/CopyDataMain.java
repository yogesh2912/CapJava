package com.cpg.lab8.ex1;

public class CopyDataMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread());
		CopyDataThread cd=new CopyDataThread();
		try {
			cd.join();
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("Main finish");

	}

	
}
