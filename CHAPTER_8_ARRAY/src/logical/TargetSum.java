package logical;

public class TargetSum {
    public static void main(String[] args) {
        int[] num = {2, 7, 11, 15, 11};
        int target = 18;
        boolean found = false;

        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] + num[j] == target) {
                    System.out.println("indices: " + i + "," + j);
                    found = true;
                    break;
                }
            }
            if (found) break;
        }
        if (!found) {
            System.out.println("No two sum solution");
        }
    }

}
