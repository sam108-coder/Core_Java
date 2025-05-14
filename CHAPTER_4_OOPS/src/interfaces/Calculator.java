package interfaces;

import java.util.Scanner;

public interface Calculator {
    void add();

    void sub();
}

class MyCalculator1 implements Calculator {

    @Override
    public void add() {
        int a = 20;
        int b = 10;
        int c = a + b;
        System.out.println(c);
    }

    @Override
    public void sub() {
        int a = 20;
        int b = 10;
        int c = a - b;
        System.out.println(c);
    }
}

class MyCalculator2 implements Calculator {

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int a = scanner.nextInt();
        System.out.println("Enter the second number :");
        int b = scanner.nextInt();
        int c = a + b;
        System.out.println(c);
    }

    @Override
    public void sub() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int a = scanner.nextInt();
        System.out.println("Enter the second number :");
        int b = scanner.nextInt();
        int c = a - b;
        System.out.println(c);
    }
}

class MyCalculator3 implements Calculator {

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int a = scanner.nextInt();
        System.out.println("Enter the second number :");
        int b = scanner.nextInt();
        if (b == 0) {
            System.out.println("Second number is zero");
        } else {
            int c = a + b;
            System.out.println(c);
        }
    }

    @Override
    public void sub() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int a = scanner.nextInt();
        System.out.println("Enter the second number :");
        int b = scanner.nextInt();
        if (b == 0) {
            System.out.println("Second number is zero");
        } else {
            int c = a - b;
            System.out.println(c);
        }
    }
}

class Demo {
    public static void main(String[] args) {
        MyCalculator1 myCalculator1 = new MyCalculator1();
        MyCalculator2 myCalculator2 = new MyCalculator2();
        MyCalculator3 myCalculator3 = new MyCalculator3();

        myCalculator1.add();
        myCalculator1.sub();
        myCalculator2.add();
        myCalculator2.sub();
        myCalculator3.add();
        myCalculator3.sub();
    }
}