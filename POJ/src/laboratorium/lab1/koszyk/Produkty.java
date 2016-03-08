package laboratorium.lab1.koszyk;

public class Produkty {
	// Założenie: maksymalnie 10 produktów
	Produkt [] lista = new Produkt[10];
	int wolnyProduktIdx = 0;
	
	void add(Produkt p){
		if (wolnyProduktIdx < lista.length){
			lista[wolnyProduktIdx] = p;
			wolnyProduktIdx++;
		} else {
			System.out.println("Tablica produktów pełna");
		}
	}
	
	Produkt najdrozszyProdukt(){
		int najdrozszyIdx = 0;
		for(int i = 1; i < lista.length; i++){
			if (lista[najdrozszyIdx].cena < lista[i].cena) {
				najdrozszyIdx = i;
			}
		}
		return lista[najdrozszyIdx];
	}
	
	public String toString(){
		String wynik = "[\n";
		for(int i = 0; i < wolnyProduktIdx; i++)
			wynik += lista[i].toString() + "\n";
		wynik += "]";
		return wynik;
	}
}
