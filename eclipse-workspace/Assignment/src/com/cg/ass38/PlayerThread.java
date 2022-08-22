package com.cg.ass38;

public class PlayerThread extends Thread {

private int NoOfPlayers;
private Main threadMain;

public PlayerThread(int NoOfPlayers, Main threadMain) 
{
	super();
	this.NoOfPlayers = NoOfPlayers;
	this.threadMain = threadMain;
}

public synchronized void run() 
{	
	for (int i : Main.queue) {

		System.out.println("Player thread "+ i);
	}
}
}