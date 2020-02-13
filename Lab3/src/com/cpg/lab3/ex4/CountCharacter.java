package com.cpg.lab3.ex4;

import java.util.HashMap;

public class CountCharacter {
	
	public void countNumberOfCharacter(char [] ch,HashMap<Character,Integer> hp) {
		for(char c:ch) {
			if(hp.containsKey(c)) {
				hp.put(c,hp.get(c)+1);
			}
			else {
				hp.put(c,1);
			}
		}
	}

}
