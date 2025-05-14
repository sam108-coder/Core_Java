package string.logical;

import java.util.Scanner;

public class SeparateAplhaAndNumeric {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string : "); //Subbu123raj
        String input = scanner.nextLine();
        System.out.println("Original String is : " + input);
        separateAplhaAndNumeric(input);
    }

    private static void separateAplhaAndNumeric(String input) {
        StringBuilder alphaPart = new StringBuilder();
        StringBuilder numericPart = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                alphaPart.append(ch);
            } else {
                numericPart.append(ch);
            }
        }
        System.out.println("Output in Alpha : " + alphaPart.toString());
        System.out.println("Output in Numeric : " + numericPart.toString());
    }
}
