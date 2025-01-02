package tryCatchBlock;

public class TryCatch12 {
    public static void main(String[] args) {
        System.out.println("1");
        try {
            System.out.println("2");
            System.out.println(100 / 0);
        }
        // incompatible types: java.lang.Object cannot be converted to java.lang.Throwable
        /*catch (Object e) {
            System.out.println("3");
        }*/

        catch (Exception e){

        }
        System.out.println("4");
    }
}
