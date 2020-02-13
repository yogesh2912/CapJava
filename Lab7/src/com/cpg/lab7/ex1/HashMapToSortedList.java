package com.cpg.lab7.ex1;

import java.util.Collections;

import java.util.Collection;

import java.util.List;

import java.util.ArrayList;

//import java.awt.List;

import java.util.HashMap;

public class HashMapToSortedList {
	public ArrayList<Integer> getValues(HashMap<Integer,Integer> hp) {
		
	Collection<Integer> c=hp.values();	
		
		ArrayList <Integer> values =new ArrayList(c);
		
		Collections.sort(values);
		
		return values;
		
	}

}
