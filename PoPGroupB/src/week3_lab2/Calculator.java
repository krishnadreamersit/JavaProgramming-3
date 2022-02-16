package week3_lab2;

public class Calculator {
	//Instance variable
	int num1;
	int num2;
	int num3;
	
	//Default Constructor
	public Calculator() {
		this.num1=0;
		this.num2=0;
		this.num3=0;
	}
	
	//Setters
	public void setNum1(int num1) {
		this.num1=num1;
	}
	public void setNum2(int num2) {
		this.num2=num2;
	}
	public void setNum3(int num3) {
		this.num3=num3;
	}
	
	//Getters	
	public int getNum1() {
		return this.num1;
	}
	public int getNum2() {
		return this.num2;
	}
	public int getNum3() {
		return this.num3;
	}
	
	//Processing Method
	public void calcSum() {
		this.num3=this.num1+this.num2;
	}
}