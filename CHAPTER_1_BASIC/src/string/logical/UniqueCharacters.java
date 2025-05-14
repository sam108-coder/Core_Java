package string.logical;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();  // Close scanner to prevent memory leaks

        System.out.println("Unique characters in \"" + input + "\":");
        printUniqueCharacters(input);
    }

    private static void printUniqueCharacters(String str) {
        Set<Character> uniqueChars = new LinkedHashSet<>(); // Maintains order of first appearance

        for (char ch : str.toCharArray()) {
            uniqueChars.add(ch); // Automatically handles uniqueness
        }

        // Print unique characters
        uniqueChars.forEach(ch -> System.out.print(ch + " "));
    }
}

