package basicConcept;

public class DifferentWaysToPrintArray {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40};

        // Way 1
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();


        System.out.println("-----Backward Direction-----");
        // iterate the elements in backward direction
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("----------------------------");

        // Way 2 (while loop)
        int j = 0;
        while (j < a.length) {
            System.out.print(a[j] + " ");
            j++;
        }
        System.out.println();
        System.out.println("----------------------------");

        //Way 3 (for each loop)
        for (int v : a) {
            System.out.print(v + " ");
        }

        System.out.println();
        System.out.println("----------------------------");

        String[] str={"deepak","amit","deepesh"};
        for(String s:str){
            System.out.println(s);
        }
    }
}
