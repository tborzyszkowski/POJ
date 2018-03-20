package laboratorium.lab3.loan;

import java.util.Date;
import java.util.regex.*;

public class Applicant {
	private String firstName;
	private String surName;
	private String pesel;
	private String nip;
	private String bankAccountNumber;
	private String gender;
	private Date dateOfBirth;
	
	public Applicant() {}
	
	public Applicant(String firstName, String surName, String pesel, String nip, String bankAccountNumber,
			String gender, Date dateOfBirth) {
		this.firstName = firstName;
		this.surName = surName;
		this.pesel = pesel;
		this.nip = nip;
		this.bankAccountNumber = bankAccountNumber;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
	}

	private boolean checkFirstName(String firstName) {
		if(firstName == null)
			return false;
		else if(firstName.length() < 2) 
			return false;
		else if (! validatePattern(firstName, "^[a-zA-Z]*$"))
			return false;
		else 
			return true;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if (checkFirstName(firstName))
			this.firstName = firstName;
		else
			System.out.println("First Name Error:" + firstName);
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
	@Override
	public String toString() {
		return "Applicant [firstName=" + firstName + ", surName=" + surName + ", pesel=" + pesel + ", nip=" + nip
				+ ", bankAccountNumber=" + bankAccountNumber + ", gender=" + gender + ", dateOfBirth=" + dateOfBirth
				+ "]";
	}

	static private boolean validatePattern(String valData, String patternString) {

		Pattern pattern = Pattern.compile(patternString);
		Matcher matcher = pattern.matcher(valData);
		if(!matcher.matches())
			return false;
		else
			return true;
	}
}
