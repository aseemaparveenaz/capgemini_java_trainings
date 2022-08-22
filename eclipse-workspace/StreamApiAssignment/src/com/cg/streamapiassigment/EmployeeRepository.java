package com.cg.streamapiassigment;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class EmployeeRepository {
	private static List<Employee> empList;
	private static List<Department> deptList;
	//department list
	static {
		prepareDeptList();
	}
	private static void prepareDeptList() {
		
		deptList=new ArrayList<Department>();
		deptList.add(new Department(10,"Administration",101));
		deptList.add(new Department(20,"Production",201));
		deptList.add(new Department(30,"Sales",301));
		deptList.add(new Department(40,"Finance",401));
		deptList.add(new Department(50,"Customer Support",501));
		
	}
	//employee list	
	static {
		prepareEmpList();
	}
	private static void prepareEmpList() {
		empList = new ArrayList<Employee>();

		empList.add(new Employee(1,"Shruth","radha","ss@abc","9876543210",LocalDate.of(2010, 8, 10),"Analyst",20000.00,101,deptList.get(0)));
		empList.add(new Employee(2,"aseema","az","pr@abc","9821543890",LocalDate.of(2021, 8, 21),"Consultant",25000.00,201,deptList.get(0)));
		empList.add(new Employee(3,"priya","dharshini","rn@abc","8886543210",LocalDate.of(2020, 9, 10),"Analyst",20000.00,101,deptList.get(1)));
		empList.add(new Employee(4,"saundarya","K","vk@abc","9555543211",LocalDate.of(2021, 10, 02),"System Engineer",40000.00,301,deptList.get(2)));
		empList.add(new Employee(5,"aswini","P","ap@abc","9899999050",LocalDate.of(2015, 8, 15),"Consultant",25000.00,201,deptList.get(1)));
		empList.add(new Employee(6,"zakiya","S","as@abc","6688943210",LocalDate.of(2019, 10, 25),"Analyst",18000.00,401,deptList.get(3)));
		empList.add(new Employee(7,"haseena", "Whale", "jw@abc", "8521479635", LocalDate.of(2007,9,17),"Admin Assistant", 44400,101, null));
		empList.add(new Employee(8, "madhumitha", "Duck", "dd@abc", "6505079833", LocalDate.of(2009, 6,21),"Clerk", 26000,201,null));
	
	}
	
	public static List<Employee> getEmpList() {
		return empList;
	}
	public static List<Department> getDeptList() {
		return deptList;
	}

}

