package week4_lecture;

public class Calculator {
	double num1;
	double num2;
	double num3;
	
	public Calculator() {
		this.num1=0;
		this.num2=0;
		this.num3=0;
	}
	public Calculator(double num1, double num2) {
		this.num1=num1;
		this.num2=num2;
		this.num3=0;
	}
	public void setNum1(double num1) {
		this.num1=num1;
	}
	public void setNum2(double num2) {
		this.num2=num2;
	}
	public void setNum3(double num3) {
		this.num3=num3;
	}
	public double getNum1() {
		return this.num1;
	}
	public double getNum2() {
		return this.num2;
	}
	public double getNum3() {
		return this.num3;
	}
	public void calcSum() {
		this.num3=this.num1+this.num2;
	}
}
