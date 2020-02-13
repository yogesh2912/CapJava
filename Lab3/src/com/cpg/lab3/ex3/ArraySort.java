package com.cpg.lab3.ex3;

import java.util.Arrays;

public class ArraySort {
	
	public int [] getSorted(int [] arr) {
		for(int index=0;index<arr.length;index++) {
			int a=arr[index];
			int num=0;
			while(a>0) {
				int digit=a%10;
				num=num*10+digit;
				a=a/10;
			}
			arr[index]=num;
		}
		Arrays.sort(arr);
		return arr;
		
	}

}
