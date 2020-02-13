package com.cpg.lab7.ex6;

import java.util.HashMap;

import java.util.ArrayList;

public class EligibleVoters {
	public ArrayList<Integer> votersList(HashMap<Integer,Integer> hp) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(Integer reg:hp.keySet()) {
			if(hp.get(reg)>18) {
				al.add(reg);
			}
			else {
				System.out.println("Sorry "+reg+" you are not eligible");
			}
		}
		return al;
	}

}
