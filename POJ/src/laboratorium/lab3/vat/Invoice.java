package laboratorium.lab3.vat;

import java.util.ArrayList;

public class Invoice {
	private ArrayList<InvoiceItem> pozycje = new ArrayList<>();
	
	static int ostatniNrFaktury = 0;
	
	private int nrFaktury;
	private String klient;
	private String adres;
	private String nip;
	
	public Invoice(String klient, String adres, String nip) {
		this.klient = klient;
		this.adres = adres;
		this.nip = nip;
		this.nrFaktury = ostatniNrFaktury++;
		
	}
	
	public ArrayList<InvoiceItem> getPozycje() {
		return pozycje;
	}
	public void setPozycje(ArrayList<InvoiceItem> pozycje) {
		this.pozycje = pozycje;
	}
	public String getKlient() {
		return klient;
	}
	public void setKlient(String klient) {
		this.klient = klient;
	}
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	public String getNip() {
		return nip;
	}
	public void setNip(String nip) {
		this.nip = nip;
	}

	public double getSumaBruttoFaktury() {
		double suma = 0;
		for(InvoiceItem iv : pozycje) {
			suma += iv.getSumaBrutto();
		}
		return suma;
	}
	
	public Invoice addPozycja(InvoiceItem pozycja) {
		this.pozycje.add(pozycja);
		return this;
	}
	
	@Override
	public String toString() {
		return "Invoice [ " + nrFaktury+ " \n" + pozycje + "\n" + klient + ", " + adres + ", " + nip + " " + this.getSumaBruttoFaktury() +"]";
	}
	
	
}
