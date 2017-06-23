package Pizzeria;

public class Pizza implements Kreator {
	private int numer;
	private  String nazwa; 
	private double cena; 
	private String rozmiar; 
	private int ostrosc; 
	private boolean papryka;
	private boolean pomidor;
	private boolean ser;
	private boolean pieczarki;
	private boolean sos;
	private boolean szynka;
	private boolean salami;
	private boolean papryka_ostra;
	private boolean cebula;

	
	private Pizza(int numer,String nazwa, double cena, String rozmiar, int ostrosc ,boolean papryka, boolean pomidor, boolean ser,
			boolean pieczarki,boolean sos, boolean szynka, boolean salami , boolean papryka_ostra ,boolean cebula  ){
		this.setNumer(numer);
		this.setNazwa(nazwa);
		this.setCena(cena);
		this.setRozmiar(rozmiar);
		this.setOstrosc(ostrosc);
		this.setPapryka(papryka);
		this.setPomidor(pomidor);
		this.setSer(ser);
		this.setPieczarki(pieczarki);
		this.setSos(sos);
		this.setSzynka(szynka);
		this.setSalami(salami);
		this.setPapryka_ostra(papryka_ostra);
		this.setCebula(cebula);
		
		
	}
	public static Pizza getStandardPizza(){
		return new Pizza(0,null,0,null,0,false,false,false,false,false,false,false,false,false);
		
	}
	@Override public void MENU(){
		System.out.print("składniki:");
		if(isCebula()==true){
			System.out.print("cebula, ");
		}
		if(isPapryka()==true){
			System.out.print("papryka, ");
		}
		if(isPapryka_ostra()==true){
			System.out.print("papryka ostra, ");
		}
		if(isPieczarki()==true){
			System.out.print("pieczarki, ");
		}
		if(isPomidor()==true){
			System.out.print("pomidor, ");
		}
		if(isSalami()==true){
			System.out.print("salami, ");
		}
		if(isSer()==true){
			System.out.print("ser, ");
		}
		if(isSos()==true){
			System.out.print("sos, ");
		}
		if(isSzynka()==true){
			System.out.print("szynka, ");
		}
		System.out.print(" ,ostrość:"+getOstrosc());
		System.out.println("");
	
	}
	@Override public Pizza getPizza(){
		return this;
	}
	public int getNumer() {
		return numer;
	}


	public void setNumer(int numer) {
		this.numer = numer;
	}

	public String getNazwa() {
		return nazwa;
	}
	


	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}


	public double getCena() {
		return cena;
	}


	public void setCena(double cena) {
		this.cena = cena;
	}


	public String getRozmiar() {
		return rozmiar;
	}


	public void setRozmiar(String rozmiar) {
		this.rozmiar = rozmiar;
	}


	public int getOstrosc() {
		return ostrosc;
	}


	public void setOstrosc(int ostrosc) {
		this.ostrosc = ostrosc;
	}


	public boolean isPapryka() {
		return papryka;
	}


	public void setPapryka(boolean papryka) {
		this.papryka = papryka;
	}


	public boolean isPomidor() {
		return pomidor;
	}


	public void setPomidor(boolean pomidor) {
		this.pomidor = pomidor;
	}


	public boolean isSer() {
		return ser;
	}


	public void setSer(boolean ser) {
		this.ser = ser;
	}


	public boolean isPieczarki() {
		return pieczarki;
	}


	public void setPieczarki(boolean pieczarki) {
		this.pieczarki = pieczarki;
	}


	public boolean isSos() {
		return sos;
	}


	public void setSos(boolean sos) {
		this.sos = sos;
	}


	public boolean isSzynka() {
		return szynka;
	}


	public void setSzynka(boolean szynka) {
		this.szynka = szynka;
	}


	public boolean isSalami() {
		return salami;
	}


	public void setSalami(boolean salami) {
		this.salami = salami;
	}


	public boolean isPapryka_ostra() {
		return papryka_ostra;
	}


	public void setPapryka_ostra(boolean papryka_ostra) {
		this.papryka_ostra = papryka_ostra;
	}


	public boolean isCebula() {
		return cebula;
	}


	public void setCebula(boolean cebula) {
		this.cebula = cebula;
	}
	
}
