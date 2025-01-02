package controlstatement.iteration.whileLoop;

// WAP to get number of digit in integer value
public class CalIntegerDigits {
    public static void main(String[] args) {
        int no = 5673;
        int length = 0;
        int temp = no;

        while (temp != 0) {
            length = length + 1;
            temp = temp / 10;
        }
     //   System.out.println("Length is : " + length);

        System.out.println("Length of : " + no + " is " + length);
    }
}
