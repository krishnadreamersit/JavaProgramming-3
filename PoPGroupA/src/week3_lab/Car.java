package week3_lab;

// declare model as instance variable
// create default constructor
// create setter method
// create getter method

public class Car {
	String model; //instance variable
	
	//Default Constructor
	public Car() {
		this.model="XYZ";
	}
	
	//Parameterized Constructor
	public Car(String model) {
		this.model=model;
	}
	
	//Setter
	public void setModel(String model) {
		this.model=model;
	}
	
	//Getter
	public String getModel() {
		return this.model;
	}	
}
