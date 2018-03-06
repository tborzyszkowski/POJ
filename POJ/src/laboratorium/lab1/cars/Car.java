package laboratorium.lab1.cars;

public class Car {
	private String brand;
	private boolean isNew;
	private int millage;
	private double price;
	
	Car(){
		System.out.println("Iniclalizacja Car()");
	}
	
	Car(String brand){
		this();
		this.brand = brand;
	}
	
	Car(String brand, boolean isNew, int millage, double price){
		this(brand);
		this.isNew = isNew;
		this.millage = millage;
		this.price = price;
	}
	public String toString() {
		return "Car [brand=" + brand + ", isNew=" + isNew + ", millage=" + millage + ", price=" + price + "]";
	}
	
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public boolean isNew() {
		return isNew;
	}

	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}

	public int getMillage() {
		return millage;
	}

	public void setMillage(int millage) {
		this.millage = millage;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
}
