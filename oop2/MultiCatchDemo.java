package oop2;

class MultiCatchDemo {
	public static void main(String args[]) {
		String num = "123";
		try {
			int v = Integer.parseInt(num);
			int result = 100 / v;
			System.out.println(result);
		} catch (NumberFormatException ex) {
			// take action
		} catch (ArithmeticException ex) {
			// take action
		}

		try {
			int v = Integer.parseInt(num);
			int result = 100 / v;
			System.out.println(result);
		}
		// multi-catch
		catch (NumberFormatException | ArithmeticException ex) {
			// take action
		}
	}
}
