package com.cpg.lab5.ex3;

public class PrintPrime {
	public void printNumbers(int num) {
		if(num==0 || num==1) {
			System.out.println("No prime numbers between it");
		}
		for(int indexNum=2;indexNum<=num;indexNum++) {
			int flag=0;
			for(int innerIndex=2;innerIndex<indexNum;innerIndex++) {
				if(indexNum%innerIndex==0) {
					flag=1;
				}
			}
			if(flag==0) {
				System.out.println(indexNum);
			}
		}
	}

}
