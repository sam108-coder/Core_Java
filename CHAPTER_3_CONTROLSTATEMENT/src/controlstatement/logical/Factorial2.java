package controlstatement.logical;

import java.util.Scanner;

// using recursion
public class Factorial2 {

    static int fact = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int no = sc.nextInt();

    //    int no = 5;
        Factorial2 obj = new Factorial2();
        obj.calFact(no);
        System.out.println("Factorial of " + no + " is " + fact);

    }

    void calFact(int no) {
        if (no >= 1) {
            fact = fact * no;
            no = no - 1;
            calFact(no);
        }
    }
}
