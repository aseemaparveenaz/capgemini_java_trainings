package com.cg.jfsclass;

public class Demo implements Runnable {



void display()
{
System.out.println("Capgemini");
}
@Override
public void run() {
// TODO Auto-generated method stub

}
public static void main(String[] args) {
System.out.println("Main Method Started");
Runnable d=new Demo();
Thread th=new Thread(d);
th.start();
System.out.println("Main Method Ended");
}



}

/*
Thread State
New:=Thread th=new Thread(d);
Ready:-th.start();//this will schedule the thread to process stack
Runnable:-public void run()// this will run the child thread
wait:-When one thread running another thread waits
Stop/Dead:-When thread complete the task
RTE:Orphan thread:-Are the threads running after the completion of main thread directly controlled by JVM(GrandParents)
then marriage
Daemon threads:-Which support the orphan threads are Daemon Threads
*/
