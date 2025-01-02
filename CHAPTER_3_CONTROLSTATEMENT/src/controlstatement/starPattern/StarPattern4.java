package controlstatement.starPattern;

public class StarPattern4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int k = 2; k <= i; k++) {
                System.out.print(" ");
            }
            for (int l = 4; l >= i; l--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
