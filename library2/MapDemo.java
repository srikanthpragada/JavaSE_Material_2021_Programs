package library2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo {
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<>();
		hm.put("java", "Language");
		hm.put("dotnet", "Framework");
		hm.put("c#", "Language");
		System.out.println("HashMap Output");
		for (String key : hm.keySet())
			System.out.printf("%s:%s\n", key, hm.get(key));

		// Arranges keys in insertion order
		LinkedHashMap<String, String> lhm = new LinkedHashMap<>();
		lhm.put("java", "Language");
		lhm.put("dotnet", "Framework");
		lhm.put("c#", "Language");
		System.out.println("LinkedHashMap Output");
		for (String key : lhm.keySet())
			System.out.printf("%s:%s\n", key, lhm.get(key));

		// Arranges keys in ascending order
		TreeMap<String, String> tm = new TreeMap<>();
		tm.put("java", "Language");
		tm.put("dotnet", "Framework");
		tm.put("c#", "Language");
		System.out.println("TreeMap Output");
		for (String key : tm.keySet())
			System.out.printf("%s:%s\n", key, tm.get(key));
	}
}