package com.cpg.lab7.ex8;

import java.util.TreeSet;

import java.util.ArrayList;

import java.util.Collections;

import java.util.Iterator;

import java.util.ListIterator;


public class RemoveDuplicate {
	public TreeSet<Integer> modifyArray(ArrayList<Integer> al) {
		TreeSet<Integer> ts=new TreeSet<Integer>(al);
		/*for(Integer i:al) {
			ts.add(i);
		}*/
		
		//System.out.println(ts);
		
		//Collections.sort(ts);
		
		TreeSet<Integer> newts=(TreeSet<Integer>)ts.descendingSet();
		Iterator litr=newts.iterator();
		 while(litr.hasNext()){
		       System.out.print(litr.next()+" ");
		    }
		//System.out.println(ts);
		
		
		return newts;
	}
}
