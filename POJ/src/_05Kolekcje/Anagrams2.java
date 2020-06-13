package _05Kolekcje;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Anagrams2 {
	public static void main(String[] args) {
		int minGroupSize = Integer.parseInt(args[1]);

		Map<String, ArrayList<String>> m = new HashMap<String, ArrayList<String>>();
		try {
			Scanner s = new Scanner(new File(args[0]));
			String word;
			while (s.hasNext()) {
				String alpha = alphabetize(word = s.next());
				ArrayList<String> l = m.get(alpha);
				if (l == null)
					m.put(alpha, l = new ArrayList<String>());
				l.add(word);
			}
		} catch (IOException e) {
			System.err.println(e);
			System.exit(1);
		}

		ArrayList<ArrayList<String>> winners = new ArrayList<ArrayList<String>>();
		for (ArrayList<String> l : m.values()) {
			if (l.size() >= minGroupSize)
				winners.add(l);
		}

		Collections.sort(winners, new Comparator<List<String>>() {
			public int compare(List<String> o1, List<String> o2) {
			    return o2.size() - o1.size();
			}
		});

		for (List<String> l : winners) {
			System.out.println(l.size() + ": " + l);
		}
		System.out.println(winners.size());
	}

	private static String alphabetize(String s) {
		int count[] = new int[256];
		int len = s.length();
		for (int i = 0; i < len; i++)
			count[s.charAt(i)]++;
		StringBuffer result = new StringBuffer(len);
		for (char c = 'a'; c <= 'z'; c++)
			for (int i = 0; i < count[c]; i++)
				result.append(c);
		return result.toString();
	}
}
