package logical;

public class FindDuplicate2 {
    public static void main(String[] args) {
        int[] arr = {40, 30, 70, 90, 60, 10, 30, 70 };
        int count = 0;
        System.out.println("Duplicate Elements are : ");

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count = count + 1;
                    System.out.println(count + " : " + arr[i]);
                }
            }
        }
    }
}
