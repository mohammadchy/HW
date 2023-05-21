package hw4JavaVariables;

//AboutMe is a class.
public class AboutMe {

	// Variables declared:
	public String name;
	public byte age;
	public short myWeight;
	public int myMonthlySalary;
	public long bankAccountBalance;
	public float myHeight;
	public double myGrade;
	public char sex;
	public boolean uscitizen;

	//Constructor declared below.
	public AboutMe() {
		System.out.println("This is all about us: ");
	}

	//Methd implimented below.
	//Method to print meaningful information.
	public void aboutMe() {
		System.out.println("\nName: " + name + "\nAge: " + age + "\nMy Weight: " + myWeight + "\nMonthly Salary is: "
				+ myMonthlySalary + "\nAccount Balance: " + bankAccountBalance + "\nMy Height: " + myHeight
				+ "\nMy Grade is: " + myGrade + "\nSex: " + sex + "\nU.S. Citizen: " + uscitizen);

	}
}
