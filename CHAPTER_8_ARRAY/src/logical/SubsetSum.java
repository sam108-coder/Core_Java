package logical;

public class SubsetSum {

    public static boolean isSubsetSum(int[] arr, int n, int sum) {
        // Base Cases
        if (sum == 0)
            return true;
        if (n == 0)
            return false;

        if (arr[n - 1] > sum)
            return isSubsetSum(arr, n - 1, sum);
        return isSubsetSum(arr, n - 1, sum) || isSubsetSum(arr, n - 1, sum - arr[n - 1]);
    }

    public static void main(String[] args) {
        int[] arr = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        int n = arr.length;
        if (isSubsetSum(arr, n, sum))
            System.out.println("Found a subset" + " with given sum");
        else
            System.out.println("No subset with" + " given sum");
    }
}

