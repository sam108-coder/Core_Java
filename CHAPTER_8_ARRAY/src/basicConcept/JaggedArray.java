package basicConcept;

public class JaggedArray {
    public static void main(String[] args) {
        int[][] a = new int[3][];
        a[0] = new int[4];
        a[1] = new int[3];
        a[2] = new int[5];
        a[0][0] = 10;

        int[][] b = {{10, 20, 30, 40}, {50, 60, 70}, {80, 90, 100, 200, 300}};
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
//        System.out.println(b);
//        System.out.println(a[0]);
    }
}
