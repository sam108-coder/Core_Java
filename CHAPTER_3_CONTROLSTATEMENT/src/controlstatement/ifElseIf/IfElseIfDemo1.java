package controlstatement.ifElseIf;

public class IfElseIfDemo1 {
    public static void main(String[] args) {
        int no1 = 10;

        if (no1 > 10) {
            System.out.println("hello 1");
        } else if (no1 > 5) {
            System.out.println("hello 2");
        } else if (no1 > 10) {
            System.out.println("hello 3");
        } else {
            System.out.println("hello 4");
        }
    }
}
