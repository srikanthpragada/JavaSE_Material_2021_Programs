package library1;

// class to override methods in Object class
class Time1 {
	private int hours, mins, secs;

	public Time1(int hours, int mins, int secs) {
		this.hours = hours;
		this.mins = mins;
		this.secs = secs;
	}

	public int getTotalSeconds() {
		return hours * 60 * 60 + mins * 60 + secs;
	}

	@Override
	public int hashCode() {
		return hours;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Time) {
			Time1 t = (Time1) obj;
			return t.getTotalSeconds() == this.getTotalSeconds();
		} else
			return false;
	}

	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d", hours, mins, secs);
	}
}

public class TestTime1 {
	public static void main(String[] args) {
		Time t1 = new Time(10, 20, 30);
		Time t2 = new Time(10, 20, 30);
		Time t3 = new Time(15, 15, 15);

		System.out.println(t1.toString());
		System.out.println(t1.equals(t2));
		System.out.println(t1.equals(t3));
	}
}