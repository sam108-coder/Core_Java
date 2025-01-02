package lambdaExp;

@FunctionalInterface
interface MyInterfaceTwo {
	 void m2();
}

public class MyAppTwo {
	public static void main(String[] args) {
		MyInterfaceTwo mit = () -> System.out.println("m2 method called....");
		mit.m2();
	}
}
