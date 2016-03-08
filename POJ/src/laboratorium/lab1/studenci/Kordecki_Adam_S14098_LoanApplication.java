package laboratorium.lab1.studenci;

import java.util.Scanner;
import java.util.regex.*;	// Aby korzystać z wzorców w Stringach

class Date {
	int		day,
			month,
			year;
	String	full;
}

class Applicant {
	String	firstName,
			surname,
			pesel,
			nip,
			bankAccountNumber,
			gender,
			dateOfBirth;
	boolean	economicActivity;
}

class LoanApplication {

	public static void main(String[] args) {

		String[] greets = {
			"Super Bank",
			"Wprowadź poprawne dane"
		};
		String[] dataNames = {
			"Imię wnioskodawcy: ",
			"Nazwisko wnioskodawcy: ",
			"Numer PESEL: ",
			"Numer NIP: ",
			"Numer rachunku bankowego: ",
		};

		String[] patterns = {
				"^[a-zA-Z]{2,}$",
				"^[a-zA-Z]{2,}$",
				"^\\d{11}$",
				"^\\d{10}$",
				"^\\d{26}$",
		};


		Scanner readData = new Scanner(System.in);
		String[] readedData = new String[5];

		for (int i = 0; i < greets.length; i++){
			System.out.println(greets[i]);
		}
		System.out.print("Czy klient prowadzi działalność gospodarczą?\n[t/n]: ");
		char activity = readData.nextLine().charAt(0);
		do {
			for (int i = 0; i < dataNames.length; i++){
				while(true) {
					if (i == 3)
						if (activity == 'n' || activity == 'N') {
							readedData[i] = readedData[i-1];
							break;
						}
					System.out.print(dataNames[i]);
					if (validate(readedData[i] = readData.nextLine(), patterns[i], i))
						break;

					else System.out.println("Dane są niepoprawne\nWprowadź ponownie...");
				}
			}
			readData.close();
			if (save(dataNames, readedData)) break;
		} while(true);
	}

	private static boolean save(String[] names, String[] data) {
		boolean gender; // true - klient jest mężczyzną, false - klient jest kobietą
						// kolejność przypadkowa :)

		System.out.println("********************");	//Separator
		System.out.println("Wprowadzone dane:");

		Date dateOfBirth = new Date();

		dateOfBirth.year = Character.getNumericValue(data[2].charAt(0))*10;
		dateOfBirth.year += Character.getNumericValue(data[2].charAt(1));

		dateOfBirth.month = Character.getNumericValue(data[2].charAt(2))*10;
		if (dateOfBirth.month < 2)
			dateOfBirth.year += 1900;
		else {
			dateOfBirth.year += 2000;
			dateOfBirth.year -= 20;
		}
		dateOfBirth.month += Character.getNumericValue(data[2].charAt(3));

		dateOfBirth.day = Character.getNumericValue(data[2].charAt(4))*10;
		dateOfBirth.day += Character.getNumericValue(data[2].charAt(5));

		StringBuilder fullDate = new StringBuilder();
		if (dateOfBirth.day < 10) fullDate.append("0");
		fullDate.append(dateOfBirth.day);
		fullDate.append(".");
		if (dateOfBirth.month < 10) fullDate.append("0");
		fullDate.append(dateOfBirth.month);
		fullDate.append(".");
		fullDate.append(dateOfBirth.year);
		dateOfBirth.full = fullDate.toString();

		if (Character.getNumericValue(data[2].charAt(9)) % 2 == 0)
			gender = false;
		else gender = true;

		for(int i = 0; i < data.length; i++) {
			System.out.print(names[i]);
			System.out.println(data[i]);
		}
		System.out.print("Data urodzenia: ");
		System.out.println(dateOfBirth.full);
		System.out.print("Płeć: ");
		if (gender) System.out.println("Mężczyzna");
		else System.out.println("Kobieta");

		Applicant client = new Applicant();
		client.firstName = data[0];
		client.surname = data[1];
		client.pesel = data[2];
		client.nip = data[3];
		client.bankAccountNumber = data[4];
		client.dateOfBirth = dateOfBirth.full;
		if (gender) client.gender = "Mężczyzna";
		else client.gender = "Kobieta";
		return true;
	}

	static boolean validate(String valData, String patternString, int id) {

		Pattern pattern = Pattern.compile(patternString);
		Matcher matcher = pattern.matcher(valData);
		if(!matcher.matches())
			return false;
		else
			return true;
	}
}
