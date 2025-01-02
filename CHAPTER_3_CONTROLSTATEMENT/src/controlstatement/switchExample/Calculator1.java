package controlstatement.switchExample;

import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st Number : ");
        int no1 = sc.nextInt();

        System.out.println("Enter 2nd Number : ");
        int no2 = sc.nextInt();

        System.out.println("Enter symbol(+,-,*,/,%)");
        String sym = sc.next();

        switch (sym) {
            case "+":
                System.out.println("Result is : " + (no1 + no2));
                break;
            case "-":
                System.out.println("Result is : " + (no1 - no2));
                break;
            case "*":
                System.out.println("Result is : " + (no1 * no2));
                break;
            case "/":
                System.out.println("Result is : " + (no1 / no2));
                break;
            case "%":
                System.out.println("Result is : " + (no1 % no2));
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }


    }
}
