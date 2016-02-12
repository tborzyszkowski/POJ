import java.util.*;
import java.util.Set;
import java.util.Iterator;

// TU definiujemy nowy Comparator
class TComp implements Comparator {
	public int compare(Object a, Object b) {
		int i, j, k;
		// ciekawostka w Java 5.0 !!!
		String aStr = (String) a;
		String bStr = (String) b;

		// znajdz indeks poczatku nazwiska
		i = aStr.lastIndexOf(' ');
		j = bStr.lastIndexOf(' ');

		// czy nazwiska sie zgadzaja
		k = aStr.substring(i).compareTo(bStr.substring(j));
		if (k == 0)
			// nazwiska sie zgadzaja, sprawdz calosc
			return aStr.compareTo(bStr);
		else
			return k;
	}
}

class TreeMapDemo2 {
	public static void main(String args[]) {
		TreeMap<String, Double> tm = new TreeMap<String, Double>(
				new TComp());

		tm.put("Jan Kowalski", new Double(1111.11));
		tm.put("Janusz Kowalski", new Double(1111.11));
		tm.put("Jan Nowak", new Double(2222.22));
		tm.put("Anna Kos", new Double(3333.33));
		tm.put("Hermenegilda Kociubinska", new Double(4444.44));
		tm.put("Kubus Puchatek", new Double(5555.55));

		// zbior danych
		Set<Map.Entry<String, Double>> set = tm.entrySet();

		// wyswietlanie zbioru danych
		for (Map.Entry<String, Double> m : set) {
			System.out.print(m.getKey() + ": ");
			System.out.println(m.getValue());
		}
		System.out.println();
		double balance = tm.get("Jan Kowalski").doubleValue();
		tm.put("Jan Kowalski", new Double(balance + 1000));

		// wyswietlanie tradycyjne
		for (Iterator<Map.Entry<String, Double>> i = set.iterator(); i
				.hasNext();) {
			Map.Entry<String, Double> me = i.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		System.out.println();
	}
}
