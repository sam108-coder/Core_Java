package logical;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :");
        int number = scanner.nextInt();
        int sumOfDigits = calculateSumOfDigits(number);
        System.out.println("Sum of digits of " + number + " is : " + sumOfDigits);
    }

    private static int calculateSumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        return sum;
    }
}
