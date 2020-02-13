package com.cg.eis.pl;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeServ;

public class EmployeeUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeServ es1=new EmployeeServ();
		Employee s1=new Employee();
		s1.setId(1);
		s1.setName("Yogesh");
		s1.setSalary(18000);
		s1.setDesignation("System Associate");
		es1.addEmployee(s1);
		
		EmployeeServ es2=new EmployeeServ();
		Employee s2=new Employee();
		s2.setId(2);
		s2.setName("Souvik");
		s2.setSalary(22000);
		s2.setDesignation("Programmer");
		es2.addEmployee(s2);
		
		EmployeeServ es3=new EmployeeServ();
		Employee s3=new Employee();
		s3.setId(3);
		s3.setName("Anumay");
		s3.setSalary(41000);
		s3.setDesignation("Manager ");
		es3.addEmployee(s3);
		
		EmployeeServ es4=new EmployeeServ();
		Employee s4=new Employee();
		s4.setId(4);
		s4.setName("Ashok");
		s4.setSalary(4000);
		s4.setDesignation("Clerk");
		es4.addEmployee(s4);
		
		System.out.println(EmployeeServ.ls);
		
		EmployeeServ.displayEmployee();
		
		//es2.displayEmployee();

	}

}
