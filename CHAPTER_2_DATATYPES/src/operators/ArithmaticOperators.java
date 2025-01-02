package operators;

public class ArithmaticOperators {
    public static void main(String[] args) {
        int no1 = 10;
        int no2 = 20;

        int res1 = no1 + no2;
        System.out.println(res1);

        int res2 = no1 - no2;
        System.out.println(res2);

        int res3 = no1 * no2;
        System.out.println(res3);

        int res4 = no2 / no1;
        System.out.println(res4);

        int res5 = no1 % no2;
        System.out.println(res5);

        System.out.println("Result is : " + (no1 + no2)); //30
        System.out.println("Result is : " + no1 + no2); //1020

    }
}
