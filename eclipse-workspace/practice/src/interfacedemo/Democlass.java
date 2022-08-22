package interfacedemo;

public class Democlass implements interdemo,interdemotwo{

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	public void dis(String name)
	  {
		interdemotwo.super.dis(name);
		  System.out.println(name+" demo ");
	  }
	public static void main(String[] args) {
		interdemo ob=new Democlass();
		ob.dis("aseema parveen");
		interdemotwo de=new Democlass();
		de.dis("aseema parveen");
		Democlass d=new Democlass()	;
		d.dis("ass");
		}
     
}
