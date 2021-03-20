package Laboratorium.Klasy;

public class PersonMain {
	public static void main(String[] args) {
		Person personOne = new Person("Jan", "Kowalski", 1990);
		System.out.println(personOne);

		personOne.setYearOfBirth(1900);
		System.out.println(personOne);

		personOne.setYearOfBirth(1995);
		System.out.println(personOne);

		Person personTwo = new Person("Katarzyna", "Brzęczyszczykiewicz", 2000);

		System.out.println(personTwo);
		System.out.println(personTwo.getAge());

		System.out.println( (personTwo.getAge() > personOne.getAge() ? "One" : "Two") );

		System.out.println( personOne.equals(personTwo));

		Person personAnother = personOne;

		System.out.println( personOne.equals(personAnother) );
		System.out.println( personOne == personAnother );

		Person personOneClone = new Person(personOne);
		System.out.println( personOne.equals(personOneClone) );
		System.out.println( personOne == personOneClone );

	}
}
