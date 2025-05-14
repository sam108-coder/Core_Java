package string.logical;

import java.util.Scanner;

public class PermutationOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String :");
        String str = scanner.nextLine();

        permute(str, "");
    }

    private static void permute(String str, String s) {

        str = str.replaceAll("\\s+", "").toLowerCase();

        if (str.length() == 0) {
            System.out.println(s);
        } else {
            for (int i = 0; i < str.length(); i++) {
                String rem = str.substring(0, i) + str.substring(i + 1);
                permute(rem, s + str.charAt(i));
            }
        }
    }
}
