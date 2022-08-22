package com.cg.streamapiassigment;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeServices {

	//Sum of salary of all employees
	public static Double sumOfSalaries() {
		List<Employee> empList = EmployeeRepository.getEmpList();
		Optional<Double> optional = empList.stream().map((e) -> e.getSalary()).reduce((a, b) -> a + b);

		if (optional.isPresent()) {
			return optional.get();
		} else {
			return 0.0;
		}
	}

	//Department names and count of employees in each department 
	public static void deptNameWithEmp() {
		List<Employee> employeeList = EmployeeRepository.getEmpList();
		Map<String, Long> employeeCountByDepartment = employeeList.stream().filter((emp) -> emp.getDepartment() != null)
				.collect(
						Collectors.groupingBy(dept -> dept.getDepartment().getDepartmentName(), Collectors.counting()));

		System.out.println(employeeCountByDepartment);
	}

	
	//Employees without department
	public static void empWithoutDept() {
		List<Employee> elist = EmployeeRepository.getEmpList();
		elist.stream().filter(e1 -> e1.getDepartment() == null).collect(Collectors.toList())
				.forEach(System.out::println);
	}

	//Department without employees
	public static void depWithoutEmp() {
		List<Department> dlist = EmployeeRepository.getDeptList();
		dlist.stream().filter(d -> d.getDepartmentName() == null).collect(Collectors.toList())
				.forEach(System.out::println);
		System.out.println("null");
	}

	//Departments with highest count of employees
	public static void highEmpDept() {
		List<Employee> list = EmployeeRepository.getEmpList();
		Map<Object, Long> employeeCountByDepartment = list.stream().filter((emp) -> emp.getDepartment() != null)
				.collect(
						Collectors.groupingBy(dept -> dept.getDepartment().getDepartmentName(), Collectors.counting()));
		System.out.println(employeeCountByDepartment);

	}

	//Employee name and duration of their service in months and days
	public static void empWithDuration() {
		List<Employee> employeeList = EmployeeRepository.getEmpList();
		employeeList.stream().forEach(e -> {
			Period period = e.getHireDate().until(LocalDate.now());
			System.out.println("Employee Id :" + e.getFirstName() + " " + e.getLastName() + "  Month:"
					+ ChronoUnit.MONTHS.between(e.getHireDate(), LocalDate.now()) + "  Days:" + period.getDays());
		});
	}

	//Employee name, salary and salary increased by 15% 
	public static void increasedSalary() {
		List<Employee> list = EmployeeRepository.getEmpList();
		list.stream().collect(Collectors.toList());
		for (Employee emp : list) {
			System.out.println("Emp Name: " + emp.getFirstName() + " Salary: " + emp.getSalary() + " Salary increased: "
					+ (emp.getSalary() * 0.15 + emp.getSalary()));
		}
	}

	//method for printing line
	private static void printLine() {
		System.out.println("_________________________________________________________________");
	}

	public static void main(String[] args) {
		System.out.println("sum of salary of all employees");
		System.out.println("Total Salary: " + sumOfSalaries());
		printLine();

		System.out.println("department names and count of employees in each department");
		deptNameWithEmp();
		printLine();

		//System.out.println("senior most employee of an organization");
		//seniorEmp();
		//printLine();

		System.out.println("employees without department");
		empWithoutDept();
		printLine();

		System.out.println("department without employees");
		depWithoutEmp();
		printLine();

		System.out.println("departments with highest count of employees.");
		highEmpDept();
		printLine();

		System.out.println("employee name and duration of their service in months and days. ");
		empWithDuration();
		printLine();

		System.out.println("employee name, salary and salary increased by 15%.");
		increasedSalary();
		printLine();

	}

}
