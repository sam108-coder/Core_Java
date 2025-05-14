package string.logical;

import java.util.Scanner;

public class EvenIndexedCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String input = scanner.nextLine();

        System.out.println("Even indexed character in \"" + input + "\":");
        printEvenIndexedCharacters(input);
    }

    private static void printEvenIndexedCharacters(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                System.out.print(str.charAt(i));
            }
        }
    }
}
