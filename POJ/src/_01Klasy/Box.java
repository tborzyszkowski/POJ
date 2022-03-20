package _01Klasy;

class Box {
	private double width;
	private double height;
	private double depth;

	public Box(double width, double height, double depth) {
		setDim(width, height, depth);
	}

	public Box(){
		this(0.0, 0.0, 0.0);
	}

	public Box(double dim){
		this(dim, dim, dim);
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
		return this.getWidth() * this.getHeight() * this.getDepth();
	}

	public void setDim(double width, double height, double depth){
		this.setWidth(width);
		this.setHeight(height);
		this.setDepth(depth);
	}
}

