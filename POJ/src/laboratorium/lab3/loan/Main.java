package laboratorium.lab3.loan;

import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
		Applicant appl = new Applicant();
		
		String firstName = null;
		appl.setFirstName(firstName);
		System.out.println(appl);
		
		firstName = "A";
		appl.setFirstName(firstName);
		System.out.println(appl);

		firstName = "$123";
		appl.setFirstName(firstName);
		System.out.println(appl);

		firstName = "Ala";
		appl.setFirstName(firstName);
		System.out.println(appl);
		
		Date d = new GregorianCalendar(2018, 02, 20).getTime();
		appl.setDateOfBirth(d);
		System.out.println(appl);
	}

}
