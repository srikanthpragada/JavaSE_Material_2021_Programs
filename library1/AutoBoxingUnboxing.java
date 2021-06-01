package library1;

public class AutoBoxingUnboxing {
	public static void main(String[] args) {
		int i = 100;
		Integer iobj = i;	 // autoboxing
		System.out.println(iobj.toString());
		i = iobj; 			// autounboxing
		System.out.println(i);
	}
}