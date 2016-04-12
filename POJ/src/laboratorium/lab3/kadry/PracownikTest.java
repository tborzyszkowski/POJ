package laboratorium.lab3.kadry;

import java.util.ArrayList;
import java.util.List;

public class PracownikTest {

	public static void main(String[] args) {
		PracownikKierownik pk = new PracownikKierownik(
				"Jan", "Kos", 1970, null, 4000,
				20, 500, "997", "111", "komunikacja");

		System.out.println(pk);
		
		List<String> kwalifikacje = new ArrayList<String>();
		kwalifikacje.add("biega");
		kwalifikacje.add("krzyczy");
		
		PracownikFizyczny pf = new PracownikFizyczny(
				"Hermenegilda", "Kociubińska", 1980, pk, 12, 200, 
				kwalifikacje, 160);

		System.out.println(pf);
	}

}
