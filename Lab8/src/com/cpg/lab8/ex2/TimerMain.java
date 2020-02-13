package com.cpg.lab8.ex2;

public class TimerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Timer tt=new Timer();
		try {
			tt.t.join();
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("Main exit");

	}

}
