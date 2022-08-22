package com.cg.Mainwall;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

import com.cg.ServiceWall.Servicewall;
import com.cg.ServiceWall.ServicewallImpl;

public class walletMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Servicewall s=new ServicewallImpl();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("1.update user details");
			System.out.println("2.deposit");
			System.out.println("3.withdraw");
			System.out.println("4.Transaction");
			System.out.println("5.Exit");
			System.out.println("-->Enter choice---> ");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:
				//used collections to store user info
				
				Hashtable<String, String> hmap = new Hashtable<>();
				System.out.println("Enter wallet id");
				String walletId=sc.next();
				System.out.println("Enter user name");
				String userName=sc.next();
				System.out.println("Enter mobile number");
				String userAccessCode=sc.next();
				//java 8 features
				System.out.println("enter four didgit pin");
				String pin=sc.next();
				if(pin.length()!=4) {
					System.out.println("invalid pin");
				}
				
				hmap.put(userName, userAccessCode);
			    System.out.println(hmap);
			    System.out.println("successfull login");
			    
				break;
				
			case 2:
				System.out.println("Enter amount");
				int amount=sc.nextInt();
				String res1=s.deposit(amount);
				System.out.println("your balance :"+res1);
				break;
				
			case 3:
				System.out.println("Enter amount");
				int amount1=sc.nextInt();
				String res2=s.withdraw(amount1);
				System.out.println("your balance:"+res2);
				break;
				
			case 4:
				System.out.println("Enter Source walletid");
				int sourceid=sc.nextInt();
				System.out.println("Enter recipient walletid");
				int recepientid=sc.nextInt();
				System.out.println("Enter amount");
				int amount2=sc.nextInt();
				String res3=s.transaction(amount2);
				System.out.println("From"+sourceid+"successfully transferred to"+recepientid);
				System.out.println("Your balance :"+res3);
				break;
				
				
				
			case 5:
				System.exit(0);
			default:
				System.out.println("Invalid option selected");	
				
				
			}
			
		}
		

	}

	}


