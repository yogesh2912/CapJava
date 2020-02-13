package com.cpg.lab5.ex4;


import com.cpg.lab5.exception.InvalidNameException;
public class NameValidate {
	String fname;
	String lname;
	
	public NameValidate() throws InvalidNameException{
			//ValidateName v=new ValidateName();
			throw new InvalidNameException("You need to supply both the first and the last name");
	}
	public NameValidate(String fname) {
		try {
			throw new InvalidNameException("You need to supply the last name");
		}
		catch(InvalidNameException v) {
			System.out.println(v);
		}
		finally {
			System.out.println("Error h");
		}
		
	}
	public NameValidate(String fname,String lname) {
		System.out.println("Gooood "+fname+" "+lname);
	}

}
