package com.hrllo;

public class addnumalpha {
public static void main(String[] args) {
	String s = "aseema az";
	int sum=0;
	int su=0;
	char[] ch = s.toCharArray();
	for (char c : ch) {
		if(c==' ')
			continue;
		else {
			int temp = (int)c;
			int t = 96;
			if(temp<=122 & temp>=97) {
				su = temp-t;
			}
		}
		sum = sum+su;
	}
	System.out.println("Total Sum :"+sum);
}
}
