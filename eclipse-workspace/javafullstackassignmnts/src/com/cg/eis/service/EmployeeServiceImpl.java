package com.cg.eis.service;

import java.util.HashMap;

import com.cg.eis.bean.Employee;


public class EmployeeServiceImpl implements EmployeeService 
{

	@Override
	public void eservice(HashMap<String,Employee> mp) {
		if((Employee.getSalary()>5000 && Employee.getSalary()<20000) && Employee.getDesignation()=="System Associate")
		{
			System.out.println(Employee.getName()+" : Your Insurance Scheme is ->Insurance Scheme C");
		}
		else if(Employee.getSalary()>=20000 && Employee.getSalary()<40000 && Employee.getDesignation()=="Programmer")
		{
			System.out.println(Employee.getName()+" : Your Insurance Scheme is ->Insurance Scheme B");
		}
		else if(Employee.getSalary()>=40000 && Employee.getDesignation() =="Programmer")
		{
			System.out.println(Employee.getName()+" : Your Insurance Scheme is ->Insurance Scheme A");
		}
		else if(Employee.getSalary()<5000 && Employee.getDesignation()=="Clerk")
		{
			System.out.println(Employee.getName()+" : Your have No Insurance Scheme");
		}
		else
		{
			System.out.println("Invalid");
		}
		
	}	
}

	

