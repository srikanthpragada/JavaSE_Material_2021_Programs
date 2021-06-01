package library1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatterExample {
	public static void main(String[] args) {
		DateTimeFormatter df = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		LocalDate today = LocalDate.now();
		System.out.println(today.format(df));

		DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("dd-MM-uuuu");
		LocalDate transDate = LocalDate.parse("24-10-1998", inputFormat);
		System.out.println(transDate);

		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MMM-uuuu H:m:s");
		System.out.println(LocalDateTime.now().format(format));
	}
}