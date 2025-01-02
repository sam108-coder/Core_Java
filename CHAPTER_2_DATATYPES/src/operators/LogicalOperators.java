package operators;

public class LogicalOperators {
    public static void main(String[] args) {
        int no1 = 10;
        int no2 = 20;
        int no3 = 30;

        System.out.println(no1 > no2 && no1 > no3);

        System.out.println(no1 < no2 && no1 > no3);

        System.out.println(no1 < no2 && no1 < no3);

        System.out.println(no1 > no2 || no1 > no3);

        System.out.println(no1 < no2 || no1 > no3);
    }
}
