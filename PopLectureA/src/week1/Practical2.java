package week1;

public class Practical2 {
	//main method
	public static void main(String []args) {
		//Identifier - User defined terms/word
		//Name of package, Name of Class, Name of method, 
		//Name of variable args
		
		int n1, n2, n3; //identifier n1, n2, n3 - user defined word
		//int - keyword - system defined word
		int N1, N2, N3; // case-sensitive - lower upper different letter 
		
		//Naming Conventions		
		//packagename 	//lower case
		//ClassName 	//Title Case
		//methodName 	//camel Case
		//variableName	//camel Case
		
		//Solution
		int firstNumber, secondNumber, thirdNumber;
		
		//Basic data types
		
		//1. boolean - true/false
		boolean result; //Variable Declare
		result = true; 	//Value Assign
		result = false; //Value Update/Edit
		System.out.println(result) ;// Value Access
		
		//2. char - 'A' (Character)
		char ch;
		ch='A';
		System.out.println(ch) ;// Value Access
				
		//3. byte - whole number (integer type)
		byte num1; //declare
		num1 = 1; //assign
		System.out.println(num1) ;// Value Access
		
		//4. short - whole number (integer type)
		short num2; //declare
		num2 = 12345; //assign
		System.out.println(num2) ;// Value Access
		
		//5. int - whole number (integer type)
		int num3; //declare
		num3 = 1234567; //assign
		System.out.println(num3) ;// Value Access
		
		//6. long - whole number (integer type)
		long num4; //declare
		num4 = 1234567910; //assign
		System.out.println(num4) ;// Value Access
		
		//7. float - decimal number (floating point number)
		float num5; //declare
		num5 = 12345.67910f; //12345.67910F; //assign
		System.out.println(num5) ;// Value Access
		
		//8. double - decimal number (floating point number)
		double num6; //declare
		num6 = 12345.67910111213; //assign
		System.out.println(num6) ;// Value Access
		
		//9. String - collections of character
		String str1; //Declare
		str1 ="Patan College for Professional Studies"; //Assign
		System.out.println(str1) ;// Value Access		
		
		//Assignment Operator
		int myNum1; //Declare
		myNum1 = 34; //Assign
		System.out.println(myNum1); //Access
		
		myNum1 = 23+89;
		System.out.println(myNum1); //Access
		
		int n4, n5,n6;
		n4=n5=n6=9; // multiple assignment
		System.out.println(n4); //Access
		
	}
}