package com.cg.walletMain;

import java.util.Scanner;

import com.cg.walletService.walletservice;
import com.cg.walletService.walletserviceImpl;
import com.cg.walletbean.walletuser;

public class walletmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		walletservice ser=new walletserviceImpl();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("1: Insert user details");
			System.out.println("2: deposit");
			System.out.println("3: withdraw");
			System.out.println("4: Transaction");
			System.out.println("5: Exit");
			System.out.println("---->Enter choice---> ");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter wallet id");
				String walletId=sc.next();
				System.out.println("Enter user name");
				String userName=sc.next();
				System.out.println("Enter access code");
				String userAccessCode=sc.next();
				walletuser u1=new walletuser(walletId,userName,userAccessCode);
				String res=ser.insertuser(u1);
				break;
				
			case 2:
				System.out.println("Enter amount");
				int amount=sc.nextInt();
				String res1=ser.deposit(amount);
				System.out.println("Your Deposit : "+res1);
				break;
				
			case 3:
				System.out.println("Enter amount");
				int amount1=sc.nextInt();
				String res2=ser.withdraw(amount1);
				System.out.println("Your withdraw : "+res2);
				break;
				
			case 4:
				System.out.println("Enter Source walletid");
				int sourceid=sc.nextInt();
				System.out.println("Enter recipient walletid");
				int recepientid=sc.nextInt();
				System.out.println("Enter amount");
				int amount2=sc.nextInt();
				String res3=ser.transaction(amount2);
				System.out.println("From "+sourceid+" successfully transferred to "+recepientid);
				System.out.println("Your Transaction :"+res3);
				break;
				
				
			case 5:
				System.exit(0);
			default:
				System.out.println("Invalid option selected");	
				
				
			}
			
		}
		

	}

}
