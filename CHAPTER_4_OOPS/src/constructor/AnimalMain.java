package constructor;

import objectExample.Animal3;

class Animal {
    int age;
    String legs;
}

public class AnimalMain {
    public static void main(String[] args) {
        Animal buzo = new Animal();
        System.out.println(buzo);
        System.out.println(buzo.hashCode());
        System.out.println("---------------------------");

        Animal cat = new Animal();
        System.out.println(cat);
        System.out.println(cat.hashCode());
    }

}
