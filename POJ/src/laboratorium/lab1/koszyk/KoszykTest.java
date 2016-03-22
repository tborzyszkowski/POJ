package laboratorium.lab1.koszyk;

public class KoszykTest {

	public static void main(String[] args) {
		Koszyk koszyk = new Koszyk(10, 
							new IPromotion[]{
									new ValuePromotion(), 
									new MugPromotion()});

		koszyk.add(new Produkt("A0001", "PS2", 100));
		koszyk.add(new Produkt("A0002", "XBOX 360", 200));

		// wszystkie produkty
		System.out.println(koszyk);
		// najdrozszy produkt
		System.out.println("najdroższy:" + koszyk.najdrozszyProdukt());
		System.out.println("suma cen:" + koszyk.sumaCenProduktów());
		
		// promocje
		koszyk.zastosujPromocje();
		System.out.println(koszyk);

	}

}
