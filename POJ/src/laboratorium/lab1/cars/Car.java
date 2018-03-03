package laboratorium.lab1.cars;

public class Car {
	String brand;
	boolean isNew;
	int millage;
	double price;
	
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
	
	
}
