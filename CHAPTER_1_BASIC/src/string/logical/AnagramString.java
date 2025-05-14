package string.logical;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine().replaceAll("\\s", "").toLowerCase(); // Convert to lowercase for case-insensitive check

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine().replaceAll("\\s", "").toLowerCase();

        System.out.println(areAnagrams(str1, str2) ? "Anagrams" : "Not Anagrams");
        scanner.close();
    }

    private static boolean areAnagrams(String str1, String str2) {
        // Quick length check
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert to character arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }
}
