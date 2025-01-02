package functionalInterface.function;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		Function<String, Integer> f = (name) -> name.length();
		
		System.out.println(f.apply("SammyIT"));
		System.out.println(f.apply("hyd"));
		System.out.println(f.apply("sachin"));
		
		
		
	}
}
