package laboratorium.lab5.samochody;

import java.util.Comparator;

public class DoubleCriteriaComparator implements Comparator<Ogloszenie>{
	private Comparator<Ogloszenie> fstCriterium; 
	private Comparator<Ogloszenie> sndCriterium;
	
	public DoubleCriteriaComparator(Comparator<Ogloszenie> fstCriterium, Comparator<Ogloszenie> sndCriterium) {
		super();
		this.fstCriterium = fstCriterium;
		this.sndCriterium = sndCriterium;
	}

	@Override
	public int compare(Ogloszenie o1, Ogloszenie o2) {
		int fstLocal = fstCriterium.compare(o1, o2);
		if (fstLocal != 0 )
			return fstLocal;
		else  
			return sndCriterium.compare(o1, o2);
	}
	
	
}
