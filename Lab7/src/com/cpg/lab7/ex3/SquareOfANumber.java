package com.cpg.lab7.ex3;

import java.util.ArrayList;

import java.util.HashMap;

public class SquareOfANumber {
	public HashMap<Integer,Integer> getSquares(ArrayList<Integer> al) {
		//System.out.println("");
		HashMap<Integer,Integer> hp=new HashMap<Integer,Integer>();
		for(Integer a:al) {
			hp.put(a,a*a);
		}
		return hp;
	}

}
