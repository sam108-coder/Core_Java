package basicConcept;

// 1-D
public class Test1 {
    int rollNo1;
    int[] rollNo2;

    public static void main(String[] args) {
        int[] a = new int[3]; // creation
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;

        int[] b = {10, 20, 30};
        System.out.println("Array Length : " + b.length);
        System.out.println("--------------------------");

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

    }
}
