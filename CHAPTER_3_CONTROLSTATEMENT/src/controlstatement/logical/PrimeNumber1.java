package controlstatement.logical;

import java.util.Scanner;

// WAP to check Prime Number
public class PrimeNumber1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int no = sc.nextInt();

        boolean b = false;
        for (int i = 2; i < no; i++) {
            if (no % i == 0) {
                b = true;
            }
        }
        if (b == true) {
            System.out.println("Number is not Prime");
        } else {
            System.out.println("Number is Prime");
        }
    }
}
