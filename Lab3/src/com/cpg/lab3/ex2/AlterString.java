package com.cpg.lab3.ex2;

import java.util.Arrays;

public class AlterString {
	public String [] changeString(String [] name) {
		Arrays.sort(name);
		
		int lenName=name.length;
		if(lenName%2==0) {
			for(int indexName=0;indexName<(lenName/2);indexName++) {
				name[indexName]=name[indexName].toUpperCase();
			}
		}
		else {
			for(int indexName=0;indexName<(lenName/2)+1;indexName++) {
				name[indexName]=name[indexName].toUpperCase();
			}
		}
		
		return name;
	}

}
