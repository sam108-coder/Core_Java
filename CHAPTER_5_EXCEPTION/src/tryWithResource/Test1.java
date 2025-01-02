package tryWithResource;

import java.io.FileInputStream;

public class Test1 {
    public static void main(String[] args) {
        try (
                FileInputStream fis = new FileInputStream(" ");
        ) {
            fis.read();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
