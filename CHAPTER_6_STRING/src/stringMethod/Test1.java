package stringMethod;

public class Test1 {
    public static void main(String[] args) {
        String str1 = new String("deepak");
        String str2 = "deepak";
        int length = str2.length();
        System.out.println(str2.length());

        System.out.println(str2.isEmpty());

        String str = "      deepak      Kumar      ";
        System.out.println(str);
        System.out.println(str.trim());
    }
}
