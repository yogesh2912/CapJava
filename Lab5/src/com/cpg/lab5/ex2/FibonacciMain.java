package com.cpg.lab5.ex2;

import java.util.Scanner;

public class FibonacciMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci ff=new Fibonacci();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Nth term");
		int num=sc.nextInt();
		
		System.out.println("The normal solution is "+ff.nornalFibonacci(num));
		System.out.println("The recursive solution is "+ff.recursionFibonacci(num));

	}

}
