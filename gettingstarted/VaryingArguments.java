package gettingstarted;

public class VaryingArguments {
	public static void main(String[] args) {
		System.out.println(getSum(10, 20, 30));
		System.out.println(getSum(100, 200));
	}

	public static int getSum(int... nums) {
		int total = 0;
		for (int n : nums) {
			total += n;
		}
		return total;
	}
}