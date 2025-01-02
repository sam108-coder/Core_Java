package logical;

public class BubbleSort {

    static void sortingAlgo(int[] a) {
        for (int pass = 0; pass < a.length; pass++) {
            int temp;
            boolean b = false;
            for (int i = 0; i < a.length - 1 - pass; i++) {
                if (a[i] > a[i + 1]) {
                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    b = true;
                }
            }
            if (b == false) {
                break;
            }
        }
        System.out.println("Final List");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 90, 80};
        BubbleSort.sortingAlgo(arr);
    }
}
