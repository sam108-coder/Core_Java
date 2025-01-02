package controlstatement.logical;

// check prime no between 1 - 100
public class PrimeNumber2 {
    public static void main(String[] args) {
        for (int no = 2; no <= 100; no++) {
            boolean b = false;
            for (int i = 2; i < no; i++) {
                if (no % i == 0) {
                    b = true;
                }
            }
            if (b == false) {
                System.out.print(" " + no);
            }
        }
    }
}
