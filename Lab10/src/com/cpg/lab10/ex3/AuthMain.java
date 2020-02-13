package com.cpg.lab10.ex3;

public class AuthMain {
	
	
	public static void main(String[] args) {
		Auth aa=(a,b)-> {
			String username="yogesh";
			String password="upadhyay";
			return (a.equals(username) && b.equals(password));
		};
		
		System.out.println(aa.validate("yogesh" ,"upadhyay"));
	}
	
}
