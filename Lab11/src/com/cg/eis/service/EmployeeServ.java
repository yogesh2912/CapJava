package com.cg.eis.service;

import java.util.ArrayList;
import java.util.List;

import com.cg.eis.bean.Employee;

public class EmployeeServ implements EmployeeService  {
	
	public static List<Employee> ls=new ArrayList<Employee>();
	
	@Override
	public void addEmployee(Employee e) {
		if(e.getSalary()>5000 && e.getSalary()<20000) {
			e.setInsuranceScheme("Scheme C");
		}
		else if(e.getSalary()>=20000 && e.getSalary()<40000) {
			e.setInsuranceScheme("Scheme B");
		}
		else if(e.getSalary()>=40000) {
			e.setInsuranceScheme("Scheme A");
		}
		else {
			e.setInsuranceScheme("No Scheme");
		}
		ls.add(e);
		
	}
	
	public static void displayEmployee() {
		for(Employee eee:ls) {
			System.out.println("Name is "+eee.getName()+" and his Insurance Scheme  is "+eee.getInsuranceScheme());
		}
		
	}

}
