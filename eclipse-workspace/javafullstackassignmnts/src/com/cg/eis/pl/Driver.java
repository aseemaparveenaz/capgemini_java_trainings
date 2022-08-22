package com.cg.eis.pl;
import java.util.*;
import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeServiceImpl;
public class Driver extends EmployeeServiceImpl {
		public static void main(String[] args)  
		{	 
		EmployeeServiceImpl i = new EmployeeServiceImpl(); 
		Employee emp1=new Employee("aseema",123,6000.00,"System Associate"); 
		Map<String,Employee> mp=new HashMap<String,Employee>(); 
		mp.put("EMP1",emp1); 
		Set<Map.Entry<String,Employee>> set=mp.entrySet(); 
		for(Map.Entry<String,Employee> me:set) 
		{ 
		System.out.print(me.getKey()+":"); 
		System.out.println(me.getValue().getName()); 
		System.out.println("---YOUR INSURANCE SCHEME IS------"); 
		i.eservice((HashMap<String, Employee>) mp); 
		} 
		System.out.println(); 
}
}



