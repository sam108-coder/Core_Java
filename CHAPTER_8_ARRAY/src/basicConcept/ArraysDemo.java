package basicConcept;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] a = {40, 20, 80, 50, 10, 90};
        Arrays.sort(a);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
