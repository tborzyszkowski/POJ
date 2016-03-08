package laboratorium.lab1.koszyk;

public class ProduktyTest {

	public static void main(String[] args) {
		Produkty produkty = new Produkty();
		
		produkty.add(new Produkt(
				"A0001", 
				"PS2",
				1000,
				500));
		produkty.add(new Produkt(
				"A0002", 
				"XBOX 360",
				999,
				777));
		
		// wszystkie produkty
		System.out.println(produkty);
		// najdrozszy produkt
		System.out.println("najdroższy:" + produkty.najdrozszyProdukt());
		System.out.println("suma cen:" + produkty.sumaCenProduktów());
		
	}

}
