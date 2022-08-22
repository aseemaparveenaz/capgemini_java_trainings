package com.cg.stuarraydemo.main;
import com.cg.stuarraydemo.*;
public class MainClass {
	public static void main(String[] args) {
	Address address=new Address("chennai","lane",5);
	Studentarr st=new Studentarr(3,"aseema",address);
	System.out.println(st.getAddress().getStreetname());
	System.out.println(address.getStreetname());
	System.out.println(st.getName());
	}

}
