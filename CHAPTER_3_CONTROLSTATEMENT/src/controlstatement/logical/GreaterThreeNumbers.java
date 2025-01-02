package controlstatement.logical;

public class GreaterThreeNumbers {
    public static void main(String[] args) {
        int no1 = 100;
        int no2 = 202;
        int no3 = 503;

        if (no1 > no2 && no1 > no3) {
            System.out.println("No1 is Greater");
        } else if (no2 > no1 && no2 > no3) {
            System.out.println("No2 is Greater");
        } else {
            System.out.println("No3 is Greater");
        }
    }
}
