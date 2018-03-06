package laboratorium.lab1.cars;

public class Program {

	public static void main(String[] args) {
		Car car = new Car();
		car.setBrand("BMW");
		car.setNew(true);
		car.setMillage(0);
		car.setPrice(100);
		
		System.out.println("Marka: " + car.getBrand());
		System.out.println("Nowy: " + car.isNew());
		System.out.println("Przebieg :" + car.getMillage());
		System.out.println("Cena :" + car.getPrice());
		System.out.println(car);
		
		
		Car car2 = new Car("Fiat", true, 0, 50);
		System.out.println(car2);
		
		Bike b1 = new Bike("niebieski", 16, "Dzieciecy");
		Bike b2 = new Bike("czarny", 21);
		Bike b3 = new Bike("rudy");
		Bike b4 = new Bike();
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		
	}

}
