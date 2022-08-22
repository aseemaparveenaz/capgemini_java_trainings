package com.cg.eis.bean;

public class Employee 
{
	private static String name;
	private int id;
	 private static double salary;
	 private static String designation;
	 private String insuranceScheme;
	 
	public Employee(String name, int id, double salary, String designation) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.designation = designation;
		
	}
	public static String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public static double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public static String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
}
