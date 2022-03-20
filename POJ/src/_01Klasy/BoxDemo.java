package _01Klasy;


public class BoxDemo {
	public static void main(String[] args) {
		Box myBox = new Box(2);

		System.out.println("Objetosc = " + myBox.volume());

		myBox.setDim(10, 20, 15);

		System.out.println("Objetosc = " + myBox.volume());
	}
}