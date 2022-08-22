package com.cg.wallet;

import java.util.Scanner;

public class Wallet {

int balance;
String name;
String WalletId;
int amount;
int amount2;

public Wallet(String name, String walletId)
{ 
	super();
	this.name = name;
    WalletId = walletId; 
}
}
// Function for Depositing money
/*void deposit(int amount) {
if (amount != 0) {
balance = balance + amount;
}
}
// Function for Withdrawing money
void withdraw(int amount2) {
if (amount2 != 0) {
balance = balance - amount2;
}
}

void trans(int amount3) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the recipient name");
String name=sc.nextLine();
if(amount3!=0) {
balance=balance-amount3;
}
}





// Function showing the main menu
void showMenu() {
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
System.out.println("Transaction successful "+name+" Thanku for using");
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

}*/

