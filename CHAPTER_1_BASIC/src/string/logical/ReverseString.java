package string.logical;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string :");
        String input = scanner.next();
        char ch;
        String revString = " ";
        for (int i = 0; i < input.length(); i++) {
            ch = input.charAt(i);
            revString = ch + revString;
        }
        System.out.println("Reversed String is : " + revString);
    }
}
