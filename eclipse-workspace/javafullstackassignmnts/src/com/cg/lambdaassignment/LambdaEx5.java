package com.cg.lambdaassignment;

interface Factorial {
	public void getFact(int n);
}

public class LambdaEx5 {
	public static void fact(int n) {
		int fact = 1;
		for (int i = 2; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial: "+fact);
	}

	public static void main(String[] args) {

		Factorial f = (int n) -> System.out.println("Number: "+n);
		f.getFact(5);
		Factorial f1 = LambdaEx5::fact;
		f1.getFact(5);

	}
}
