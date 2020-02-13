package com.cpg.lab7.ex7;

import java.util.ArrayList;

public class StringReverseSortMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringReverseSort srs=new StringReverseSort();
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(45);
		al.add(14);
		al.add(61);
		al.add(86);
		al.add(53);
		
		System.out.println(srs.getSorted(al)); 

	}

}
