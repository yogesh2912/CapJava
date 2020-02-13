package com.cpg.lab7.ex5;

import java.util.Collections;

import java.util.ArrayList;

public class SecondSmallest {
	public int getSecondSmallest(ArrayList<Integer> al) {
		Collections.sort(al);
		
		
		
		return al.get(1);
	}

}
