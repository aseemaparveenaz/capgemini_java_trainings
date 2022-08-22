package com.cg.lambdaassignment;

@FunctionalInterface
interface MyInterface {
	void display();
}

public class LambdaEx4 {

	public void myMethod() {
		System.out.println("Instance Method");
	}

	public static void main(String[] args) {
		LambdaEx4 obj = new LambdaEx4();
		// Method reference using the object of the class
		MyInterface ref = obj::myMethod;
		// Calling the method of functional interface
		ref.display();
	}
}

