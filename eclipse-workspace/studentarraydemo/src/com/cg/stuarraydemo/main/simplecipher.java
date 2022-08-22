package com.cg.stuarraydemo.main;

public class simplecipher
{

	public static void main(String[] args)
	{
		String str="ABCD";
		int k=2;
		String ansstr="";
		char[] charArr = str.toCharArray();
		int l=charArr.length;
		int[] ans=new int[l];
		char[] ansi=new char[l];
		for(int i=0;i<charArr.length;i++)
		{
		    ans[i]=(int)charArr[i]-k;	
		}
		for(int i=0;i<charArr.length;i++)
		{
		    ansi[i]=(char)ans[i];	
		}
		ansstr = String.valueOf(ansi);
		 System.out.println(ansstr);
	}
   
}
