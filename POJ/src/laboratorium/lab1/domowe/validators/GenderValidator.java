package laboratorium.lab1.domowe.validators;

import laboratorium.lab1.domowe.Document;
import laboratorium.lab1.domowe.Sex;

public class GenderValidator implements Validator {

    private String pesel;

    // odd - male
    // even - female
    public boolean isMale() {
        int gender = Character.getNumericValue(pesel.charAt(9));
        boolean isMale;

        if (gender % 2 == 0) {
            isMale = false;
        } else {
            isMale = true;
        }

        return isMale;
    }

    public void validate(Document document) {
        this.pesel = document.getPesel();

        if ((!isMale() && document.getGender() == Sex.MALE) || (isMale() && document.getGender() == Sex.FEMALE)) {
            throw new InvalidDataException("Invalid gender!");
        }
    }
}
