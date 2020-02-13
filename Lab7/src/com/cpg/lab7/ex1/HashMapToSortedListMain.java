package com.cpg.lab7.ex1;

import java.util.HashMap;

//import java.util.List;

import java.util.Collections;

import java.util.ArrayList;

public class HashMapToSortedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> hp=new HashMap<Integer,Integer>();
		hp.put(1,11);
		hp.put(5,55);
		hp.put(3,33);
		hp.put(2,22);
		hp.put(8,88);
		
		HashMapToSortedList hl=new HashMapToSortedList();
		ArrayList <Integer>coll=hl.getValues(hp);
		System.out.println(coll);
		

	}

}
