package com.cpg.lab5.ex2;

public class Fibonacci {
	public int nornalFibonacci(int num) {
		int arr[]=new int[num];
		arr[0]=1;
		arr[1]=1;
		
		for(int indexArr=2;indexArr<num;indexArr++) {
			arr[indexArr]=arr[indexArr-1]+arr[indexArr-2];
		}
		return arr[num-1];
	}
	public int recursionFibonacci(int num) {
		if(num==1)
			return 1;
		if(num==2)
			return 1;
		return recursionFibonacci(num-2)+recursionFibonacci(num-1);
		//System.out.println("recursion");
	}
}
