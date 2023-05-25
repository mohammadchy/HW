package hw3JavaVariable;

public class AboutMe {

	// Variable has declared- number 6
	public String name;

	// Variable has initialaized - number from 10-18
	public String name1 = "Rash Chowdhury";
	public byte age = 100;
	public short myWeight = 180;
	public int myMonthlySalary = 32650;
	public long bankAccountBalance = 100000000l;
	public float myHeight = 185f;
	public double myGrade = 2.292924247;
	public char sex = 'M';
	public boolean uscitizen = true;

	public static void main(String[] args) {
		AboutMe grandpa = new AboutMe();

		System.out.println("My Name is: " + grandpa.name1);
		System.out.println("My age is:" + grandpa.age + ", and My Weight: " + grandpa.myWeight);
		System.out.println("My height is:" + grandpa.myHeight + "\nMy Monthly Salary: " + grandpa.myMonthlySalary
				+ "\nusCitizen: " + grandpa.uscitizen);

	}

}
