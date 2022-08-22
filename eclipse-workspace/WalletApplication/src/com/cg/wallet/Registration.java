package com.cg.wallet;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cg.wallet.services.WalletServicesImpl;
import com.wallet.exceptions.InvalidEmailException;
import com.wallet.exceptions.InvalidFnameException;
import com.wallet.exceptions.InvalidLnameException;
import com.wallet.exceptions.InvalidPasswordException;
import com.wallet.exceptions.InvalidPhNumberException;
import com.wallet.exceptions.InvalidUsernameException;
public class Registration {
	
	static Register register = new Register();
    public static void main(String[] args) {
    	
        try (Scanner scanner = new Scanner(System.in)) {
        	
        	try {
        		System.out.print(" Enter firstName => ");
        		String firstName = scanner.nextLine();
            	String fnamereg ="[a-zA-Z]{1,10}"; 
                Pattern fnamepat = Pattern.compile(fnamereg);
                register.setFirstName(firstName);
                Matcher fnamemat = fnamepat.matcher(firstName);
                if(!fnamemat.matches())
				{
			             throw new InvalidFnameException("please enter valid name first name......"
			             		+ "\n-----------Name should contain alphabets between 1 to 10 only!---------");
		        }
              }
            catch(InvalidFnameException exfname)
            {
            	System.out.println(exfname);
            }
        	
        	
        	try {
        		System.out.print(" Enter lastName => ");
        	    String lastName = scanner.nextLine();
            	String lnamereg ="[a-zA-Z]{1,2}"; 
                Pattern lnamepat = Pattern.compile(lnamereg);
                register.setFirstName(lastName);
                Matcher lnamemat = lnamepat.matcher(lastName);            
                register.setLastName(lastName);
                if(!lnamemat.matches())
				{
			             throw new InvalidLnameException("please enter valid name last name......"
			             		+ "\n-----------Name should contain alphabets between 1 and 2 character only!---------");
		        }
              }
            catch(InvalidLnameException exlname)
            {
            	System.out.println(exlname);
            }
        	
        
        	
        	try {
        		System.out.print(" Enter BankuserName => ");
        		String userName = scanner.nextLine();
            	String unamereg ="^[a-zA-Z0-9._-]{3,}$"; 
                Pattern unamepat = Pattern.compile(unamereg);
                Matcher unamemat = unamepat.matcher(userName);
                register.setUserName(userName);
                if(!unamemat.matches())
				{
			             throw new InvalidUsernameException("please enter valid name user name......"
			             		+ "\n-----------Name should contain alphabets between 5 TO 29 characters and any non digits only!---------");
		        }
              }
            catch(InvalidUsernameException exuname)
            {
            	System.out.println(exuname);
            }
       
        	String Password="";
			try {
        		System.out.print(" Enter password => ");
                Password = scanner.nextLine();
            	String passreg ="^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$"; 
                Pattern passpat = Pattern.compile(passreg);
                register.setPassword(Password);
                Matcher passmat = passpat.matcher(Password);
                
                if(!passmat.matches())
				{
			             throw new InvalidPasswordException("please enter valid name last password......"
			             		+ "\n------- Password must contain at least one digit [0-9].-----"
			            		+"\n-------  Password must contain at least one lowercase Latin character [a-z].------"
			            		+"\n------------- Password must contain at least one uppercase Latin character [A-Z].-----"
			            		+"\n-------Password must contain at least one special character like ! @ # & ( ).-----"
			            		+"\n------Password must contain a length of at least 8 characters and a maximum of 20 characters.------");
		        }
                
               
              }
            catch(InvalidPasswordException expass)
            {
            	System.out.println(expass);
            }
           
			try {
				System.out.print(" Enter emailId => ");
				String emailId = scanner.nextLine();
            	String emailreg ="[a-zA-Z0-9]{1,20}@[a-zA-Z0-9]{1,20}.[a-zA-Z]{2,20}"; 
                Pattern emailpat = Pattern.compile(emailreg);
                register.setEmailId(emailId);
                Matcher emailmat = emailpat.matcher(emailId);
                
                if(!emailmat.matches())
				{
			             throw new InvalidEmailException("please enter valid email......");
		        }
                
               
              }
            catch(InvalidEmailException exemail)
            {
            	System.out.println(exemail);
            }
           
            try {
            	System.out.print(" Enter phoneNo => ");
            	String phreg = ("[7-9][0-9]{9}");
                Pattern phpat = Pattern.compile(phreg);
                long phoneNo = scanner.nextLong();
                register.setPhoneNo(phoneNo);
                String strph = Long.toString(phoneNo);
                Matcher phmat = phpat.matcher(strph);
                if(!phmat.matches())
				{
			             throw new InvalidPhNumberException(" Invalid Mobile Number! please enter valid phone number");
		        }
              }
            catch(InvalidPhNumberException exph)
            {
            	System.out.println(exph);
            }
            
            System.out.println(register.toString());
            System.out.println("LOGIN");
            
           
            System.out.println(" Enter Bank user name => ");
            String userName1 = scanner.nextLine();
            scanner.nextLine();
           
            System.out.println(" Enter password => ");
            String Password1 = scanner.nextLine();

			if (Password1.equals(Password)) {
                System.out.println(" User successfully logged-in.. ");
                System.out.println("Enter your name");
        		String name = scanner.nextLine();
        		System.out.println("Enter your Walletid");
        		String WalletId = scanner.nextLine();
        		WalletServicesImpl f = new WalletServicesImpl (name, WalletId);
        		f.showMenu();
            } 
            else 
            {
                System.out.println(" Incorrect userName or password ");
            }
            
        	
        }
    }
}



    

