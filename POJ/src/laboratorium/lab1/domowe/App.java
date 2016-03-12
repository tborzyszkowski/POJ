package laboratorium.lab1.domowe;

import laboratorium.lab1.domowe.validators.*;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author Grzegorz Woźniak
 * @see https://github.com/grzgrz/PJA/tree/master/POJ/Ex1.2/src/pja/poj/ex1b
 *
 */
public class App {

    public static void main(String[] args) {

        Calendar dob = new GregorianCalendar(1991, 2, 5);

        LoanApplication document = new LoanApplication();
        document.setFirstName("Jan");
        document.setSurname("Kowalski");
        document.setPesel("91030507270");
        document.setNip("8499501317");
        document.setBankAccountNumber("PL775614136803627421230571288867");
        document.setDateOfBirth(dob.getTime());
        document.setGender(Sex.MALE);

        // Validators
        document.addValidator(new FirstnameAndSurnameNotEmptyValidator());
        document.addValidator(new FirstnameAndSurnameMinLengthValidator());
        document.addValidator(new FirstnameAndSurnameInvalidCharsValidator());
        document.addValidator(new PeselValidator());
        document.addValidator(new NipValidator());
        document.addValidator(new BankAccountNumberValidator());
        document.addValidator(new DateOfBirthValidator());
        document.addValidator(new GenderValidator());

        // Validate loan application
        document.validate();
    }
}