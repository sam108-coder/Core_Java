package constructor;

public class Animal2 {
    int age;
    String color;

    Animal2(int age1, String color1) {
        this.age = age1;
        this.color = color1;
    }

    void eat() {
        System.out.println("I am eating");
    }

    void run() {
        System.out.println("I am running");
    }

    public static void main(String[] args) {
        Animal2 buzo = new Animal2(10, "brown");
        System.out.println("Age : " + buzo.age);
        System.out.println("Color : " + buzo.color);
        buzo.eat();
        buzo.run();
        System.out.println("--------------------------");

        Animal2 cat = new Animal2(20, "BLACK");
        System.out.println("Age : " + cat.age);
        System.out.println("Color : " + cat.color);
        cat.eat();
        cat.run();


    }
}
