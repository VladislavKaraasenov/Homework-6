package homework.six.exceptions;

public class Student {

	private int age;
	private boolean isFemale;
	private String name;
	private String lastName;

	public Student() {

	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) throws InvalidStudentDataException {
		if (age < 7 || age > 18) {
			throw new InvalidStudentDataException();
		}
		this.age = age;
	}

	public boolean getIsFemale() {
		return this.isFemale;
	}

	public void setIsFemale(boolean isFemale) throws InvalidStudentDataException {
		if (isFemale != true && isFemale != false) {
			throw new InvalidStudentDataException();
		}
		this.isFemale = isFemale;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) throws InvalidStudentDataException {
		if (name.length() > 12) {
			throw new InvalidStudentDataException();
		}
		this.name = name;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) throws InvalidStudentDataException {
		if (lastName.length() > 20) {
			throw new InvalidStudentDataException();
		}
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return this.name + ", " + this.lastName + ", " + this.isFemale + ", " + this.age;
	}

}
