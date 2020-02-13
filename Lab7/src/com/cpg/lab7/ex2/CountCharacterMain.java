package com.cpg.lab7.ex2;

import java.util.HashMap;



public class CountCharacterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char [] ch= {'y','o','g','e','s','h','a','e','i','o','u'};
		HashMap<Character,Integer> hp=new HashMap<Character,Integer>();
		
		CountCharacter cc=new CountCharacter();
		cc.countNumberOfCharacter(ch,hp);
		
		System.out.println(hp);

	}

}
