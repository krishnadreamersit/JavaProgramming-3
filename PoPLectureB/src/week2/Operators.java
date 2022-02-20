package week2;

public class Operators {
	public static void main(String []args) {
		//Operators
		//1. Assignment Operator
		//2. Arithmetic Operator
		//3. Relational Operator
		//4. Logical Operators		
		
		//1.a. Simple Assignment Operator ( = )		
		//Example-1
		int num1 = 45; //45 Assign to num1
		int num2 = num1; // Value of num1 assign to num2		
		System.out.println(num1); //Access value
		System.out.println(num2); //Access value
		
		//1.b. Multiple Assignment Operator ( = ... = )		
		int num3, num4, num5;
		num3 = num4 = num5 = 87; //Multiple Assignment
		
		System.out.println(num3); //Access value
		System.out.println(num4); //Access value
		System.out.println(num5); //Access value
		
		//1.c. Short-hand assignment operator
		num3 = 10;
		//num3 = num3 + 3;
		num3+=3; //num3 = num3 + 3; //Short hand addition operator
		System.out.println(num3); //Access value						
		
		//+=, -=, *=, /=, %= 
		
		//2. Arithmetic Operator
		int num6, num7, num8;
		
		//2.a. SUM ( + )
		num6 = 9;
		num7 = 4;
		num8 = num6+num7;
		System.out.println(num8);
		
		//2.b. SUB ( - )
		num6 = 9;
		num7 = 4;
		num8 = num6-num7;
		System.out.println(num8);
		
		//2.c. PRD ( * )
		num6 = 9;
		num7 = 4;
		num8 = num6*num7;
		System.out.println(num8);
		
		//2.d. DIV ( / )
		//integer division
		num6 = 9;
		num7 = 4;
		num8 = num6/num7;
		System.out.println(num8);
		
		//float division
		//? HW
		
		//2.e. REM ( % )
		num6 = 9;
		num7 = 4;
		num8 = num6%num7; //integer division and remainder
		System.out.println(num8);
		
		//2.f. Power
		double num9;
		num6=2;
		num7=3;
		num9 = Math.pow(num6, num7); //2 power 3 (base, exponent)
		System.out.println(num9);
		
		//2.f. Square Root		
		num6=16;
		num9 = Math.sqrt(num6);
		System.out.println(num9);
		
		//3. Relational/Comparison Operator (==, !=, >, >=, <, <=)
		// Compares two values and return boolean (true/false) result
		int num10, num11;
		boolean result;
		num10 = 14;
		num11 = 14;
		result = (num10 == num11); //Equals
		System.out.println(result);
		
		result = (num10 != num11); //Not Equals
		System.out.println(result);
		
		result = (num10 > num11); //Greater than
		System.out.println(result);
		
		result = (num10 >= num11); //Greater than or equals to
		System.out.println(result);
		
		result = (num10 < num11); //Less than
		System.out.println(result);
		
		result = (num10 <= num11); //Less than or equals to
		System.out.println(result);
		
		//4. Logical Operators		
		//Compares more than two values 3>= and return boolean result

		//4.a. Logical AND (&&) Operator
		int num12, num13, num14;
		boolean result2;
		num12 = 8;
		num13 = 5;
		num14 = 3;
		result2 = (num12>num13) && (num12>num14);
		System.out.println(result2);
		
		//4.b. Logical OR (||) Operator				
		num12 = 8;
		num13 = 5;
		num14 = 3;
		result2 = (num12>num13) || (num12>num14);
		System.out.println(result2);
		
		//4.c. Logical Not Operator (!)
		// true -> false
		// false -> true
		result2 = true;
		result2 = ! result2;
		System.out.println(result2);
		
		
	}
}