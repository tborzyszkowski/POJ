package laboratorium.lab1.domowe;

import laboratorium.lab1.domowe.validators.Validator;

import java.util.Date;

public interface Document {
    String getFirstName();
    String getSurname();
    String getPesel();
    String getNip();
    String getBankAccountNumber();
    Date getDateOfBirth();
    Sex getGender();

    void addValidator(Validator validator);
    void validate();
}
