package tryCatchFinally;

public class TryCatchFinally3 {
    public static void main(String[] args) {
        System.out.println("1");
        try {
            System.out.println(100 / 0);
            System.out.println("2");
        } finally {
            System.out.println("4");
        }

        // 'catch' without 'try'
        /*catch(Exception e){
            System.out.println("3");
        }*/
        System.out.println("5");
    }
}
