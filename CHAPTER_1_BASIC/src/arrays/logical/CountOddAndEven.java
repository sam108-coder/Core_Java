package arrays.logical;

public class CountOddAndEven {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13};

        int[] count = countOddAndEven(array);

        System.out.println("Even numbers count : " + count[1]);
        System.out.println("Odd numbers count : " + count[0]);
    }

    private static int[] countOddAndEven(int[] array) {
        int[] count = new int[2];
        for (int num : array) {
            if (num % 2 == 0) {
                count[1]++;
            } else {
                count[0]++;
            }
        }
        return count;

    }
}
