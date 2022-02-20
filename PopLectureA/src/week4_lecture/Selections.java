package week4_lecture;

public class Selections {

	public static void main(String[] args) {
		//1. Data Types
		//basic types (boolean, char, byte, short, int, long, float, double)
		//extended  (String)
		//Object type (Object)
		//User defined type (Class)
		
		//2. Variables (basic, extended, object, class)
		//Declare, Initialize, Assign, Update, Access
		
		//3. Operators
		//3.a Assignment
		//3.b Arithmetic
		//3.c Relational
		//3.d Logical
		//3.e Others
		
		//if statement
		/*
		int num1=1;//read value from user
		//num1 = Integer.parseInt(new Scanner(System.in).nextLine());
		boolean result=false;
		
		result = (num1 == 0);
		if(result==true) {
			System.out.println("True");
			System.out.println("Hello");
			System.out.println("Hi");
		}
		*/
		
		//if ... else statement
		/*
		int num2 = 0;
		if(num2 == 0) {
			System.out.println("Zero");
		}
		else {
			System.out.println("Other");
		}
		*/
		
		//else if.... Statement
		/*
		int num3=0;
		
		if(num3==0) {
			System.out.println("Zero");
		}
		else if(num3==1) {
			System.out.println("One");
		}
		else if(num3==2) {
			System.out.println("Two");
		}
		else {
			System.out.println("Others");
		}
		*/
		
		//if statement with multiple conditions
		/*
		int n1, n2, n3,max=0;
		n1=2;
		n2=3;
		n3=5;
		
		if((n1>n2)&&(n1>n3)){
			max=n1;
		}
		if((n2>n1)&& (n2>n3)) {
			max=n2;
		}
		if((n3>n1)&& (n3>n2)) {
			max=n3;
		}
		System.out.print(max);
		*/
		//Nested if
		
		//switch case
		int n4=0;
		switch(n4) {
			case 0:
				System.out.println("Zero");
				break;
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			case 4:
				System.out.println("Four");
				break;
			case 5:
				System.out.println("Five");
				break;
			case 6:
				System.out.println("Six");
				break;
			case 7:
				System.out.println("Seven");
				break;
			case 8:
				System.out.println("Eight");
				break;
			case 9:
				System.out.println("Nine");
				break;
			default:
				System.out.println("Others");	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
