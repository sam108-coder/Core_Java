package stringMethod;

public class Test3 {

    public static void main(String[] args) {
        String str1 = new String("deepak");
        String str2 = new String("deepak");

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));

        System.out.println(str1 == str2); // false - address comparison
        System.out.println(str1.equals(str2)); // true - content  comparison

        System.out.println("***********************************");

        String name1 = "rahul";
        String name2 = "rahul";
        System.out.println(System.identityHashCode(name1));
        System.out.println(System.identityHashCode(name2));

        System.out.println(name1 == name2); // true
        System.out.println(name1.equals(name2)); // true


    }
}
