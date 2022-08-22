package com.cg.wallet.services;

import java.util.Scanner;

import com.wallet.exceptions.AccBalanceNotSufficientException;

public class WalletServicesImpl implements WalletServices{

    int balance;
    String name;
    String WalletId;
    int amount;
    int amount2;
    
	public WalletServicesImpl(String name, String walletId) {
		super();
		this.name = name;
		WalletId = walletId;
	}

	@Override
	public void withdraw(int amount2){
		// TODO Auto-generated method stub
		try {
		    if (amount2 <= balance) {
			balance = balance - amount2;
			}
		    if(amount2>balance)
		    {
		    	throw new AccBalanceNotSufficientException("ooops....!"+"\n--WITHDRAW FAILED--"+"\n you dont have sufficient balance to withdraw");
		    }
		    if(amount==0)
		    {
		    	throw new AccBalanceNotSufficientException("ooops...! cannot withdraw.....!"+"\n---YOU HAVE ZERO BALANCE");
		    }
		}
		catch(AccBalanceNotSufficientException wd)
		{
			System.out.println(wd);
		}
	}

	@Override
	public void deposit(int amount) {
		// TODO Auto-generated method stub
		if (amount != 0) {
			balance = balance + amount;
			}
		
	}
    boolean t=false;
	@Override
	public void trans(int amount3) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the recipient name");
		String recname=sc.nextLine();
		
		try {
		    if (amount3<= balance) {
			balance = balance - amount3;
			t=true;
			}
		    if(amount3>balance)
		    {
		    	throw new AccBalanceNotSufficientException("ooops....!"+"\n ------Transaction failed-----"+"\n you dont have sufficient balance for this Transaction");
		    }
		    if(amount3==0)
		    {
		    	throw new AccBalanceNotSufficientException("ooops....!"+"\n ------Transcation failed-----"+"\n \\n---YOU HAVE ZERO BALANCE FOR THIS TRANSACTION");
		    	
		    }
		}
		catch(AccBalanceNotSufficientException tex)
		{
			System.out.println(tex);
		}
		
	}

	@Override
	public void showMenu() {
		// TODO Auto-generated method stub
		
		char op;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome " + name + ", your WalletId is " + WalletId);
		System.out.println();
		System.out.println("Please, enter the desired Alphabet as per the given options for our service: ");
		System.out.println();

		do {
		System.out.println("A. Check your balance");
		System.out.println("B. Make a deposit");
		System.out.println("C. Make a withdrawal");
		System.out.println("D. Transaction");
		System.out.println("E.exit");
		System.out.println();
		System.out.println("The option I prefer: ");
		op = sc.next().charAt(0);
		System.out.println();


		switch (op) {
		case 'A':
		System.out.println("====================================");
		System.out.println("Balance = $" + balance);
		System.out.println("====================================");
		System.out.println();
		break;

		case 'B':
		System.out.println("====================================");
		System.out.println("Enter the amount to deposit: ");
		int am = sc.nextInt();
		deposit(am);
		System.out.println("Balance After Deposit = $" + balance);
		System.out.println("====================================");
		System.out.println();
		break;


		case 'C':

		System.out.println("====================================");
		System.out.println("Enter the amount to withdraw: ");
		int amount2 = sc.nextInt();
		withdraw(amount2);
		System.out.println("Balance After Withdrawal = $" + balance);
		System.out.println("====================================");
		System.out.println();
		break;

		case 'D':
		System.out.println("=====================================");
		System.out.println("Enter the amount to tranfer");
		int amount3=sc.nextInt();
		trans(amount3);
		if(t==true)
			System.out.println("Transaction successful "+name+" Thanku for using... IOB bank");
			System.out.println();
		break;







		case 'E':
		System.out.println("====================================");
		break;





		default:
		System.out.println("Error: invalid option. Please enter A, B, C, or D to access services");
		break;


		}
		} while (op != 'E');

		System.out.println("Thank you for banking with us!");

		}
		
	}


