package com.cpg.lab5.ex3;
import java.util.Scanner;

public class PrintPrimeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintPrime pp=new PrintPrime();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		pp.printNumbers(num);
		

	}

}
