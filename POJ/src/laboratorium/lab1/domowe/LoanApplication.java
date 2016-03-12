package laboratorium.lab1.domowe;

import laboratorium.lab1.domowe.validators.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LoanApplication implements Document {

    private List<Validator> validators = new ArrayList<>();

    private String firstName = "";
    private String surname = "";
    private String pesel = "";
    private String nip = "";
    private String bankAccountNumber = "";
    private Date dateOfBirth;
    private Sex gender;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public void addValidator(Validator validator) {
        validators.add(validator);
    }

    public void validate() {
        for (Validator validator : validators) {
            validator.validate(this);
        }

        System.out.println("Result: Entered information is OK!");
    }
}
