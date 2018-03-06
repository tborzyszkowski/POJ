package laboratorium.lab1.cars;

public class Bike {
	private String color;
	private int inches;
	private String type;
	
	
	public Bike(String color, int inches, String type) {
		this.color = color;
		this.inches = inches;
		this.type = type;
	}
	
	public Bike(String color, int inches) {
		this(color, inches, "Gorski");
	}
	
	public Bike(String color) {
		this(color, 26);
	}
	
	public Bike() {
		this("czerwony");
	}

	@Override
	public String toString() {
		return "Bike [color=" + color + ", inches=" + inches + ", type=" + type + "]";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getInches() {
		return inches;
	}

	public void setInches(int inches) {
		this.inches = inches;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
