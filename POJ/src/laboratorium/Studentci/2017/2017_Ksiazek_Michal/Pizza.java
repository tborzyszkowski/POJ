import java.util.ArrayList;

public abstract class Pizza {
	
	private int id;
	private String name;
	private int size;
	private ArrayList<String> ingredients = new ArrayList<>();
	private int pungency;
	private double price_small;
	private double price_mid;
	private double price_big;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public String getSize() {
		switch (size) {
		case 1: return "small";
		case 2: return "medium";
		case 3: return "big";
		default: return "";
		}
	}
	
	public void addIngredient(String ingredient) {
		this.ingredients.add(ingredient);
	}
	
	public void setPungency(int pungency) {
		this.pungency = pungency;
	}
	
	public double getPrice() {
		switch (size) {
		case 1: return price_small;
		case 2: return price_mid;
		case 3: return price_big;
		default: return 0;
		}
	}
	
	public void setPrice(double price_small, double price_mid, double price_big) {
		this.price_small = price_small;
		this.price_mid 	 = price_mid;
		this.price_big	 = price_big;
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("---------------------------------------------------------------------------" + "\n");
		result.append(id + ". " + name + ": ");
		for (String ingredient : ingredients) {
			result.append(ingredient + ", ");
		}
		result.append("Pungency level: " + pungency + "\n");
		result.append("Small: " + price_small + ", medium: " + price_mid + ", big: " + price_big + ". (PLN)");
		return result.toString();
	}
}
