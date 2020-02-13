package com.cpg.lab5.ex6;

import com.cpg.lab5.exception.EmployeeException;

public class CheckSalaryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			CheckSalary cs=new CheckSalary(5001);
		}
		catch(EmployeeException ee) {
			System.out.println(ee);
		}
		
		try {
			CheckSalary cs=new CheckSalary(500);
		}
		catch(EmployeeException ee) {
			System.out.println(ee);
		}
		
		

	}

}
