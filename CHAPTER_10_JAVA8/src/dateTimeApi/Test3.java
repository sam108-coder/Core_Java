package dateTimeApi;

import java.time.Year;
import java.time.YearMonth;

public class Test3 {
    public static void main(String[] args) {
        Year y = Year.now();
        System.out.println(y);

        System.out.println(y.atDay(100));
        System.out.println(y.length());

        YearMonth ym=YearMonth.now();
        System.out.println(ym);
    }
}
