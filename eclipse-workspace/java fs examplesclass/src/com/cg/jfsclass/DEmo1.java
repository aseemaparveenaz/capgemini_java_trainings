package com.cg.jfsclass;
public class DEmo1 implements Runnable {



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
Runnable d=new DEmo1();
Thread th=new Thread(d);
th.setDaemon(true);
th.start();
System.out.println("Main Method Ended");
}



}
