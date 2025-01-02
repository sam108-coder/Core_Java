package functionalInterface.predicate;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class BiPredicateDemo {

	public static void main(String[] args) {
		Predicate<Integer> p = (i) -> i > 10;
		System.out.println(p.test(5));
		System.out.println(p.test(15));

		System.out.println("====================");

		BiPredicate<Integer, Integer> bip = (i, j) -> (i + j) >= 20;
		System.out.println(bip.test(2, 3));
		System.out.println(bip.test(15, 5));

	}
}
  