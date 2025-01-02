package lambdaExp;

interface I7 {
    int getLength(String name);
}

public class Test7 {
    public static void main(String[] args) {
        I7 i = (name) -> {
            int leng = name.length();
            return leng;
        };
        System.out.println(i.getLength("King Kohli"));

        System.out.println("--------------------");

        int l = i.getLength("deepak");
        System.out.println("Length is : " + l);

        System.out.println("--------------------");

        I7 i2 = (name) -> name.length();
        System.out.println(i2.getLength("deepesh"));

    }
}
