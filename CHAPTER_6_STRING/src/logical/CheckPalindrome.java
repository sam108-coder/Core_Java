package logical;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.next();

        //    String str = "abcba";   // hard coded

        int leng = str.length();
        String rev = "";

        for (int i = leng - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if (str.equals(rev)) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is Not Palindrome");
        }
    }
}
