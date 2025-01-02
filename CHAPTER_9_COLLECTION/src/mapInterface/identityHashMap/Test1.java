package mapInterface.identityHashMap;

public class Test1 {
    public static void main(String[] args) {
        int i1 = 10;
        int i2 = 10;
//        System.out.println(System.identityHashCode(i1));
//        System.out.println(System.identityHashCode(i2));

        System.out.println(i1 == i2);

        System.out.println("----------");

        Integer i11 = new Integer(100);
        Integer i22 = new Integer(100);
//        System.out.println(System.identityHashCode(i11));
//        System.out.println(System.identityHashCode(i22));

        System.out.println(i11 == i22);
        System.out.println(i11.equals(i22));

        System.out.println("----------");

        String str1 = "deepak";
        String str2 = "rahul";
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        System.out.println("----------");

        String str11 = new String("deepak");
        String str22 = new String("ddepak");
        System.out.println(System.identityHashCode(str11));
        System.out.println(System.identityHashCode(str22));
        System.out.println(str11 == str22);
        System.out.println(str11.equals(str22));

        System.out.println("----------");

        Test1 t1 = new Test1();
        Test1 t2 = new Test1();
        System.out.println(System.identityHashCode(t1));
        System.out.println(System.identityHashCode(t2));
        System.out.println(t1 == t2);
        System.out.println(t1.equals(t2));
    }
}
