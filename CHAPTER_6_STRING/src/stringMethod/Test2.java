package stringMethod;

public class Test2 {
    public static void main(String[] args) {
        String str1 = "Deepak@gmail.com";
        String str2 = "deepak123";
        System.out.println(str1.equals(str2));

        if (str1.equalsIgnoreCase("deepak@gmail.com") && str2.equals("deepak123")) {
            System.out.println("Login Successfully");
        } else {
            System.out.println("Failed");
        }

        System.out.println("***********************************************");

        String str3 = "a";
        String str4 = "A";
        System.out.println(str3.compareToIgnoreCase(str4));

        System.out.println("***********************************************");

        char c1 = 'a';
        char c2 = 'A';
        System.out.println((int) c2);

        System.out.println("***********************************************");

        String str5 = "deepak";
        String str6 = "java";
        System.out.println(str5 + str6);
        System.out.println(str5.concat(str6));

        System.out.println("***********************************************");

        String str7 = "deepak java";
        System.out.println(str7.substring(3, 8));
        System.out.println(str7.subSequence(3, 8));

        System.out.println("***********************************************");

        String str8 = "deepak java";
        System.out.println(str8.replace("e", "x"));

        System.out.println("***********************************************");

        String str9 = "deepak is teaching java";
        System.out.println(str9.lastIndexOf("is"));
        System.out.println(str9.contains("ep"));
        System.out.println(str9.charAt(7));
        System.out.println(str9.startsWith("deea"));
        System.out.println(str9.startsWith("dee"));
        System.out.println(str9.endsWith("java"));

        System.out.println("***********************************************");

        String str10 = "Deepak Kumar";
        System.out.println(str10.toLowerCase());
        System.out.println(str10.toUpperCase());

        System.out.println("***********************************************");

        int rollNo = 1001;
        System.out.println(String.valueOf(rollNo).length());

        String str11 = "deepak";
        char[] c = str11.toCharArray();
        System.out.println(str11.replaceFirst("e", "z"));
        System.out.println(str11.replaceAll("e", "z"));

        System.out.println("***********************************************");

        String str12 = "this is my first demo";
        String[] str13 = str12.split("is");
        for (String s : str13) {
            System.out.println(s);
        }

    }
}
