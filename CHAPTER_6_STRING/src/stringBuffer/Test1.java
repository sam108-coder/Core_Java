package stringBuffer;

public class Test1 {
    public static void main(String[] args) {
        String name = "deepak";
        name.concat("java");
        System.out.println(name);

        System.out.println("**********************");

        StringBuffer sb = new StringBuffer("deepak");
        sb.append("java");
        System.out.println(sb);

        System.out.println("**********************");

        System.out.println(sb.insert(3, "abc"));
    }
}
