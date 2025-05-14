package string.logical;

import java.util.Scanner;

public class RearrangeDigits {
    public static void main(String[] args) {
        String input = "324XZ1212LM";

        String output = rearrangeDigits(input);
        System.out.println("Output : " + output);
    }

    private static String rearrangeDigits(String input) {
        StringBuilder digits = new StringBuilder();
        StringBuilder nonDigits = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                digits.append(c);
            } else {
                nonDigits.append(c);
            }
        }
        return digits.toString() + " " + nonDigits.toString();
    }
}
