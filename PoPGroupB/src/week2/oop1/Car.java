package week2.oop1;

import java.awt.Color;

public class Car {
	//Attribute of class // Class Variable
	String model;
	Color color;
	int numPassengers;
	double amountOfGas;	
	
	//Behaviours //Method	
	//Add/remove a passenger
	public void addPassenger(int passengers) {
		this.numPassengers=this.numPassengers+passengers;
	}
	
	public void removePassenger(int passengers) {
		this.numPassengers=this.numPassengers-passengers;	
	}
	
	// Get the tank filled
	public void tankFill(double amountOfGas) {
		this.amountOfGas=this.amountOfGas+amountOfGas;
	}
	
	// Report amount of gas
	public void getAmountOfGas() {
		System.out.println(this.amountOfGas);
	}
}