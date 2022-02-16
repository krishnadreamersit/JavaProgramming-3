package week3_lab2;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator c1 = new Calculator(); //object declare and initialize
		c1.setNum1(23); // set value
		c1.setNum2(3); // set value
		c1.calcSum();  // process value
		System.out.println(c1.getNum3()); //get value
	}
}