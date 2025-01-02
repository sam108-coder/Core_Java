package objectExample;

public class Animal1 {
    int age = 10;
    String color = "black";

    void eat() {
        System.out.println("I am eating");
    }

    public static void main(String[] args) {
//        System.out.println("hello");
        Animal1 buzo = new Animal1();
        System.out.println("Age : " + buzo.age);
        System.out.println("Color : " + buzo.color);
        buzo.eat();
    }
}
