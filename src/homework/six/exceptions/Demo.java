package homework.six.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) throws InvalidStudentDataException {

		try (Scanner sc = new Scanner(System.in)) {
			Student student = new Student();
			System.out.print("Please enter name: ");
			student.setName(sc.nextLine());
			System.out.print("Please enter last name: ");
			student.setLastName(sc.nextLine());
			System.out.print("Please enter age: ");
			student.setAge(sc.nextInt());
			System.out.print("Please enter gender, (true) for male gender or (false) for female gender: ");
			student.setIsFemale(sc.nextBoolean());
			
		} catch (InputMismatchException e) {
			throw new InvalidStudentDataException();

		} finally {
			System.out.println("...");
		}
	}
}
