package com.collection;

class employeepojo {
	private int empid;
	private String design,name;
	public employeepojo(int empid, String design, String name) {
		super();
		this.empid = empid;
		this.design = design;
		this.name = name;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getDesign() {
		return design;
	}
	public void setDesign(String design) {
		this.design = design;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
