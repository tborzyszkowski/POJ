package laboratorium.lab1.domowe.validators;

import laboratorium.lab1.domowe.Document;

public class PeselValidator implements Validator {

    public boolean isPeselValid(String pesel) {
        int psize = pesel.length();

        if (psize != 11) {
            return false;
        }

        int j = 0, sum = 0, control = 0;
        int[] weights = { 1, 3, 7, 9, 1, 3, 7, 9, 1, 3 };
        int csum = Integer.valueOf(pesel.substring(psize - 1));

        for (int i = 0; i < psize - 1; i++) {
            char c = pesel.charAt(i);
            j = Integer.valueOf(String.valueOf(c));
            sum += j * weights[i];
        }

        control = 10 - (sum % 10);

        if (control == 10) {
            control = 0;
        }

        return (control == csum);
    }

    public void validate(Document document) {

        if (!isPeselValid(document.getPesel())) {
            throw new InvalidDataException("Invalid PESEL!");
        }
    }
}
