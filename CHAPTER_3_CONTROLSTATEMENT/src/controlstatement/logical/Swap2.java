package controlstatement.logical;

// without using 3rd variable
public class Swap2 {
    public static void main(String[] args) {
        int no1 = 10, no2 = 20;

        no1 = no1 + no2;
        no2 = no1 - no2;
        no1 = no1 - no2;
        System.out.println("No1 : " + no1);
        System.out.println("No2 : " + no2);
    }
}
