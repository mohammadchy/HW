package hw5Q2Constructor;

public class Computer {
	// variables are declared.
	public String brand;
	public String model;
	public String operatingSystem;
	public double price;
	public char grade;
	public boolean madeInUSA;
	
	// default Constructor declared.
	public Computer() {
		System.out.println("This is from the default Constructor of Computer class.");
	}

	// Parameterized Constructor  declared.
	public Computer(String brand, String model, String operatingSystem, double price, char grade, boolean madeInUSA) {
     this.brand = brand;
     this.model = model;
     this.operatingSystem = operatingSystem;
     this.price = price;
     this.grade = grade;
     this.madeInUSA = madeInUSA;
     System.out.println("My Brand: " + brand +
             ", \nModel: " + model +
             ", \nOperating system: " + operatingSystem +
             ", \nPrice: $" + price +
             ", \nGrade: " + grade +
             ", \nand Made in the USA? Ans: " + madeInUSA);
 }
	
	
	}
