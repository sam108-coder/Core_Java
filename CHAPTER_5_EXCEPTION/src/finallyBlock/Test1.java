package finallyBlock;

import java.io.FileInputStream;

public class Test1 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(" ");
            fis.read();
            System.out.println(100 / 0);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                fis.read();
            } catch (Exception e) {
                System.out.println(e);

            }
        }
    }
}
