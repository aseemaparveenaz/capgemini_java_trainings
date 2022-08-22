package com.cg.employeepayroll;

public class StudentClass {
private int StudenId;
private String firstName;
private String lastName;
private String courseName;
public StudentClass(int studenId, String firstName, String lastName, String courseName) {
super();
StudenId = studenId;
this.firstName = firstName;
this.lastName = lastName;
this.courseName = courseName;
}
public int getStudenId() {
return StudenId;
}
public void setStudenId(int studenId) {
StudenId = studenId;
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
public String getCourseName() {
return courseName;
}
public void setCourseName(String courseName) {
this.courseName = courseName;
}



}
