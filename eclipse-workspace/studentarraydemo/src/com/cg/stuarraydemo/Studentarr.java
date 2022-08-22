package com.cg.stuarraydemo;

public class Studentarr{
	private int rollno;
	private String name;
	private Address address;
	public Studentarr(int rollno, String name, Address address) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void printit()
	{
		System.out.println(name);
		System.out.println(rollno);
	}

}
