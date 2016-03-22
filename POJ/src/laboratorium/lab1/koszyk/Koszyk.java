package laboratorium.lab1.koszyk;

public class Koszyk {
	// Założenie: maksymalnie 10 produktów
	Produkt[] zakupy;
	IPromotion[] promocje;
	
	int wolnyProduktIdx = 0;
	double sumaKoszyka = 0;
	double sumaPromocyjnaKoszyka = 0;
	
	Koszyk(int size, IPromotion[] promocje){
		zakupy = new Produkt[size];
		this.promocje = promocje;
	}
	
	void add(Produkt p){
		if (wolnyProduktIdx < zakupy.length){
			zakupy[wolnyProduktIdx] = p;
			wolnyProduktIdx++;
		} else {
			System.out.println("Tablica produktów pełna");
		}
		sumaKoszyka += p.cena;
		sumaPromocyjnaKoszyka += p.cena;
	}
	
	Produkt najdrozszyProdukt(){
		int najdrozszyIdx = 0;
		for(int i = 1; i < wolnyProduktIdx; i++){
			if (zakupy[najdrozszyIdx].cena < zakupy[i].cena) {
				najdrozszyIdx = i;
			}
		}
		return zakupy[najdrozszyIdx];
	}
	
	void sortujPoCenie(){
		// TODO: zobacz http://wazniak.mimuw.edu.pl/index.php?title=Algorytmy_i_struktury_danych/Sortowanie_-_BubbleSort%2C_SelectionSort%2C_InsertionSort
	}
	
	double sumaCenProduktów(){
		double suma = 0;
		for(int i = 0; i < wolnyProduktIdx; i++){
			suma += zakupy[i].cena;
		}
		sumaKoszyka = suma;
		return suma;
	}
	
	void zastosujPromocje(){
		for(IPromotion p : promocje){
			p.CalculateOffer(this);
		}
	}
	
	
	public String toString(){
		String wynik = "[\n";
		for(int i = 0; i < wolnyProduktIdx; i++)
			wynik += zakupy[i].toString() + "\n";
		wynik += " suma koszyka: " + sumaKoszyka + 
				"\n suma promocyjna: " + sumaPromocyjnaKoszyka+ " ]";
		return wynik;
	}
}
