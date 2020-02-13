package com.cpg.lab5.ex5;

import com.cpg.lab5.exception.InvalidAgeException;

public class ValidateAgeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ValidateAge e1=new ValidateAge(16);
			ValidateAge e2=new ValidateAge(12);
		}
		catch(InvalidAgeException e) {
			System.out.println(e);
		}

	}

}
