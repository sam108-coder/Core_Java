package string.logical;

public class RearrangeDigits1 {
    public static void main(String[] args) {
        String input = "32400121200";
        String formattedOutput = String.format("%011d", Long.parseLong(input));
        System.out.println("Formatted output : " + formattedOutput);
    }
}
