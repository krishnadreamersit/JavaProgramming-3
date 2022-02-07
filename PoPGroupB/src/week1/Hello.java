package week1;

class Hello {
	
	//main method	
	public static void main(String []args) {
		System.out.println("Hello world of java");
		
		//print the following info
		//your rollno
		//your name
		//your class
		//your title of subject-1
		//your title of subject-2
		//your title of subject-3
		
		System.out.println("ID : 1");
		System.out.println("NAME : Krishna");
			
		//variable declare
		int num1, num2, num3;
		
		//value assign
		num1 = 45;
		num2 = 32;
		
		//calculate sum
		num3 = num1 * num2;
		
		//print result
		System.out.println("Result : "+num3);
		
		//''
		//System.out.println("Result : "+num4);
		
		//1. Syntax Error - Grammar 
		//2. Runtime Error - Uncertain		
		//3. Logical Error - Output (Result)
		
		//Identifiers
		//week1-package, Hello-class, num1-variable, num2-variable, num3-varaible //identifiers
	
		//Predefined words in java
		//package, class, public, static, void, String - Keywords
		
		//Data types
		
		//1. boolean - true/false
		boolean result; //type of result is boolean
		result = false;
		System.out.println(result);
		
		//2. char - single character
		char ch; //type of ch is char
		ch ='A';
		System.out.println(ch);
		
		//3. byte - whole number (integer number)
		byte n1;
		n1=123;
		System.out.println(n1);
		
		//4. short - whole number (integer number)
		short n2;
		n2 = 9877;
		System.out.println(n2);
		
		//5. int - whole number (integer number)
		int n3;
		n3 = 75678;
		System.out.println(n3);
		
		//6. long - whole number (integer number)
		long n4;
		n4 = 975678;
		System.out.println(n4);
		
		//7. float - decimal numbers (fractional values)
		float n5;
		n5 = 123.456f; //f indicate float
		System.out.println(n5);
		
		//8. double - decimal number (fractional values)
		double n6;
		n6 = 12345678.456789;
		System.out.println(n6);
		
		//9. String - collection of characters
		String str1;
		str1 = "Kathmandu, Nepal";
		System.out.println(str1);								
		
		//variable initialize
		int n7 = 9; //declare and initialize
		System.out.println(n7);
		
		//short hand assignment operator
		int n8 = 7;
		System.out.println(n8);
		
		n8 += 2; //n8 = n8 + 2
		System.out.println(n8);
		
		//Constants
		final int n9 = 100;
		//n9 = 199;
		System.out.println(n9);
		
		System.out.println(1+3-(8*4)/2);
		
	}
}