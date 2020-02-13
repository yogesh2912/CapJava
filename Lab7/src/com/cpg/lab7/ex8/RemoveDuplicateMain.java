package com.cpg.lab7.ex8;

import java.util.ArrayList;


public class RemoveDuplicateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer>al=new ArrayList<Integer>();
		al.add(10);
		al.add(54);
		al.add(55);
		al.add(15);
		al.add(25);
		al.add(81);
		al.add(63);
		al.add(10);
		al.add(54);
		al.add(10);
		al.add(55);
		al.add(10);
		RemoveDuplicate rd=new RemoveDuplicate();
		System.out.println(rd.modifyArray(al));

	}

}
