package com.cg.jfsclass;

/*
* 10 acres of land
* 700 plants to be planted
* Digging the mud-10 mins
* Putting the plants-10mins
* Covering the mud-10 mins
* Pour the water-10mins
1 plant =40 mins
9*60=540/40=13.5 plants per day
700/13.5=50 days



Digging the mud-10 mins->Harish Batta
* Putting the plants-10mins-->Ayeshaa
* Covering the mud-10 mins-->Uttam
* Pour the water-10mins--->Bhavya
per hour 6plants
9 hr=54 plants per day
700/54= 13 days
*/



class Demo5 implements Runnable
{
String msg1;
String msg2;
Test x;



public Demo5(String msg1, String msg2,Test t) {
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





class Test
{
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
}
public static void main(String[] args) {
Test t=new Test();



Demo5 d=new Demo5("Harish Batta","Digging the mud",t);
Demo5 d1=new Demo5("Ayeshaa","Putting the plants",t);
Demo5 d2=new Demo5("Uttam","Covering the mud",t);
Demo5 d3=new Demo5("Bhavya","Pour the water",t);



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