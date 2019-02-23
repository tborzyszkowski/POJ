package laboratorium.lab1.test;

public class Fake {
	private int x;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public Fake(int x) {
		super();
		this.x = x;
	}

	@Override
	public String toString() {
		return "Fake [x=" + x + "]";
	} 
	
}
