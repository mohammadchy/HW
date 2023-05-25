package hw4JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) {
		 
		AboutMe rash = new AboutMe();  //Constructor initialized.
		// Variables initialized below.
		rash.name = "Rash Chowdhury"; 
		rash.age = 127;
		rash.myWeight = 190;
		rash.myMonthlySalary = 50000;
		rash.bankAccountBalance = 80000000000l;
		rash.myHeight = 173.85f;
		rash.myGrade = 3.89999999999;
		rash.sex ='M';
		rash.uscitizen = false;
		
		//Method initialized.
		rash.aboutMe();
		System.out.println("\n-----------------------------------------------------------------------\n");
		
		//Instantiate AboutMe class for your best friend Alex.
		AboutMe alex = new AboutMe();
	    alex.name = "Alex";
		alex.age = 48;
		alex.myWeight = 350;
		alex.myMonthlySalary = 60000;
		alex.bankAccountBalance = 90000000000l;
		alex.myHeight = 110.85f;
		alex.myGrade = 2.89999999999;
		alex.sex ='M';
		alex.uscitizen = true;
		
		//Method initialized.
		alex.aboutMe();
		
	}
}
