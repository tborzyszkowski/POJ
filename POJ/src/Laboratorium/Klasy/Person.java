package Laboratorium.Klasy;

import java.time.LocalDate;

public class Person {
	private String fstName;
	private String sndName;
	private int yearOfBirth;

	public Person(String fstName, String sndName, int yearOfBirth) {
		this.fstName = fstName;
		this.sndName = sndName;
		this.yearOfBirth = yearOfBirth;
	}

	public String getFstName() {
		return fstName;
	}

	public void setFstName(String fstName) {
		this.fstName = fstName;
	}

	public String getSndName() {
		return sndName;
	}

	public void setSndName(String sndName) {
		this.sndName = sndName;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		if(checkYear(yearOfBirth))
			this.yearOfBirth = yearOfBirth;
	}

	private boolean checkYear(int year) {
		return (1990 <= year) && (year <= 2020);
	}

	@Override
	public String toString() {
		return "Person{" +
				"fstName='" + fstName + '\'' +
				", sndName='" + sndName + '\'' +
				", yearOfBirth=" + yearOfBirth +
				'}';
	}

	public int getAge() {
		LocalDate currDate = LocalDate.now();
		return currDate.getYear() - this.yearOfBirth;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Person)) return false;

		Person person = (Person) o;

		if (yearOfBirth != person.yearOfBirth) return false;
		if (fstName != null ? !fstName.equals(person.fstName) : person.fstName != null) return false;
		return sndName != null ? sndName.equals(person.sndName) : person.sndName == null;
	}

	@Override
	public int hashCode() {
		int result = fstName != null ? fstName.hashCode() : 0;
		result = 31 * result + (sndName != null ? sndName.hashCode() : 0);
		result = 31 * result + yearOfBirth;
		return result;
	}
}
