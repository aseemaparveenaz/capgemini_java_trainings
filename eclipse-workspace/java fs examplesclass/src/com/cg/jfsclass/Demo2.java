package com.cg.jfsclass;
public class Demo2 implements Runnable {



void display()
{
System.out.println("Capgemini");
}
@Override
public void run() {
display();

}
public static void main(String[] args) {
System.out.println("Main Method Started");
Runnable d=new Demo2();
Thread th=new Thread(d);
Thread th1=new Thread(d);
Thread th2=new Thread(d);
th.start();
th1.start();
th2.start();

try
{
Thread.sleep(1000);
}catch(InterruptedException e)
{

}
System.out.println("Main Method Ended");
}



}