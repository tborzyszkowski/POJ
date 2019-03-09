package laboratorium.lab1.cars;

public class Truck {
	private String brand;
	private boolean isNew;
	private int mileage;
	private double price;
	
	public Truck(String brand, boolean isNew, int mileage, double price) {
		super();
		this.brand = brand;
		this.isNew = isNew;
		this.mileage = mileage;
		this.price = price;
	}

	public Truck(String brand, double price) {
		this(brand, true, 0, price);
	}
	
	public Truck() {
		this("Żuk", 100000);
	}
	
	
	@Override
	public String toString() {
		return "Truk [brand=" + brand + ", isNew=" + isNew + ", mileage=" + mileage + ", price=" + price + "]";
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
