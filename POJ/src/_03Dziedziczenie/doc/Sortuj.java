package _03Dziedziczenie.doc;

public class Sortuj {
    /** 
     * Zmienne prywatne klasy sortuj�cej
     */
    private Element elms[];
    private int indeksy[];

    /** 
     * Konstruktor klasy 
     * @param dlugosc ilo�� element�w do posortowania
     */
    public Sortuj(int dlugosc){
    	elms = new Element[dlugosc];
    	indeksy = new int[dlugosc];
    	for(int i = 0; i < dlugosc; i++) 
    		indeksy[i] = i;
    }
    /**
     *  Dodaje elementy do posortowania
     *  UWAGA: brak sprawdzania zakres�w
     *  @param e dodawany element klasy potomnej @see Element
     *  @param i miejsce, na kt�re wstawiamy element wyznaczone 
     *  przez tablic� indeksy
     *  @return nic
     */
    public void dodajNa(Element e, int i) {
	elms[indeksy[i]] = e;
    }
    /**
     * Reprezentacja sortowanej tablicy jako String
     * @return String opisuj�cy tablic�
     */
    public String toString() {
	StringBuffer s = new StringBuffer();
	for(int i = 0; i < elms.length; i++)
	    s = s.append((elms[indeksy[i]]).toString());
	return s.toString();
    }
    /** 
     * Metoda sortuj�ca. Nie zmienia tablicy element�w. 
     * Zamienia tylko indeksy w po�redniej tablicy indeks�w.
     * @return nic
     */
    public void sortuj() {
	for(int i = 0; i < elms.length - 1; i++) {
	    int k = i;  
	    int x = indeksy[i];
	    for(int j = i+1; j < elms.length; j++) 
		if ((elms[x]).compareTo(elms[indeksy[j]]) > 0) {
		    k = j;
		    x = indeksy[j];
		}
	    indeksy[k] = indeksy[i]; 
	    indeksy[i] = x;
	}
    }
}
