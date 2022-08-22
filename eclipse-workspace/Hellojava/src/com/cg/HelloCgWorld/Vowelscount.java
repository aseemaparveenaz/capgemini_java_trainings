package com.cg.HelloCgWorld;

import java.util.Scanner;

public class Vowelscount {
	public static void main(String args[]){
	      int count = 0,space=0;
	      System.out.println("Enter a sentence :");
	      Scanner sc = new Scanner(System.in);
	      String sentence = sc.nextLine();
          int l=sentence.length();
	      for (int i=0 ; i<sentence.length(); i++){
	         char ch = sentence.charAt(i);
	         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'){
	            count ++;
	         }
	         if(ch == ' ')
	         {
	        	 space++;
	         }
	      }
	      int consont=l-(count+space);
	      System.out.println("Number of vowels in the given sentence is "+count);
	      System.out.println("Number of space in the given sentence is "+space);
	      System.out.println("Number of consonents in the given sentence is "+consont);
	   }

}
