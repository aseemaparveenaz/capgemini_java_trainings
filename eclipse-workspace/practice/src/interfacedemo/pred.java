package interfacedemo;

import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class pred {

	public static void main(String[] args) {
		Predicate<String> testString = (str1)->str1.startsWith("N")&&str1.endsWith("y");
		System.out.println(testString.test("Norway"));
		BiPredicate<Integer, Integer> testEven = (a, b)-> a%2 == 0 && b%2 == 0;
		System.out.println(testEven.test(20, 62));
		Supplier<Double> test=()->Math.random();
		System.out.println(test.get());
		Consumer<String> dis=(s)->System.out.println(s);
		dis.accept("aseema");
	}
}
