package library1;

public class SBDemo {
	public static void main(String args[]) {
		StringBuffer sb = new StringBuffer("Java ");
		sb.append("EE");
		System.out.println(sb); // Java EE
		sb.insert(0, "Oracle ");
		System.out.println(sb); // Oracle Java EE
		sb.delete(0, 6);
		System.out.println(sb); // Java EE
	}
}