package com.cpg.lab6.ex4;

public class AlterString {
	
	public AlterString(String str) {
		char ch[]=str.toCharArray();
		for(int indexCh=0;indexCh<str.length();indexCh++) {
			if(ch[indexCh]=='a' || ch[indexCh]=='e' ||  ch[indexCh]=='i' ||  ch[indexCh]=='o' || ch[indexCh]=='u' || ch[indexCh]=='A' || ch[indexCh]=='E' || ch[indexCh]=='I' || ch[indexCh]=='O' || ch[indexCh]=='U') {
				
			}
			else {
				ch[indexCh]=(char)(ch[indexCh]+1);
			}
		}
		System.out.println( new String(ch));
	}

}
