package interfacedemo;

public class Demo extends SuperDemo implements interdemotwo{
@Override
public void dis(String name) {
System.out.println("inside demo class:"+name);
}






public static void main(String[] args) {
Demo d = new Demo();
d.dis("selvi");
}
}
