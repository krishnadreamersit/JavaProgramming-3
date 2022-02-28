package week5_lab_1;

import mylibrary.Calculator;
import mylibrary.MyCalculator;

public class CalculatorTest {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator(6,7);
		Calculator c2;
		MyCalculator mc = new MyCalculator();
		
		c2 = mc.calcSum(c1);
		System.out.println(c2);
		
		c2 = mc.calcSub(c1);
		System.out.println(c2);
		
		c2 = mc.calcPrd(c1);
		System.out.println(c2);
		
		c2 = mc.calcDiv(c1);
		System.out.println(c2);
		
		c2 = mc.calcRem(c1);
		System.out.println(c2);
		
		c2 = mc.calcPow(c1);
		System.out.println(c2);
	}
}