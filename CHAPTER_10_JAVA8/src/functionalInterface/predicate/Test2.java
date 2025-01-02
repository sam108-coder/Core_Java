package functionalInterface.predicate;

interface I1 {
     boolean test(int no);
}

public class Test2 {
    public static void main(String[] args) {
        I1 ob = no -> no % 2 == 0;
        System.out.println(ob.test(13));
    }
}
