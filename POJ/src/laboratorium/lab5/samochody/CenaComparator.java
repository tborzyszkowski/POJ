package laboratorium.lab5.samochody;
import java.util.Comparator;

public class CenaComparator implements Comparator<Ogloszenie>{

	@Override
	public int compare(Ogloszenie o1, Ogloszenie o2) {
		if (o1.getCena() > o2.getCena())
			return 1;
		else if (o1.getCena() < o2.getCena())
			return -1;
		else
			return 0;
	}

}
