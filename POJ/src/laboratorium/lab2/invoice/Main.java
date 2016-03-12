package laboratorium.lab2.invoice;

import laboratorium.lab2.invoice.model.Invoice;
import laboratorium.lab2.invoice.model.InvoicePosition;
import laboratorium.lab2.invoice.model.Product;

public class Main {
	public static void main(String[] args) {

		Invoice invoice = new Invoice();
		invoice.addPosition(new Product("ABC123", "Tv", 1000));
		invoice.addPosition(new Product("ABC123", "Tv", 1000));
		invoice.addPosition(new Product("CBA321", "Radio", 500));
		invoice.addPosition(new Product("ABC123", "Tv", 1000));
		invoice.addPosition(new Product("CBA321", "Radio", 500));
		printoutInvoice(invoice);
	}

	private static void printoutInvoice(Invoice invoice) {
		System.out.println("|NAZWA\t|ILO��\t|CENA NETTO\t|CENA BRUTTO\t|STAWKA VAT\t|PODATEK");
		System.out.println("*******************************************************************");
		for (InvoicePosition p : invoice.getPositions()) {
			System.out.print("|" + p.getProduct().getName() + "\t|");
			System.out.print(p.getCount() + "\t|");
			System.out.print(p.getNettoPrice() + "\t\t|");
			System.out.print(p.getGrossPrice() + "\t\t|");
			System.out.print(p.getTax() + "\t\t|");
			System.out.println(p.getTaxValue());
			System.out.println("----------------------------------------------------------------------------");
		}
	}
}
