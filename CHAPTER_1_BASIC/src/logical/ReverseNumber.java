package logical;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int no, rev = 0, rem;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number : ");
        no = scanner.nextInt();

        while (no > 0) {
            rem = no % 10;
            rev = rev * 10 + rem;
            no = no / 10;

        }
        System.out.println("Reverse : " + rev);
    }
}
