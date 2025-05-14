package string.logical;

import java.util.Scanner;

public class DoubleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String input = scanner.nextLine();

        String doubledString = doubleCharacters(input);
        System.out.println("Doubled character : " + doubledString);
    }

    private static String doubleCharacters(String str) {
        StringBuilder doubled = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            doubled.append(ch).append(ch);
        }
        return doubled.toString();
    }
}
