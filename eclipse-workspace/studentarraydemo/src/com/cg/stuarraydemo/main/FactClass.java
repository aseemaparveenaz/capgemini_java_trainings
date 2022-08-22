package com.cg.stuarraydemo.main;
import java.util.*;

public class FactClass {
	  static int factsum(int num)
	  {
		  int sum=0;
		  for(int j=1;j<=num;j++)
		  {
			if(num%j==0)
			  sum=sum+j;
		  }
		  return sum;
	  }
public static void main(String[] args)
  {
	  FactClass f=new FactClass();
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  int[] arr=new int[n];
	  int[] ans2=new int[n];
	for(int i=0;i<n;i++)
	  {
		 arr[i]=sc.nextInt();
	  }
	  for(int k=0;k<n;k++)
	  {
		  ans2[k]=f.factsum(arr[k]);
	  }
	  for(int k=0;k<n;k++)
	  {
		  System.out.println(ans2[k]);
	  }
  }
}
