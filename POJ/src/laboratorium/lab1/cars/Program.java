package laboratorium.lab1.cars;

public class Program {

	public static void main(String[] args) {
		Car car = new Car();
		car.setBrand("BMW");
		car.setNew(true);
		car.setMillage(0);;
		car.setPrice(100);
		
//		System.out.println("Marka: " + car.brand);
//		System.out.println("Nowy: " + car.isNew);
//		System.out.println("Przebieg :" + car.millage);
//		System.out.println("Cena :" + car.price);
		System.out.println(car);
		
		
		Car car2 = new Car("Fiat", true, 0, 50);
		System.out.println(car2);
		
	}

}
