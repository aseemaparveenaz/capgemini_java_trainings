package com.cg.jfsclass;
class Demo7 implements Runnable
{
String msg1;
String msg2;



public Demo7(String msg1, String msg2) {
this.msg1 = msg1;
this.msg2 = msg2;
}



@Override
public void run() {
display(msg1,msg2);
}
public static synchronized void display(String msg1,String msg2)
{
System.out.println(msg1);
try
{
Thread.sleep(1000);
}catch(InterruptedException e)
{



}
System.out.println(msg2);
/*
* Digging the mud-10 mins->Harish Batta
* Putting the plants-10mins-->Ayeshaa
* Covering the mud-10 mins-->Uttam
* Pour the water-10mins--->Bhavya
*/
}
public static void main(String[] args) {
Demo7 d=new Demo7("Harish Batta","Digging the mud");
Demo7 d1=new Demo7("Ayeshaa","Putting the plants");
Demo7 d2=new Demo7("Uttam","Covering the mud");
Demo7 d3=new Demo7("Bhavya","Pour the water");

Thread th=new Thread(d);
Thread th1=new Thread(d1);
Thread th2=new Thread(d2);
Thread th3=new Thread(d3);

th.start();
th1.start();
th2.start();
th3.start();

}
}