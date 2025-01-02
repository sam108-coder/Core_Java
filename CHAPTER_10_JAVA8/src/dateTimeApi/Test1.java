package dateTimeApi;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
    public static void main(String[] args) {

        System.out.println("----Old Before JDK 7----");
        Date d = new Date();
        System.out.println(d);

        System.out.println("----From JDK 8----");
        Date d1 = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/YY");
        String current_date = sdf1.format(d1);
        System.out.println("Current Date : " + current_date);

        SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
        String current_time = sdf2.format(d1);
        System.out.println("Current Time : " + current_time);


    }
}
