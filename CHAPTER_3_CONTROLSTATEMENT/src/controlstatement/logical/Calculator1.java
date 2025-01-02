package controlstatement.logical;

public class Calculator1 {
    public static void main(String[] args) {
        int no1 = 10;
        int no2 = 20;
        char c = '*';
        switch (c) {
            case '+':
                System.out.println("Result is : " + (no1 + no2));
                break;
            case '-':
                System.out.println("Result is : " + (no1 - no2));
                break;
            case '*':
                System.out.println("Result is : " + (no1 * no2));
                break;
            case '/':
                System.out.println("Result is : " + (no1 / no2));
                break;
            default:
                System.out.println("Invalid");
                break;


        }

    }
}
