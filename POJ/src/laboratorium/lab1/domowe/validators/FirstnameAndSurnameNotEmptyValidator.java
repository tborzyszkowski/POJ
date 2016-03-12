package laboratorium.lab1.domowe.validators;

import laboratorium.lab1.domowe.Document;

public class FirstnameAndSurnameNotEmptyValidator implements Validator {

    public void validate(Document document) {
        if (document.getFirstName().isEmpty()) {
            throw new InvalidDataException("Firstname cannot be empty");
        }

        if (document.getSurname().isEmpty()) {
            throw new InvalidDataException(("Surname cannot be empty"));
        }
    }
}
