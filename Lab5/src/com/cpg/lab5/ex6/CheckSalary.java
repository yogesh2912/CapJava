package com.cpg.lab5.ex6;

import com.cpg.lab5.exception.EmployeeException;

public class CheckSalary {
	public CheckSalary(int salary) throws EmployeeException{
		if(salary>3000) {
			System.out.println("Good Salary");
		}
		else {
			throw new EmployeeException("very less Salary");
		}
		
	}

}
