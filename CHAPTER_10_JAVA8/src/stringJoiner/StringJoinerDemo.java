package stringJoiner;

import java.util.StringJoiner;

public class StringJoinerDemo {

	public static void main(String[] args) {

		StringJoiner sj1 = new StringJoiner("-"); // Delimiter

		sj1.add("ashok");
		sj1.add("it");
		sj1.add("java");

		System.out.println(sj1);

		StringJoiner sj2 = new StringJoiner("-", "(", ")");
		
		sj2.add("sammy");
		sj2.add("it");
		sj2.add("java");

		System.out.println(sj2);

	}

}
