package com.cg.stuarraydemo;

public class Address {
	 private String streetname,stnum;
	 private int doornum;
	public Address(String streetname, String stnum, int doornum) {
		super();
		this.streetname = streetname;
		this.stnum = stnum;
		this.doornum = doornum;
	}
	public String getStreetname() {
		return streetname;
	}
	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}
	public String getStnum() {
		return stnum;
	}
	public void setStnum(String stnum) {
		this.stnum = stnum;
	}
	public int getDoornum() {
		return doornum;
	}
	public void setDoornum(int doornum) {
		this.doornum = doornum;
	}

}
