package com.cpg.lab10.ex2;

public class StringModiMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringModi sm;
		sm=(str)->{
			StringBuilder ss=new StringBuilder("");
			int strLen=str.length();
			ss.append(str.charAt(0));
			for(int strIndex=1;strIndex<strLen;strIndex++) {
				if((str.charAt(strIndex)>'a' && str.charAt(strIndex)<'z') || (str.charAt(strIndex)>'A' && str.charAt(strIndex)<'Z')) {
					ss.append(" ");
					ss.append(str.charAt(strIndex));
				}
			}
			//String ret=ss.toString();
			return ss.toString();
		};
		
		System.out.println(sm.modiString("hey bruh"));
		

	}

}
