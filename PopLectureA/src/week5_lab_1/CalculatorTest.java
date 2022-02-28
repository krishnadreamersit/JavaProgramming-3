package week5_lab_1;

import mylibrary.Calculator;
import mylibrary.MyCalculator;

public class CalculatorTest {

	public static void main(String[] args) {
		//Calculator as data type
		//MyCalculator as processor
		
		Calculator c1 = new Calculator(4,9);
		Calculator c2;
		MyCalculator mc = new MyCalculator();
		
		c2 = mc.add(c1);
		System.out.println(c2);		
		
		c2 = mc.sub(c1);
		System.out.println(c2);
		
		c2 = mc.prd(c1);
		System.out.println(c2);
		
		c2 = mc.div(c1);
		System.out.println(c2);
		
		c2 = mc.rem(c1);
		System.out.println(c2);
		
		c2 = mc.pow(c1);
		System.out.println(c2);
	}
}