package laboratorium.lab1.domowe.validators;

import org.apache.commons.validator.routines.checkdigit.IBANCheckDigit;
import laboratorium.lab1.domowe.Document;

public class BankAccountNumberValidator implements Validator {

    public void validate(Document document) {
        IBANCheckDigit ibanValidator = new IBANCheckDigit();
        boolean isBankAccountNumberValid = ibanValidator.isValid(document.getBankAccountNumber());

        if (!isBankAccountNumberValid) {
            throw new InvalidDataException("Invalid Bank Account Number!");
        }
    }

}
