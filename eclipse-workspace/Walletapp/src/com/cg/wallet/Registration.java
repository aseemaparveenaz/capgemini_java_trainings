package com.cg.wallet;

import java.util.Scanner;

public class Registration {
	static Register register = new Register();

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print(" Enter firstName => ");
            String firstName = scanner.nextLine();
            register.setFirstName(firstName);

            System.out.print(" Enter lastName => ");
            String lastName = scanner.nextLine();
            register.setLastName(lastName);

            System.out.print(" Enter userName => ");
            String userName = scanner.nextLine();
            register.setUserName(userName);

            System.out.print(" Enter password => ");
            String Password = scanner.nextLine();
            register.setPassword(Password);

            System.out.print(" Enter emailId => ");
            String emailId = scanner.nextLine();
            register.setEmailId(emailId);

            System.out.print(" Enter phoneNo => ");
            long phoneNo = scanner.nextLong();
            register.setPhoneNo(phoneNo);

            System.out.println(register.toString());
            
            
            System.out.println("LOGIN");
            
            
            System.out.println(" Enter user name => ");
            String userName1 = scanner.nextLine();

            System.out.println(" Enter password => ");
            String Password1 = scanner.nextLine();

            if (Password1.equals(Password)) {
                System.out.println(" User successfully logged-in.. ");
                System.out.println("Enter your name");
        		String name = scanner.nextLine();
        		System.out.println("Enter your Walletid");
        		String WalletId = scanner.nextLine();
        		Wallet f = new Wallet (name, WalletId);
        		f.showMenu();
            } else {
                System.out.println(" In valid userName or password ");
            }
            
        	
        }
    }
}

class Register {
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String emailId;
    private long phoneNo;
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    public long getPhoneNo() {
        return phoneNo;
    }
    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }
    @Override
    public String toString() {
        return "Register [firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName + ", password=" +
            password + ", emailId=" + emailId + ", phoneNo=" + phoneNo + "]";
        
        
		}

    }

