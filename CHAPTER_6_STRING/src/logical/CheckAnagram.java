package logical;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First String : ");
        String str1 = sc.next();

        System.out.println("Enter Second String : ");
        String str2 = sc.next();

        //    String str1 = "keep";
        //    String str2 = "peek";

        char[] ch1 = str1.toLowerCase().toCharArray();
        char[] ch2 = str2.toLowerCase().toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if (Arrays.equals(ch1, ch2)) {
            System.out.println("Two Strings are Anagram");
        } else {
            System.out.println("Two Strings are Not Anagram");
        }
    }
}
