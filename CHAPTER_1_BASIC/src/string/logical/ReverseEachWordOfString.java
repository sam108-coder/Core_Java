package string.logical;

public class ReverseEachWordOfString {
    public static void main(String[] args) {
        reverseEachWordOfString("Java is good programming languages");
    }

    private static void reverseEachWordOfString(String inputString) {
        String[] words = inputString.split(" ");
        String reverseString = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String nStr = " ";
            char ch;
            for (int j = 0; j < word.length(); j++) {
                ch = word.charAt(j);
                nStr = ch + nStr;
            }
            reverseString = reverseString + nStr + "";
        }
        System.out.println(inputString);
        System.out.println(reverseString);
    }
}
