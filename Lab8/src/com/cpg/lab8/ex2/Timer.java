package com.cpg.lab8.ex2;

public class Timer implements Runnable{
	Thread t;
	Timer(){
		t=new Thread(this,"timer");
		t.start();
	}
	
	public void run() {
		System.out.println("Strat");
		int i=10;
		int co=0;
		while(co<3) {
		try {
			Thread.sleep(10000);
			System.out.println(i+" sec passed");
			i=i+10;
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		co++;
		}
	}

}
