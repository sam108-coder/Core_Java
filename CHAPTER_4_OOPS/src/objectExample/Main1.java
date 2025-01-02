package objectExample;

public class Main1 {

    public static void main(String[] args) {
        Animal buzo = new Animal();
        buzo.eat();

        Birds crow = new Birds();
        crow.fly();
    }
}
class Birds {
    void fly() {
        System.out.println("I am flying");
    }
}

class Animal {
    void eat() {
        System.out.println("I am eating");
    }
}

