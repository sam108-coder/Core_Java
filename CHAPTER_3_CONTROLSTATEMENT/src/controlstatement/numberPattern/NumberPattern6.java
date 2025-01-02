package controlstatement.numberPattern;

public class NumberPattern6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            int k = 4;
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k = k - 1;
            }
            System.out.println();
        }
    }
}
