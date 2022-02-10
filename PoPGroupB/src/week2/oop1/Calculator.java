package week2.oop1;

public class Calculator {
	//Attributes
	double num1; //first no
	double num2; //second no
	double num3; //result
	
	//Bahaviours
	//add	
	public void add() {
		this.num3=this.num1+this.num2;
	}
	public void sub() {
		this.num3 = this.num1-this.num2;
	}
	public void prd() {
		this.num3 = this.num1*this.num2;
	}
	public void div() {
		this.num3 = this.num1/this.num2;
	}
	public void rem() {
		this.num3=this.num1%this.num2;
	}
	public void pow() {
		this.num3=Math.pow(this.num1, this.num2);
	}
}