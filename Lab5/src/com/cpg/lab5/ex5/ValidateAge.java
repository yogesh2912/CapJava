package com.cpg.lab5.ex5;

import com.cpg.lab5.exception.InvalidAgeException;

public class ValidateAge  {
	public ValidateAge(int age) throws InvalidAgeException{
	if(age<15) {
		throw new InvalidAgeException("AGe should be above 15");
	}
	else {
		System.out.println("Valid Age");
	}
	}

}
