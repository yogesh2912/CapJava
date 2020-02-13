package com.cpg.lab7.ex6;

import java.util.HashMap;
		
public class EligibleVotersMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> hp=new HashMap<Integer,Integer>();
		hp.put(11602463,22);
		hp.put(11604480,23);
		hp.put(11604479,17);
		
		EligibleVoters ev=new EligibleVoters();
		System.out.println(ev.votersList(hp));
		

	}

}
