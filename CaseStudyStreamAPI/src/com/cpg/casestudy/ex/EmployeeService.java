package com.cpg.casestudy.ex;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.ArrayList;

import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Map;

public class EmployeeService {
	public void func(ArrayList<Employee> al) {
		List<Double > salary =new ArrayList<Double>();
		
		for(Employee ee:al){
			salary.add(ee.getSalary());
		}
		Optional<Double> result=salary.stream().reduce((a,b)->a+b);
		
		if(result.isPresent()) {
			System.out.println("Sum of salary of employers is "+result.get());
		}
		
		//List<>
		Employee emp=al.get(0);
		System.out.println("DEKD "+emp.getEmail());
		
		//al.stream().map(e1.ge)
		List<String> sec=new ArrayList<String>();
		for(Employee ee:al) {
			sec.add(ee.getDepartmentName());
		}
		System.out.println(sec);
		
		//Map<String,Integer> mapp=sec.stream().collect(Collectors.toConcurrentMap(s->s, s->1,(s1,s2)->(s1+s2)));
		
		
		Map<String, Integer> mapp=al.stream().collect(Collectors.toConcurrentMap(s->s.getDepartmentName(),
			 s->1,(s1,s2)->(s1+s2)));
		 
		 System.out.println(mapp);
		 
		 Map<String,Employee> ma=al.stream().collect(Collectors.toConcurrentMap(e->e.getDepartmentName(),
				 e->e,BinaryOperator.maxBy(Comparator.comparingDouble(e->e.getSalary()))));
		 
		 System.out.println(ma);
		 
		 System.out.println("CSE ka top Salary "+ma.get("CSE").getFirstName());
		 
		 
	}
}
