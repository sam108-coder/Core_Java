package controlstatement.logical;

import java.util.Scanner;

// WAP to print factorial of the number
public class Factorial1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int no = sc.nextInt();

        //    int no = 5;  // hard coded
        int fact = 1;
        for (int i = 1; i <= no; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + no + " is " + fact);
    }
}
