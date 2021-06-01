package library2;

public class MyTime {
	private int hours, mins, secs;

	public MyTime(int hours, int mins, int secs) {
		this.hours = hours;
		this.mins = mins;
		this.secs = secs;
	}

	@Override
	 public String toString() {
		return "MyTime{" + "hours=" + hours + ", mins=" + mins + ", secs=" + secs + '}';
	 }

	public int totalSeconds() {
		return hours * 3600 + mins * 60 + secs;
	}

	public static int compare(MyTime t1, MyTime t2) {
		return t1.totalSeconds() - t2.totalSeconds();
	}

	public int getHours() {
		// TODO Auto-generated method stub
		return 0;
	}
}