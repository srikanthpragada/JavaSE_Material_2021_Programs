package library1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatExample {
	public static void main(String[] args) {
		Date d = new Date();
		DateFormat df = DateFormat.getTimeInstance(DateFormat.FULL);
		System.out.println(df.format(d));
		DateFormat tf = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(tf.format(d));

		SimpleDateFormat sdf = new SimpleDateFormat("d-MMM-yy HH:mm:ss");
		System.out.println(sdf.format(d));
	}
}