package controlstatement.iteration.whileLoop;

public class ReverseNo {
    public static void main(String[] args) {
        int no = 5673;
        int temp = no;
        int rem, rev = 0;

        while (temp != 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        System.out.println("Reverse of " + no + " is " + rev);
    }
}
