package operators;

public class UnaryOperators4 {
    public static void main(String[] args) {
        int no1 = 10, no2 = 20;

        System.out.println(no1++ + no2); // 10+20
        System.out.println(no1); // 11

        System.out.println(++no1 + ++no2); // 12+21

        System.out.println(++no1 - ++no1); // 13 - 14
        System.out.println(no1);

        System.out.println(--no1 - --no1); // 13-12

        System.out.println(--no1 + --no1); // 11 + 10
    }
}
