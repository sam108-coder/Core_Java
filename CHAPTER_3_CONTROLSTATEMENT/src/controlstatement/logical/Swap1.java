package controlstatement.logical;

// using 3rd variable
public class Swap1 {
    public static void main(String[] args) {

        int no1 = 10;
        int no2 = 20;

        int temp = no1;
        no1 = no2;
        no2 = temp;
        System.out.println("No1 : " + no1);
        System.out.println("No2 : " + no2);

    }
}
