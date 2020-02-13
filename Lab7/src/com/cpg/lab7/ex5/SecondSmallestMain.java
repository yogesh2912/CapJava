package com.cpg.lab7.ex5;

import java.util.ArrayList;

public class SecondSmallestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(2);
		al.add(5);
		al.add(9);
		al.add(8);
		SecondSmallest ss=new SecondSmallest();
		System.out.println(ss.getSecondSmallest(al));

	}

}
