package com.cpg.lab7.ex7;

import java.util.ArrayList;

//import java.util.Collection;

import java.util.Collections;

public class StringReverseSort {
	public ArrayList<Integer> getSorted(ArrayList<Integer> al) {
		ArrayList<Integer> newal=new ArrayList<Integer>();
		for(Integer i:al) {
			String str=Integer.toString(i); // String.valueOf(i);
			
			StringBuilder s=new StringBuilder(str);
			s.reverse();
			
			//System.out.println(s);
			
			Integer a=Integer.valueOf(s.toString());
			
			newal.add(a);
		}	
		Collections.sort(newal);
		//String sss=String.valueOf(5666.3);
		//System.out.println(sss);
		//
		//System.out.println(newal);
		return newal;
	}

}
