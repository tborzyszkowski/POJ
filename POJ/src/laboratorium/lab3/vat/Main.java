package laboratorium.lab3.vat;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	
		Invoice iv = new Invoice("Kaziu", "Adres", "NIP");
		iv
			.addPozycja(new InvoiceItem("Kartofle", 3, 5, 7))
			.addPozycja(new InvoiceItem("Mleko", 2, 2, 22));
		
		Invoice iv2 = new Invoice("Kaziu", "Adres", "NIP");
		System.out.println(iv);
		
		System.out.println(iv2);
	}

}
