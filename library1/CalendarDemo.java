package library1;

import java.util.*;

public class CalendarDemo {
	public static void main(String[] args) throws Exception {
		//Get system date and time
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, 10);
		System.out.printf("Year :%d Month:%d Day:%d", cal.get(Calendar.YEAR), cal.get(Calendar.MONTH),
				cal.get(Calendar.DAY_OF_MONTH));
	}
}