package logical;

import java.util.Scanner;

public class MaxOccuringChar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.next();

        //    String str = "this is demo";
        str = str.replace("\\s", " ");
        //    System.out.println(str);

        int[] arr = new int[126];

        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)] = arr[str.charAt(i)] + 1;
        }

        int max = -1;
        char c = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (max < arr[str.charAt(i)]) {
                max = arr[str.charAt(i)];
                c = str.charAt(i);
            }
        }
        System.out.println("Maximum Repeated Character is : " + c);
    }
}
