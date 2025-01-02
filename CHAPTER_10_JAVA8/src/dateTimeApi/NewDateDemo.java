package dateTimeApi;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Date;

public class NewDateDemo {

	public static void main(String[] args) {

		// Before JAVA 8
		Date date = new Date(); 
		System.out.println(date);

		LocalDate of=LocalDate.of(2021, 1, 20);
		System.out.println(of);
		
		// JAVA 8
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);

		localDate = localDate.plusDays(3);
		System.out.println(localDate);

		localDate = localDate.plusMonths(1);
		System.out.println(localDate);

		localDate = localDate.plusYears(2);
		System.out.println(localDate);

		boolean leapYear = LocalDate.parse("2024-10-30").isLeapYear();
		System.out.println(leapYear);

		boolean before = LocalDate.parse("2024-10-30").isBefore(LocalDate.parse("2025-10-30"));
		System.out.println("Before Date : " + before);

		LocalTime time = LocalTime.now();
		System.out.println(time);

		time = time.plusHours(2);
		System.out.println(time);

		time = time.plusMinutes(20);
		System.out.println(time);

		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);

		Period p = Period.ofDays(5);
		System.out.println(p.getDays());

		Period between = Period.between(LocalDate.parse("1998-10-20"), LocalDate.now());
		System.out.println(between);

		Duration duration = Duration.between(LocalTime.parse("09:00"), LocalTime.now());
		System.out.println(duration);

	}
}
