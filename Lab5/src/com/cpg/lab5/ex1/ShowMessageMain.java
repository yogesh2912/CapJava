package com.cpg.lab5.ex1;

import java.util.Scanner;
public class ShowMessageMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Choice");
		System.out.println("1.Red");
		System.out.println("2.Yellow");
		System.out.println("3.Green");
		
		int choose=sc.nextInt();
		
		ShowMessage sm=new ShowMessage();
		sm.showResult(choose);

	}

}
