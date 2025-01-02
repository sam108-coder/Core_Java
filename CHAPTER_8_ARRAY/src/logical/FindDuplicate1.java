package logical;

public class FindDuplicate1 {
    public static void main(String[] args) {
        int[] arr = {40, 30, 70, 90, 60, 10, 30, 70};
        int temp;

        for (int p = 0; p < arr.length - 1; p++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        //match the elements
        System.out.println("Duplicate Elements are : ");
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.println(arr[i]);
            }
        }


    }
}
