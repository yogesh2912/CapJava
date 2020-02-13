package com.cpg.lab7.ex4;

import java.util.HashMap;

public class MedalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,Integer> hp=new HashMap<Integer,Integer>();
		hp.put(11602463,56);
		hp.put(11604480,95);
		hp.put(11604479,85);
		Medal m=new Medal();
		System.out.println(m.getStudents(hp));  

	}

}
