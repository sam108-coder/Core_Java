package arrays.logical;

import java.util.Scanner;

public class MinMaxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array : ");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the element of the array : ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        //    int[] array = {5, 2, 9, 1, 6, 3};


        int max = findMaximum(array);
        int min = findMinimum(array);

        System.out.println("Minimum value in the array : " + min);
        System.out.println("Maximum value in the array : " + max);
        sc.close();
    }

    private static int findMinimum(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    private static int findMaximum(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
