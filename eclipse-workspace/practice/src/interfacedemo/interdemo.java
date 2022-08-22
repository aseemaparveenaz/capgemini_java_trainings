package interfacedemo;

public interface interdemo {
  int add(int a,int b);
  default void dis(String name)
  {
	  System.out.println(name+" interone");
  }
}
