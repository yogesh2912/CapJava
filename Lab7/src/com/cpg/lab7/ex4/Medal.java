package com.cpg.lab7.ex4;

import java.util.HashMap;

public class Medal {
	public HashMap<Integer,String> getStudents(HashMap<Integer,Integer> hp) {
		HashMap<Integer,String> re=new HashMap<Integer,String>();
		
		for(Integer roll:hp.keySet()) {
			if(hp.get(roll)>=90) {
				re.put(roll,"gold");
			}
			else if(hp.get(roll)>=80 && hp.get(roll)<90) {
				re.put(roll,"silver");
			}
			else if(hp.get(roll)>=70 && hp.get(roll)<80) {
				re.put(roll,"bronze");
			}
			else {
				re.put(roll,"kuch nhi");
			}
		}
		return re;
	}

}
