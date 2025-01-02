package keywords.thisKeyword;

public class ThisDemo6 {
    ThisDemo6() {
        this(10);
        System.out.println("1");
        //   this(10); // Call to 'this()' must be first statement in constructor body
    }

    ThisDemo6(int no) {
        System.out.println(no);
    }

    public static void main(String[] args) {
        ThisDemo6 ob = new ThisDemo6();
    }
}
