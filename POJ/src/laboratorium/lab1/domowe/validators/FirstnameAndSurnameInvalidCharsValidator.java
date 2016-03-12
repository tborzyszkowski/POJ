package laboratorium.lab1.domowe.validators;

import laboratorium.lab1.domowe.Document;

public class FirstnameAndSurnameInvalidCharsValidator implements Validator {

    public void validate(Document document) {
        String digitPattern = ".*\\d+.*";
        String asciiPattern = ".*[^a-ząćęłńóśźż-].*";

        if (document.getFirstName().matches(digitPattern)) {
            throw new InvalidDataException("Firstname cannot contain numbers!");
        }

        if (document.getFirstName().toLowerCase().matches(asciiPattern)) {
            throw new InvalidDataException("Firstname cannot contain special characters!");
        }

        if (document.getSurname().matches(digitPattern)) {
            throw new InvalidDataException("Surname cannot contain numbers!");
        }

        if (document.getSurname().toLowerCase().matches(asciiPattern)) {
            throw new InvalidDataException("Surname cannot contain special characters!");
        }
    }
}
