package com.cg.employeepayroll;
public class EmployeePayroll {

public final static int COUNTER=10;

private int employeeId;
private String firstName;
private String lastName;
private int departmentId;

public static int a ;
static int b;

static {
a=12;
System.out.println("static block 1"+a);
}

static {
b=20;
System.out.println("static block 2"+b);
}

{
System.out.println("Instance block 1");

}

{
System.out.println("Instance block 2");

}


public static int getCOUNTER() {
return COUNTER;
}




public EmployeePayroll() {
System.out.println("This is the default constructor");

}

public EmployeePayroll(int employeeId, String firstName, String lastName, int departmentId) {
super();
this.employeeId = employeeId;
this.firstName = firstName;
this.lastName = lastName;
this.departmentId = departmentId;
//COUNTER++;
}



public int getEmployeeId() {
return employeeId;
}



public void setEmployeeId(int employeeId) {
this.employeeId = employeeId;
}



public String getFirstName() {
return firstName;
}



public void setFirstName(String firstName) {
this.firstName = firstName;
}



public String getLastName() {
return lastName;
}



public void setLastName(String lastName) {
this.lastName = lastName;
}



public int getDepartmentId() {
return departmentId;
}



public void setDepartmentId(int departmentId) {
this.departmentId = departmentId;
}
}
//mam code


