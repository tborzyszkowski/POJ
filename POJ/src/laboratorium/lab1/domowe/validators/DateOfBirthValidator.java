package laboratorium.lab1.domowe.validators;

import laboratorium.lab1.domowe.Document;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateOfBirthValidator implements Validator {

    public Date getDateFromPesel(String pesel) {
        String dob = pesel.substring(0, 6);

        DateFormat format = new SimpleDateFormat("yyMMdd");
        Date date = null;

        try {
            date = format.parse(dob);
        } catch (ParseException e) {
            // log.info("Date parse problem", e);
        }

        return date;
    }

    public void validate(Document document) {
        if (document.getDateOfBirth().compareTo(getDateFromPesel(document.getPesel())) != 0) {
            throw new InvalidDataException("Date of Birth is invalid!");
        }
    }
}
