package Strings;

import java.util.HashMap;
import java.util.Map;

public class CountCharacters {

	public static void main(String[] args) {
		countChar("This is a practice test");
	}

	public static void countChar(String str) {
		char[] strChars = str.toCharArray();

		Map<Character, Integer> occurances = new HashMap<Character, Integer>();

		for (char strChar : strChars) {
			Integer integer = occurances.get(strChar);
			if (integer == null) {
				occurances.put(strChar, 1);
			} else
				occurances.put(strChar, integer + 1);
		}
		System.out.println(occurances);
	}
}
