package basicConcept;

public class TwoDiArray {
    public static void main(String[] args) {
        TwoDiArray ob = new TwoDiArray();
        System.out.println(ob);
        int[] a = {10, 20, 30};
        System.out.println(a);

        System.out.println("------------------");

        int[][] b = {{10, 20, 30}, {40, 50, 60}};
        System.out.println(b);
        System.out.println(b[0]);
        System.out.println(b[0][0]);
        //    System.out.println(b[0][0][0]);
        System.out.println("------------------");
        System.out.println(b.length);
        System.out.println(b[0].length);
        //    System.out.println(b[0][0].length);

        System.out.println("------------------");

        int[][] c = {{11, 12, 13}, {14, 15, 16}};
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

    }
}
