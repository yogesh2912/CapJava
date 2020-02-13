package com.cpg.lab6.ex3;

public class StringImage {
	public String getImage(String str) {
		StringBuilder sb=new StringBuilder(str);
		//StringBuilder sbn=sb.reverse();
		return sb+"|"+sb.reverse();
		
		
	}

}
