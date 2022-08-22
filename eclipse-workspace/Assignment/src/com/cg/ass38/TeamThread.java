package com.cg.ass38;
import java.util.PriorityQueue; 
public class TeamThread extends Thread 
{
	private int NoOfPlayers;
	private Main threadMain;
	public TeamThread(int NoOfPlayers, Main threadMain) 
	{
		super();
		this.NoOfPlayers = NoOfPlayers;
		this.threadMain = threadMain;
	}
	public synchronized void run() 
	{
		for (int i=0;i<=NoOfPlayers;i++)
		{
			Main.queue.add(i);
		}
		Main.value = true;
		notify();
	}
}



