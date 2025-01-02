package is_A_Relationship.singleInheritance;

class Animal {
    void eat() {
        // ---1000 lines of code----
        System.out.println("I am eating");
        // ---1000 lines of code----

    }
}

class Humans extends Animal {

}

public class InheritanceMain1 {
    public static void main(String[] args) {
        Humans h = new Humans();
        h.eat();
    }
}
