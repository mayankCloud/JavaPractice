package array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicate {
	static String[] infras = { "Amazon", "Azure", "Java", "Server", "Selenium", "Azure", "Server" };

	public static void main(String[] args) {

		bruteForce(infras);
		setDuplicate(infras);
		mapDuplicates(infras);
	}

	public static void bruteForce(String[] arr) {
		System.out.println("**********Brute Force****************");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equalsIgnoreCase(arr[j])) {
					System.out.println(arr[i]);
				}
			}
		}

	}

	public static void setDuplicate(String[] arr) {
		System.out.println("**********HashSet******************");
		Set<String> data = new HashSet<String>();
		for (String infra : infras) {
			if (data.add(infra) == false) {
				System.out.println(infra);
			}

		}

	}

	public static void mapDuplicates(String[] arr) {
		System.out.println("***********Map************");
		Map<String, Integer> data = new HashMap<String, Integer>();

		for (String infra : infras) {
			Integer count = data.get(infra);
			if (count == null) {
				data.put(infra, 1);
			} else
				data.put(infra, count + 1);
		}

//	Print value of Map object
		Set<Entry<String, Integer>> entrySet = data.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey());
			}
		}
	}
}
