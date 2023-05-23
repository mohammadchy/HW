package hw5Q2Constructor;

public class Computertest {

	public static void main(String[] args) {

		// When class has instantiated, and when object has created, Constructor is
		// Default Constructor Initialized
		Computer defaultComputer = new Computer();

		// Parameterized Constructor 03 initialized.
		// We can initialize parameters more than one time by creating different object.
		Computer customComputer = new Computer("Apple", "MacBook Air", "MacOS Mojave", 800.0, 'A', false);

		Computer thirdComputer = new Computer("Custom Brand", "Custom Model", "Custom OS", 1000.0, 'B', true);
	}
}
