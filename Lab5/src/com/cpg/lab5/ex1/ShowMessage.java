package com.cpg.lab5.ex1;

public class ShowMessage {
	public void showResult(int num)
	{
		switch(num) {
		 default:
			 System.out.println("not a valid option choosen");
		 case 1:
			 System.out.println("stop");
			 break;
		 case 2:
			 System.out.println("ready");
			 break;
		 case 3:
			 System.out.println("go");
			 break;
		}
	}
}
