package library1;

public class StringDemo {
	public static void main(String args[]) {
		String s1 = new String("Java Language");
		String s2 = "Java EE";

		// comparing two strings based on values
		if (s1.equals(s2))
			System.out.println("Equal");

		System.out.println(s2.length()); // 7
		System.out.println(s1.charAt(0)); // J
		System.out.println(s1.startsWith("Java"));// true
		System.out.println(s1.endsWith("Java")); // false
		System.out.println(s1.indexOf("a")); // 1
		System.out.println(s1.indexOf("a", 4)); // 6
		System.out.println(s1.lastIndexOf("a")); // 10
		System.out.println(s1.substring(0, 4)); // Java
		System.out.println(s1.toUpperCase()); // JAVA LANGUAGE
		// original string remains the same
		System.out.println(s1); // Java Language

		// split the string based on space
		String words[] = s1.split(" ");
		System.out.println("\nWords\n");
		for (String w : words)
			System.out.println(w);

		String langs = String.join(",", "Java", "Python", "C#");
		System.out.println(langs); // Java,Python,C#

		System.out.println(" Java SE ".strip()); // Java SE
		System.out.println("Java SE\nJava EE".indent(5));
		// Java SE
		// Java EE
		System.out.println("*".repeat(5)); // *****
		System.out.println(" ".isBlank()); // true
	}
}