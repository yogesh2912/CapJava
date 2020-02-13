package com.cpg.casestudy.ex;

import java.util.ArrayList;

public class EmployeeRepository {
	
	//Employee e1=new Employee();
	public static void main(String [] args) {
		ArrayList<Employee> al=new ArrayList<Employee>();
		
		Employee e1=new Employee();
		e1.setEmployeeId(1);
		e1.setFirstName("yogesh");
		e1.setLastName("Upadhyay");
		e1.setEmail("yogeshupadhyay96@gmail.com");
		e1.setPhoneNumber("9878242255");
		e1.setDesignation("Teacher");
		e1.setSalary(5000.0);
		e1.setManagerId(100);
		e1.setDepartmentId(11);
		e1.setDepartmentName("CSE");
		
		al.add(e1);
		

		Employee e2=new Employee();
		e2.setEmployeeId(2);
		e2.setFirstName("svk");
		e2.setLastName("Debroy");
		e2.setEmail("souvikdebroy96@gmail.com");
		e2.setPhoneNumber("9436888075");
		e2.setDesignation("HOD");
		e2.setSalary(10000.0);
		e2.setManagerId(100);
		e2.setDepartmentId(11);
		e2.setDepartmentName("CSE");
		
		al.add(e2);
		
		Employee e3=new Employee();
		e3.setEmployeeId(3);
		e3.setFirstName("anu");
		e3.setLastName("sah");
		e3.setEmail("anusah96@gmail.com");
		e3.setPhoneNumber("8847553354");
		e3.setDesignation("Dr");
		e3.setSalary(100000.0);
		e3.setManagerId(101);
		e3.setDepartmentId(12);
		e3.setDepartmentName("Med");
		
		al.add(e3);
		
		//System.out.println(al.get(1).);
		
		EmployeeService es=new EmployeeService();
		es.func(al);
}
	
	
	
	

}
