package laboratorium.lab1.domowe.validators;

import laboratorium.lab1.domowe.Document;

public class FirstnameAndSurnameMinLengthValidator implements Validator {

    public void validate(Document document) {
        if (document.getFirstName().length() < 2) {
            throw new InvalidDataException("Firstname must be larger than 2 characters!");
        }

        if (document.getSurname().length() < 2) {
            throw new InvalidDataException("Surname must be larger than 2 characters!");
        }
    }
}
