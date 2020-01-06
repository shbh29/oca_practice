package calender;

import java.io.*;
import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

class BirthdayFacts {
	public static void main(String...args) {
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate bday = null;
		try {
		/**
		 * take birthday in format yyyy-MM-dd
		 * find out how many days I have lived.
		 * find out days passed since 2000-01-01
		 * find out when I will be completing 30000 days
		 */
			bday = LocalDate.parse(args[0], f);	
		} catch(java.time.DateTimeException e) {
			e.printStackTrace();
		}
		System.out.println("your birthday is on"+bday+", day was: "+bday.getDayOfWeek());
		
		Period p1 = Period.between(bday, LocalDate.now());
		System.out.println("I have lived for "+ p1.getYears()+ "years "+p1.getMonths()+" months "+p1.getDays());
		
		System.out.println("You have lived for "+bday.until(LocalDate.now(), ChronoUnit.DAYS)+" days, so far");
		System.out.println("You will complete 30,000 days on "+bday.plusDays(30_000));
		
		LocalDate d2000 = LocalDate.of(2_000, 1, 1);
		Period p2 = Period.between(d2000, LocalDate.now());
		System.out.println("Period since 2K "+p2);		
		
	}
}
