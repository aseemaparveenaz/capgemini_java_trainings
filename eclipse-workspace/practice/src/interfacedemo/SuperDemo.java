package interfacedemo;

public class SuperDemo implements interdemo,interdemotwo{
@Override
public int add(int a, int b) {
return a+b;
}
@Override
public void dis(String name) {
System.out.println("inside super demo"+name);
}



}
