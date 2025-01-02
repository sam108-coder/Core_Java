package dateTimeApi;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) throws Exception {

		Date date = new Date();
		System.out.println(date);

		// Converting Date to String
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MMMM/yyyy");
		String format1 = sdf1.format(date);
		System.out.println(format1);

		SimpleDateFormat sdf2 = new SimpleDateFormat("MM/dd/yyyy");
		String format2 = sdf2.format(date);
		System.out.println(format2);

		// converting String to Date
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");
		Date parseDate = sdf3.parse("2024-10-30");
		System.out.println(parseDate);
		
		
		java.sql.Date d=new java.sql.Date(20221222);
		System.out.println(d);

	}

}
