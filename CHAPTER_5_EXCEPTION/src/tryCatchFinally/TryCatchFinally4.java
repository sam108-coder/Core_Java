package tryCatchFinally;

public class TryCatchFinally4 {
    public static void main(String[] args) {
        System.out.println("1");
        try {
            System.out.println(100 / 0);
            System.out.println("2");
        }
        // 'try' without 'catch', 'finally' or resource declarations
        //    System.out.println("hi");
        catch (Exception e) {
            System.out.println("3");
        }
        System.out.println("hi");

        // 'finally' without 'try'
       /* finally{
            System.out.println("4");
        }*/
        System.out.println("5");
    }
}
