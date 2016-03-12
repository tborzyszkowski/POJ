package laboratorium.lab1.domowe.validators;

import laboratorium.lab1.domowe.Document;

public class NipValidator implements Validator {

    public boolean isNipValid(String nip) {
        int nsize = nip.length();

        if (nsize != 10) {
            return false;
        }

        int[] weights = { 6, 5, 7, 2, 3, 4, 5, 6, 7 };
        int j = 0, sum = 0, control = 0;
        int csum = Integer.valueOf(nip.substring(nsize - 1));

        for (int i = 0; i < nsize - 1; i++) {
            char c = nip.charAt(i);
            j = Integer.valueOf(String.valueOf(c));
            sum += j * weights[i];
        }

        control = sum % 11;

        return (control == csum);
    }

    public void validate(Document document) {
        if (!isNipValid(document.getNip())) {
            throw new InvalidDataException("Invalid NIP!");
        }
    }
}
