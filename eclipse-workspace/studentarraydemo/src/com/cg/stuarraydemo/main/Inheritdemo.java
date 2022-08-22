package com.cg.stuarraydemo.main;
class Base{
	public void baseMethod() {
		System.out.println("Base");
	}
}
class Derived extends Base{
	public void derivedmethd()
	{
		super.baseMethod();
		System.out.println("derived");
	}
}
public class Inheritdemo {

	public static void main(String[] args) {
		Derived d=new Derived();
		d.derivedmethd();

	}

}
