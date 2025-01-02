package keywords.thisKeyword;

public class ThisDemo5 {
    ThisDemo5() {
        System.out.println("1");
    }

    ThisDemo5(int no) {
        this();
        System.out.println("2");
    }

    public static void main(String[] args) {
        ThisDemo5 ob = new ThisDemo5();

        ThisDemo5 ob1 = new ThisDemo5(22);
    }
}
