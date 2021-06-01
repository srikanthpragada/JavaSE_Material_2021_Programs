package oop2;

enum Languages {
	C, CPP, JAVA, CSHARP
};

public class EnumDemo {
	public static void main(String[] args) {
		Languages lang;

		lang = Languages.JAVA;
		if (lang == Languages.JAVA)
			System.out.println("Next is Java EE");
		System.out.println("Value of lang = " + lang);
		switch (lang) {
		case C:
			System.out.println("Java or C++");
			break;
		case CPP:
			System.out.println("Java");
			break;
		case JAVA:
			System.out.println("Java EE");
			break;
		case CSHARP:
			System.out.println("ASP.NET");
			break;
		}
	} // end of main
} // end of class
