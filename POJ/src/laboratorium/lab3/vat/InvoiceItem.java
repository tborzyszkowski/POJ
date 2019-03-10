package laboratorium.lab3.vat;

public class InvoiceItem {
	private String name;
	private int qty;
	private double price;
	private double tax;
	
	public InvoiceItem(String name, int qty, double price, double tax) {
		super();
		this.name = name;
		this.qty = qty;
		this.price = price;
		this.tax = tax;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public double getSumaNetto() {
		return price * qty;
	}
	
	public double getSumaBrutto() {
		return getSumaNetto() * (1+tax/100);
	}

	@Override
	public String toString() {
		return "Item [" + name + ", " + qty + ", " + price + ", " + tax + " " + this.getSumaBrutto()+"]";
	}

}
