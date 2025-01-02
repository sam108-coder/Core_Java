package logical;

public class CountString {
    public static void main(String[] args) {
        String str = "this is my first\n demo\t";
        int count = 0;
        boolean b = true;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' || str.charAt(i) == '\t' || str.charAt(i) == '\n') {
                b = true;
            } else if (b == true) {
                b = false;
                count++;
            }
        }
        System.out.println("Total number of Words : " + count);
    }
}
