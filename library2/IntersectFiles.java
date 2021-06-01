package library2;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.LinkedHashSet;

public class IntersectFiles {
	public static void main(String[] args) throws Exception {
		Path oldNamesPath = Path.of("c:\\classroom\\names.txt");
		Path newNamesPath = Path.of("c:\\classroom\\names2.txt");
		var oldNames = new LinkedHashSet<String>(Files.readAllLines(oldNamesPath));
		var commonNames = new LinkedHashSet<String>();
		for (String name : Files.readAllLines(newNamesPath)) {
			if (oldNames.contains(name))
				commonNames.add(name);
		}
		for (String name : commonNames)
			System.out.println(name);
	}
}