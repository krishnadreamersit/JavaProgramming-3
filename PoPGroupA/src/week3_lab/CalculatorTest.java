package week3_lab;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		Calculator c2 = new Calculator(5, 6);
		
		c1.setNum1(8);
		c1.setNum2(7);
		c1.calcSum();
		System.out.println(c1.getNum3());
		
		c2.calcSum();
		System.out.println(c2.getNum3());
	}
}