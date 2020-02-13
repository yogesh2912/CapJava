package com.cpg.lab3.ex3;

public class ArraySortMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arry= {15,53,63,11,123};
		ArraySort as=new ArraySort();
		
		int [] newArry=as.getSorted(arry);
		for(int num : newArry) {
			System.out.println(num);
		}
		

	}

}
