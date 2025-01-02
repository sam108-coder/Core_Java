package logical;

public class CheckNoEvenOdd2 {
    public static void main(String[] args) {
        int[] arr = {2, 6, 1, 5, 9, 3};


        int even_count = 0, odd_count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even_count += 1;
            } else {
                odd_count += 1;
            }
        }


        int[] even_arr = new int[even_count];
        int[] odd_arr = new int[odd_count];

        int even_index_pos = 0, odd_index_pos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even_arr[even_index_pos] = arr[i];
                even_index_pos += 1;
            } else {
                odd_arr[odd_index_pos] = arr[i];
                odd_index_pos += 1;
            }
        }
        for (int i = 0; i < even_arr.length; i++) {
            System.out.print(even_arr[i] + " ");
        }
        System.out.println();
        System.out.println("-----------------------------------------");
        for (int i = 0; i < odd_arr.length; i++) {
            System.out.print(odd_arr[i] + " ");
        }


    }
}
