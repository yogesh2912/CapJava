package com.cpg.lab5.ex4;

import com.cpg.lab5.exception.InvalidNameException;



public class NameValidateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			NameValidate d1=new NameValidate();
		}
		catch(InvalidNameException v) {
			System.out.println(v);
		}
		NameValidate d2=new NameValidate("yogesh");
		
		NameValidate d3=new NameValidate("yogesh","upadhyay");

	}

}
