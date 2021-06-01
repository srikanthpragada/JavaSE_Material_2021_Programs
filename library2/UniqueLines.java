package library2;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashSet;

public class UniqueLines {
	public static void main(String[] args) throws Exception {
		Path path = Path.of("c:\\classroom\\names.txt");

		var lines = Files.readAllLines(path);
		var uniqueLines = new LinkedHashSet<String>(lines);
		for (var line : uniqueLines)
			System.out.println(line);
	}
}