package laboratorium.lab3.vat;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	
		Invoice iv = new Invoice("Kaziu", "Adres", "NIP");
		iv
			.addPozycja(new InvoiceItem("Kartofle", 3, 5, 7))
			.addPozycja(new InvoiceItem("Mleko", 2, 2, 22));
				
				
		System.out.println(iv);
		
		System.out.println(new Invoice("Ania", "Adres", "NIP")
				.addPozycja(new InvoiceItem("Ciastka", 10, 3, 22))
				.addPozycja(new InvoiceItem("Cukierki", 15, 2, 22)));
	}

}
