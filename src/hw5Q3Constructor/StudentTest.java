package hw5Q3Constructor;

public class StudentTest {

	public static void main(String[] args) {
		// When class has instantiated, and when object has created, Constructor is
		// Default Constructor Initialized
		Student defaultStudent = new Student();
		
		// Parameterized Constructor  initialized.
		// We can initialize parameters more than one time by creating different object
		Student stName = new Student("Rash", 3456767, 'M', true, 173.34f);

	}

}
