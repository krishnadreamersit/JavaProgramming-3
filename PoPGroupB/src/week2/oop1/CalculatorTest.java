package week2.oop1;

public class CalculatorTest {
	public static void main(String []args) {
		Calculator calc1; //Declare
		calc1 = new Calculator(); //Initialize
		calc1.num1=9; 	//Assign
		calc1.num2=6; 	//Assign
		calc1.add(); 	//Add
		System.out.println(calc1.num3); //Access		
		
		calc1.num1=18; 	//Assign
		calc1.num2=7; 	//Assign
		calc1.add(); 	//Add
		System.out.println(calc1.num3); //Access
		
		calc1.num1=4; 	//Assign
		calc1.num2=6; 	//Assign
		calc1.add(); 	//Add
		System.out.println(calc1.num3); //Access
		
		calc1.num1=13; 	//Assign
		calc1.num2=7; 	//Assign
		calc1.sub(); 	//sub
		System.out.println(calc1.num3); //Access
		
		calc1.num1=5; 	//Assign
		calc1.num2=2; 	//Assign
		calc1.prd(); 	//prd
		System.out.println(calc1.num3); //Access
		
		calc1.num1=15; 	//Assign
		calc1.num2=2; 	//Assign
		calc1.div(); 	//div
		System.out.println(calc1.num3); //Access
		
		calc1.num1=15; 	//Assign
		calc1.num2=2; 	//Assign
		calc1.rem(); 	//Rem
		System.out.println(calc1.num3); //Access
		
		calc1.num1=2; 	//Assign
		calc1.num2=5; 	//Assign
		calc1.pow(); 	//Power
		System.out.println(calc1.num3); //Access		
	}
}