package string.logical;

import java.util.Arrays;

public class ProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;  // Get the length of the input array
        int[] result = new int[n];  // Create an output array to store the final result

        // Step 1: Compute Left Product for each index
        result[0] = 1;  // The left product for the first element is always 1 (no left elements)

        // Iterate through the array to fill left products
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];  // Store the product of all elements to the left of index i
        }

        // Step 2: Compute Right Product and update the result array
        int rightProduct = 1;  // Initialize right product as 1 since there are no elements to the right initially

        // Traverse from right to left, updating the result array
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct;  // Multiply the stored left product by the right product
            rightProduct *= nums[i];  // Update right product to include the current element
        }

        return result;  // Return the final result array
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};  // Input array
        int[] output = productExceptSelf(nums);  // Call the function to compute the product array
        System.out.println(Arrays.toString(output));  // Print the output array
    }
}

