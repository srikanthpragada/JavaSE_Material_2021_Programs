package library2;

import java.util.function.*;

public class BuiltInFunctionalInterfaces {
	public static void main(String[] args) {
		Consumer<String> c = (s) -> System.out.println(s.toUpperCase());
		c.accept("Srikanth");
		Predicate<String> p = (s) -> s.length() > 5;
		System.out.println(p.test("Java"));
		Function<Integer, String> f = (n) -> n.toString();
		System.out.println(f.apply(100));
	}
}