package library2;

import java.util.*;

public class SortWithLambda {
	public static void main(String[] args) {
		ArrayList<MyTime> times = new ArrayList();
		times.add(new MyTime(10, 10, 20));
		times.add(new MyTime(5, 30, 20));
		times.add(new MyTime(20, 5, 10));
		Collections.sort(times, (t1, t2) -> t1.totalSeconds() - t2.totalSeconds());
		for (MyTime t : times)
			System.out.println(t.toString());
		// Method reference 
		Collections.sort(times, MyTime::compare);
		for (MyTime t : times)
			System.out.println(t.toString());
	}
}