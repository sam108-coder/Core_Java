package tryCatchBlock;

public class Test1 {
    public static void main(String[] args) {
        try {
            System.out.println("1");
            int a = 100, b = 0, c;
            System.out.println("2");
            c = a / b;
            System.out.println("3");
            System.out.println(c);
            System.out.println("4");
        } catch (Exception e) {
            System.out.println("5");
            System.out.println("You can not divide by Zero");
            System.out.println("6");
        }
        System.out.println("------Thank You------");
    }
}
