package com.anstract;
public class Carabs extends VehicleAbs{


public Carabs(int gear) {
	// TODO Auto-generated constructor stub
	super(gear);
}

@Override
void printStatus() {
System.out.println("gear car" +"\t"+ gear);

}

void changeGear(int g)
{
System.out.println("child class method");
this.gear = g;
}

}
