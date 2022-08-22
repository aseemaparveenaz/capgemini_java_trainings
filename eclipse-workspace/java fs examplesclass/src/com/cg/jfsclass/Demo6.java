package com.cg.jfsclass;

class Demo6 implements Runnable
{
String msg1;
String msg2;
Test1 x;



public Demo6(String msg1, String msg2,Test1 t) {
this.msg1 = msg1;
this.msg2 = msg2;
x=t;
}



@Override
public void run()
{
synchronized (x) {
x.display(msg1,msg2);
}



}



/*
* Digging the mud-10 mins->Harish Batta
* Putting the plants-10mins-->Ayeshaa
* Covering the mud-10 mins-->Uttam
* Pour the water-10mins--->Bhavya
*/
}





class Test1
{
public void display(String msg1,String msg2)
{
System.out.println(msg1);
try
{
Thread.sleep(1000);
}catch(InterruptedException e)
{



}
System.out.println(msg2);
}
public static void main(String[] args) {
Test1 t=new Test1();



Demo6 d=new Demo6("Harish Batta","Digging the mud",t);
Demo6 d1=new Demo6("Ayeshaa","Putting the plants",t);
Demo6 d2=new Demo6("Uttam","Covering the mud",t);
Demo6 d3=new Demo6("Bhavya","Pour the water",t);



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