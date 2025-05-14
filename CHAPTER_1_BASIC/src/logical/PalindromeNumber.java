package logical;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome");
        } else {
            System.out.println(number + " is not a palindrome");
        }
    }

    private static boolean isPalindrome(int num) {
        int originalNumber = num;
        int reverseNumber = 0;
        while (num != 0) {
            int digit = num % 10;
            reverseNumber = reverseNumber * 10 + digit;
            num = num / 10;
        }
        return originalNumber == reverseNumber;
    }


}
