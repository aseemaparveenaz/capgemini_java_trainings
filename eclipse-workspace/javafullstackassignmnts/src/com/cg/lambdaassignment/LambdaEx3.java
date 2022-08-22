package com.cg.lambdaassignment;
import java.util.function.Predicate;

public class LambdaEx3 {
	public static void main(String[] args) {
		String username = "CG";
		Predicate<String> predicate = uname -> uname == username;
		System.out.println(predicate.test("CG"));

		String password = "CG";
		Predicate<String> predicate1 = pwd -> pwd == password;
		System.out.println(predicate1.test("cg"));
	}
}
