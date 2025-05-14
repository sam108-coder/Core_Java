package logical;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of terms: ");
        int number = scanner.nextInt();

        int first = 0, second = 1, next;
        System.out.print("Fibonacci series is: ");
        for (int i = 0; i <= number; i++) {
            System.out.print(first + " ");
            next = second + first;
            first = second;
            second = next;
        }
    }
}
