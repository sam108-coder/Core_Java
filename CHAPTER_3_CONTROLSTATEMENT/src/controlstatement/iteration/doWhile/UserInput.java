package controlstatement.iteration.doWhile;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name : ");
        String name = sc.next();
        System.out.println("Your name is : " + name);
        System.out.println("******************************");

        System.out.println("Enter Your Pin No");
        int pin = sc.nextInt();
        System.out.println("Your Pin No is : " + pin);

    }
}
