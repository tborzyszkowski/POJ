import java.util.*;
import java.util.List;

public class Sort {
	public static void main(String args[]) {
		List<String> l = Arrays.asList(args);
		// posortuj
		Collections.sort(l);
		System.out.println(l);

		// pomieszaj
		Collections.shuffle(l);
		System.out.println(l);
	}
}
