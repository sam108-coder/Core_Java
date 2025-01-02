package controlstatement.switchExample;

import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no1, no2;
        String sym, yn;

        do {
            System.out.println("Enter 1st Number : ");
            no1 = sc.nextInt();

            System.out.println("Enter 2nd Number : ");
            no2 = sc.nextInt();

            System.out.println("Enter symbol (+,-,*,/,%)");
            sym = sc.next();

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
            System.out.println("Do you want to Continue(Press y for Yes or n for No)");
            yn= sc.next();
            System.out.println("********************************************************");
        }
        while (yn.equals("y") || yn.equals("Y"));
    }
}
