package logical;

import java.util.Arrays;

public class RemoveAllDuplicate {
    public static void main(String[] args) {
        String str = "deepak java";
        char[] ch = str.toCharArray();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (ch[i] == ch[i]) {
                    break;
                }
            }
            if (i == j) {
                ch[count] = ch[i];
                count++;
            }
        }
        /*System.out.println(ch);
        while (count < str.length()) {
            ch[count] = ' ';
            count++;
        }
        System.out.println(ch);*/

        // By Predefined Method
        String newStr = String.valueOf(Arrays.copyOf(ch, count));
        System.out.println(newStr);
    }
}
