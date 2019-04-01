package _03Dziedziczenie;

class Box4 {
	private double width;
	private double height;
	private double depth;

	Box4(double w, double h, double d) {
		setDim(w, h, d);
	}

	Box4(Box4 ob) {
		this(ob.width, ob.height, ob.depth);
	}

	Box4() {
		this(0, 0, 0);
	}

	Box4(int n) {
		this(n, n, n);
	}

	Box4(int w, int h, int d) {
		this(1.0 * w, h, d);
	}

	Box4(double w, int h, int d) {
		this(w, 1.0*h, d);
	}

	void setDim(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	double volume() {
		return width * height * depth;
	}

	public String toString() {
		return " Objetosc =\t" + this.volume();
	}
}

class BoxWeight extends Box4 {
	private double weight;

	BoxWeight(BoxWeight ob) {
		super(ob); // tu odwolujemy sie do konstruktora Box(Box ob)
		weight = ob.weight;
	}

	BoxWeight() {
		weight = 0;
	}

	BoxWeight(int n, double m) {
		super(n); // tu wysulamy tylko jeden parametr
		weight = m; // a tu uzywamy drugiego
	}

	BoxWeight(double w, int h, int d, double m) {
		super(w, h, d);
		weight = m;
	}

	void setDim(double w, double h, double d, double m) {
		super.setDim(w, h, d);
		weight = m;
	}

	public String toString() {
		return super.toString() + "\n" + " Waga     =\t" + weight;
	}
}

class BoxDemo4 {
	public static void main(String args[]) {
		BoxWeight myBox1 = new BoxWeight();
		BoxWeight myBox2 = new BoxWeight(2, 3);
		BoxWeight myBox3 = new BoxWeight(3, 4, 5, 0.1234);
		BoxWeight myBox4 = new BoxWeight(myBox3);

		System.out.println("myBox1: \n" + myBox1);
		System.out.println("myBox2: \n" + myBox2);
		System.out.println("myBox3: \n" + myBox3);
		System.out.println("myBox4: \n" + myBox4);

		myBox1.setDim(2, 3, 2, 100.001);
		System.out.println("myBox1: \n" + myBox1);
	}
}
