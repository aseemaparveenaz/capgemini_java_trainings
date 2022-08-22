package com.cg.HelloCgWorld;
import java.text.ParseException;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.Locale;  

   

public class Dateformatting {
	public static void main(String[] args)
	{
		 Date date = new Date();  
		 SimpleDateFormat formatter = new SimpleDateFormat("MM:dd:yyyy"); 
		  String strDate = formatter.format(date);  
		    System.out.println("Date Format with MM:dd:yyyy : "+strDate);  
		    
		    formatter = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss ");  
		    strDate = formatter.format(date);  
		    System.out.println("Date Format with E, dd MMM yyyy HH:mm:ss : "+strDate); 
		  
	}

}
