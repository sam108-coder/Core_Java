package voting;

import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your Age : ");
        int age = s.nextInt();

        if (age <= 18) {
            try {
                throw new InvalidAgeException("You can not vote as your age is below 18 ");
            } catch (InvalidAgeException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("You can vote now...!!!");
        }
        System.out.println("--------Thank You--------");

    }
}
