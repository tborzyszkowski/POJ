package _03Dziedziczenie.doc;

// Przykład prostego ADT

/**
 * Klasa nadrzędna elementów, które bedziemy chcieli sortować. Niczego nie
 * zawiera. Każda klasa potomna musi implementować metodę int compareTo(Object
 * o);
 * 
 * @author Tomasz Borzyszkowski
 * @version 1.0
 */

abstract class Element implements Comparable {

}

/**
 * Klasa sortująca elementy typu Element.
 * 
 * @author {@link http://julia.univ.gda.pl/~mattb/ Tomasz Borzyszkowski}
 * @see Element
 * @version 1.0
 */

class Sortowanie {
	/**
	 * Zmienne prywatne klasy sortuj�cej
	 */
	private Element elms[];
	private int indeksy[];

	/**
	 * Konstruktor klasy
	 * 
	 * @param dlugosc
	 *            ilo�� element�w do posortowania
	 */
	public Sortowanie(int dlugosc) {
		elms = new Element[dlugosc];
		indeksy = new int[dlugosc];
		for (int i = 0; i < dlugosc; i++)
			indeksy[i] = i;
	}

	/**
	 * Dodaje elementy do posortowania UWAGA: brak sprawdzania zakres�w
	 * 
	 * @param e
	 *            dodawany element klasy potomnej @see Element
	 * @param i
	 *            miejsce, na kt�re wstawiamy element wyznaczone przez tablic�
	 *            indeksy
	 * @return nic
	 */
	public void dodajNa(Element e, int i) {
		elms[indeksy[i]] = e;
	}

	/**
	 * Reprezentacja sortowanej tablicy jako String
	 * 
	 * @return String opisuj�cy tablic�
	 */
	public String toString() {
		StringBuffer s = new StringBuffer();
		for (int i = 0; i < elms.length; i++)
			s = s.append((elms[indeksy[i]]).toString());
		return s.toString();
	}

	/**
	 * Metoda sortuj�ca. Nie zmienia tablicy element�w. Zamienia tylko indeksy w
	 * po�redniej tablicy indeks�w.
	 * 
	 * @return nic
	 */
	public void sortuj() {
		for (int i = 0; i < elms.length - 1; i++) {
			int k = i;
			int x = indeksy[i];
			for (int j = i + 1; j < elms.length; j++)
				if ((elms[x]).compareTo(elms[indeksy[j]]) > 0) {
					k = j;
					x = indeksy[j];
				}
			indeksy[k] = indeksy[i];
			indeksy[i] = x;
		}
	}
}

/**
 * Klasa element�w do posortowania.
 * 
 * @author {@link http://julia.univ.gda.pl/~mattb/ Tomasz Borzyszkowski}
 * @version 1.0
 */
class ElemInt extends Element {
	/**
	 * Stan obiektu - sortowany element.
	 */
	private int x;

	/**
	 * Konstruktor klasy
	 * 
	 * @param i
	 *            stan tworzonego obiektu
	 */
	public ElemInt(int i) {
		x = i;
	}

	/**
	 * Metoda zwraca stan obiektu
	 * 
	 * @return Stan obiektu
	 */
	public int getElem() {
		return x;
	}

	/**
	 * Metoda por�wnuj�ca wymagana przez interfejs Comparable
	 * 
	 * @return 1 = wieksze; 0 = r�wne; -1 = mniejsze czasem wymaga si� by
	 *         (a.compareTo(e)==0) == (a.equals(e))
	 */
	public int compareTo(Object e) {
		if (this.x > ((ElemInt) e).getElem())
			return 1;
		else if (this.x == ((ElemInt) e).getElem())
			return 0;
		else
			return -1;
	}

	/**
	 * Reprezentacja elementu jako String
	 * 
	 * @return String opisuj�cy element
	 */
	public String toString() {
		return x + " ";
	}
}

/**
 * Klasa tastująca sortowanie elementy
 * 
 * @author {Tomasz Borzyszkowski}
 * @version 1.0
 */
class SortowanieTest {
	/**
	 * Metoda demonstruj�ca sortowanie 20 element�w typu
	 * 
	 * @see ElemInt
	 * @param args
	 *            nieu�ywane
	 * @return nic
	 */
	public static void main(String args[]) {
		Sortowanie srt = new Sortowanie(20);
		// wkładamy 20 elementów
		srt.dodajNa((new ElemInt(91)), 0);
		srt.dodajNa((new ElemInt(22)), 1);
		srt.dodajNa((new ElemInt(4)), 2);
		srt.dodajNa((new ElemInt(67)), 3);
		srt.dodajNa((new ElemInt(11)), 4);
		srt.dodajNa((new ElemInt(1)), 5);
		srt.dodajNa((new ElemInt(46)), 6);
		srt.dodajNa((new ElemInt(13)), 7);
		srt.dodajNa((new ElemInt(77)), 8);
		srt.dodajNa((new ElemInt(33)), 9);
		srt.dodajNa((new ElemInt(96)), 10);
		srt.dodajNa((new ElemInt(28)), 11);
		srt.dodajNa((new ElemInt(7)), 12);
		srt.dodajNa((new ElemInt(61)), 13);
		srt.dodajNa((new ElemInt(18)), 14);
		srt.dodajNa((new ElemInt(2)), 15);
		srt.dodajNa((new ElemInt(41)), 16);
		srt.dodajNa((new ElemInt(12)), 17);
		srt.dodajNa((new ElemInt(71)), 18);
		srt.dodajNa((new ElemInt(39)), 19);
		// wypisujemy elementy przez sortowaniem
		System.out.println(srt.toString());
		srt.sortuj(); // teraz sortujemy
		// wypisujemy posortowane
		System.out.println(srt.toString());
	}
}
