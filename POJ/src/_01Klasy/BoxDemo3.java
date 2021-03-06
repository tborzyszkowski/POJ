package _01Klasy;

class Box3 {
	private double width = 0;
	private double height = 0;
	private double depth = 0;

	public Box3(double width, double height, double depth) {
		this.setDim(3 * width, height, depth);
	}

	public Box3() {
		this(0, 0, 0);
	}

	public Box3(int n) {
		this(n, n, n);
	}

	public Box3(int width, int height, int depth) {
		this(2.0 * width, height, depth);
	}

	public Box3(int width, double height, double depth) {
		this(4.0 * width, height, depth);
	}

	public Box3(int width, int height, double depth) {
		this(5.0 * width, height, depth);
	}

	public void setDim(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	public double volume(){
		return height * width * depth;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Box3)) return false;

		Box3 box = (Box3) o;

		if (Double.compare(box.width, width) != 0) return false;
		if (Double.compare(box.height, height) != 0) return false;
		return Double.compare(box.depth, depth) == 0;
	}

	@Override
	public int hashCode() {
		int result;
		long temp;
		temp = Double.doubleToLongBits(width);
		result = (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(height);
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(depth);
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
}

class BoxDemo3 {
	public static void main(String args[]) {
		Box3 myBox1 = new Box3();
		Box3 myBox2 = new Box3(2);
		Box3 myBox3 = new Box3(3, 4, 5);
		Box3 myBox4 = new Box3(1.0, 1.0, 1.0);

		System.out.println("\nObjetosc myBox1 = " + myBox1.volume());
		System.out.println("Objetosc myBox2 = " + myBox2.volume());
		System.out.println("Objetosc myBox3 = " + myBox3.volume());
		System.out.println("Objetosc myBox4 = " + myBox4.volume());

		myBox1.setDim(2, 3, 2);
		System.out.println("\nObjetosc myBox1 = " + myBox1.volume() + "\n");
		System.out.println(myBox1.equals(myBox2));
		System.out.println(myBox1.equals(myBox1));

		myBox2.setDim(myBox1.getWidth(), myBox1.getHeight(), myBox1.getDepth());
		System.out.println(myBox1.equals(myBox2));
	}
}
