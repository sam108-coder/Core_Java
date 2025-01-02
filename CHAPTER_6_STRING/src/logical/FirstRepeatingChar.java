package logical;

public class FirstRepeatingChar {
    public static void main(String[] args) {
        String str = "this is dmeho";
        str = str.replaceAll("\s", "");
        System.out.println(str);

        int[] arr = new int[126];

        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)] = arr[str.charAt(i)] + 1;
        }
        char c = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (arr[str.charAt(i)] > 1) {
                c = str.charAt(i);
                break;
            }
        }
        System.out.println("First Repeated Character is : " + c);
    }
}
