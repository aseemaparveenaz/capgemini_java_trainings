package com.cg.ass38;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
public class Main {
public static PriorityQueue<Integer> queue = new PriorityQueue<>();
public static boolean value = false;
public static void main(String[] args)
{
	Main threadMain = new Main();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number of Players:");
	int n = sc.nextInt();
	TeamThread t = new TeamThread(n,threadMain);
	PlayerThread t1 = new PlayerThread(n,threadMain);
	t.start();
	t1.start();
}
}
