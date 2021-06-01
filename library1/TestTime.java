package library1;

class Time {
	private int hours, mins, secs;

	public Time(int hours, int mins, int secs) {
		this.hours = hours;
		this.mins = mins;
		this.secs = secs;
	}
}

public class TestTime {
	public static void main(String[] args) {
		Time t1 = new Time(10, 20, 30);
		Time t2 = new Time(10, 20, 30);

		System.out.println(t1.toString());
		System.out.println(t2.equals(t1));
	}
}