package p1;


// wap to find reverse string
public class Test3 {
    public static void main(String[] args) {

        String str1 = "Kumar";
        String rev = "";

        for (int i = str1.length() - 1; i >= 0; i--) {
            rev += str1.charAt(i);
        }

        System.out.println("Reverse string : " + rev);


    }


}
