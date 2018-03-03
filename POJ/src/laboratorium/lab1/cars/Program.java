package laboratorium.lab1.cars;

public class Program {

	public static void main(String[] args) {
		Car car = new Car();
		car.brand = "BMW";
		car.isNew = true;
		car.millage = 0;
		car.price = 100;
		
//		System.out.println("Marka: " + car.brand);
//		System.out.println("Nowy: " + car.isNew);
//		System.out.println("Przebieg :" + car.millage);
//		System.out.println("Cena :" + car.price);
		System.out.println(car);
		
		
		Car car2 = new Car("Fiat", true, 0, 50);
		System.out.println(car2);
		
	}

}
