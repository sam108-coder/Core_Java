package mapInterface.hashTable;

public class Test2 {
    public static void main(String[] args) {
        Test2 t = new Test2();
        System.out.println(t.hashCode());

        Test2 t2 = new Test2();
        System.out.println(t2.hashCode());

        Integer i1 = new Integer(110);
        System.out.println(i1.hashCode());

        String str1 = new String("amit");
        System.out.println(str1.hashCode());
    }
}
