package com.cpg.lab6.ex1;

import java.util.StringTokenizer;

public class StringTokenizer1 {
	
	public StringTokenizer1(String s){
		StringTokenizer st=new StringTokenizer(s," ");
		int sum=0;
		while(st.hasMoreTokens()) {
			int num=Integer.parseInt(st.nextToken());
			sum=sum+num;
			System.out.println(num);
		}
		System.out.println("The sum of numbers are "+sum);
	}
	
	

}
