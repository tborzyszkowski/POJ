package laboratorium.lab2.samochody;

import java.util.Comparator;

public class RocznikComparator implements Comparator<Ogloszenie> {

	@Override
	public int compare(Ogloszenie o1, Ogloszenie o2) {
		if (o1.getSamochod().getRocznik() > o2.getSamochod().getRocznik())
			return 1;
		else if (o1.getSamochod().getRocznik() < o2.getSamochod().getRocznik())
			return -1;
		else
			return 0;

	}

}
