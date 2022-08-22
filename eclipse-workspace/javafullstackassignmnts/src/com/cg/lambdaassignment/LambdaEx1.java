package com.cg.lambdaassignment;
import java.util.function.BiFunction;

public class LambdaEx1 {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> a = (x, y) -> (int) Math.pow(x, y);
		System.out.println(a.apply(2,3));
	}
}
