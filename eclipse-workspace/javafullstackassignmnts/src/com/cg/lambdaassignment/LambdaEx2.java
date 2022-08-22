package com.cg.lambdaassignment;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaEx2 {
	public static void main(String[] args) {
		Consumer<String> consumer = (String str) -> System.out.println(str);
		Supplier<String> supplier = () -> "CG";
		consumer.accept(supplier.get().replace("", " ").trim());
	}
}
