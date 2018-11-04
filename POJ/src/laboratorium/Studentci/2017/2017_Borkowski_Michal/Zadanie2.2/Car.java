
public class Car
{
	
	private String brand;
	private String model;
	private double price;
	private int year;
	private int mileage;
	
	public Car(String brand, String model, double price, int year, int mileage)
	{
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.year = year;
		this.mileage = mileage;
	}

	public String getBrand()
	{
		return brand;
	}

	public String getModel()
	{
		return model;
	}

	public double getPrice()
	{
		return price;
	}

	public int getYear()
	{
		return year;
	}

	public int getMileage()
	{
		return mileage;
	}

	@Override
	public String toString()
	{
		StringBuilder result = new StringBuilder();
		result.append("Brand: ").append(brand).append("    ");
		result.append("Model: ").append(model).append("    ");
		result.append("Price: ").append(price).append("    ");
		result.append("Year: ").append(year).append("    ");
		result.append("Mileage: ").append(mileage);
		return result.toString();
	}

}
