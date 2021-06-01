package library1;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class AgeCalculator {
	public static void main(String[] args) {
		System.out.print("Enter DOB [yyyy-mm-dd]:");
		Scanner s = new Scanner(System.in);
		String dobstr = s.nextLine();
		
		LocalDate dob = LocalDate.parse(dobstr);
		LocalDate now = LocalDate.now();
		long years = ChronoUnit.YEARS.between(dob, now);
	    System.out.println(years);
		Period p = Period.between(dob, now);
		System.out.printf("%d years, %d months and %d days old!\n", p.getYears(), p.getMonths(), p.getDays());
	}
}