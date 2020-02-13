package com.cpg.lab4.ex1;

public class SumOfCubes {
	public void digitCubes(int num) {
		int sum=0;
		while(num>0) {
			int lastDigit=num%10;
			sum=sum+(lastDigit*lastDigit*lastDigit);
			num=num/10;
		}
		System.out.println(sum);
	}

}
