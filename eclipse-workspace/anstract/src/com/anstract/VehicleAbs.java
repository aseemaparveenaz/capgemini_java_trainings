package com.anstract;

public abstract class VehicleAbs {
	int gear;

	abstract void printStatus();
	void changeGear(int g)
	{
	System.out.println("Thsi is the parent method");
	this.gear = g;
	}
	public VehicleAbs(int gear) {
	super();
	this.gear = gear;
	}

	}
