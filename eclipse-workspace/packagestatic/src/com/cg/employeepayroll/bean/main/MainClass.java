package com.cg.employeepayroll.bean.main;

import com.cg.employeepayroll.EmployeePayroll;


	public class MainClass {



		public static void main(String[] args) {





		EmployeePayroll emp = new EmployeePayroll(101,"sri","raj",10);
		EmployeePayroll emp1 = new EmployeePayroll(102,"ramesh","sundar",20);

		System.out.println(emp1.getEmployeeId());
		System.out.println(emp1.getLastName());

		// EmployeePayroll.setCOUNTER(12);
		System.out.println(EmployeePayroll.getCOUNTER()+ EmployeePayroll.a);

		System.out.println(EmployeePayroll.getCOUNTER());



		}



		}


