package laboratorium.lab1.cars;

public class Car {
	private String brand;
	private boolean isNew;
	private int mileage;
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
		if (isNew) {
			this.isNew = true;
			this.mileage = 0;
		} else {
			this.isNew = false;
			this.mileage = millage;
		}
		this.price = price;
	}
	public String toString() {
		return "Car [brand=" + brand + ", isNew=" + isNew + ", millage=" + mileage + ", price=" + price + "]";
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

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
}
