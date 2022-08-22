package com.cg.assignemttwo;
import java.util.Scanner;
public class MatchBO {
	public static void main(String[] args)
	{
	MatchOutcome matchoutcome = new MatchOutcome();
	matchoutcome.matches();
	for(int i=0;i<4;i++)
	{
	System.out.println("Menu:");
	System.out.println("1.View match details");
	System.out.println("2.Filter match details with outcome status");
	System.out.println("3.Filter match details with outcome winner team");
	System.out.println("4.Exit");
	System.out.println("Enter your choice");
	Scanner sc2 = new Scanner(System.in);
	int m=sc2.nextInt();
	switch(m)
	{
	case 1:
	matchoutcome.mdetail();
	break;
	case 2:
	matchoutcome.mdetailos();
	break;
	case 3:
	matchoutcome.mdetailowt();
	break;
	case 4:
	System.exit(0);
	break;
	default:
	System.out.println("Invalid Input!");
	}
	}
	}
}
