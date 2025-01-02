package constructor;

public class Animal1 {

    int age;
    String color;

    void eat() {
        System.out.println("I am eating");
    }

    void run() {
        System.out.println("I am running");
    }

    public static void main(String[] args) {
        Animal1 buzo = new Animal1();
//        buzo.age = 10;
//        buzo.color = "black";
        System.out.println("Age : " + buzo.age);
        System.out.println("Color : " + buzo.color);
        buzo.eat();
        buzo.run();
        System.out.println("---------------------");

        Animal1 cat = new Animal1();
        cat.age = 5;
        cat.color = "brown";
        System.out.println("Age :" + cat.age);
        System.out.println("Color : " + cat.color);
        cat.eat();
        cat.run();

    }


}
