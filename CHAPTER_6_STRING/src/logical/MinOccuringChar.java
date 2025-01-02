package logical;

import java.util.Scanner;

public class MinOccuringChar {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.next();

    //    String str = "adbccbdcddcc";
        int[] arr = new int[126];

        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)] = arr[str.charAt(i)] + 1;
        }

        int min = str.length();
        char c = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (min > arr[str.charAt(i)]) {
                min = arr[str.charAt(i)];
                c = str.charAt(i);
            }
        }
        System.out.println("Minimum Repeated Character is : " + c);
    }
}
