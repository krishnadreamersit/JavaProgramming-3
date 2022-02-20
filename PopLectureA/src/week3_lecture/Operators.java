package week3_lecture;
//operators
public class Operators {

	public static void main(String[] args) {
		//1. Assignment Operator
		// simple assignment
		//a = 10
		//multiple assignment
		//a=b=c=20
		//shorthand assignment
		//a=10
		//a+=2
		//a=a+3
		
		//2. Arithmetic operators
		//a+b
		//a-b
		//a*b
		//a/b
		//a%b
		///Math.pow(a,b)
		//Math.sqrt(a)
		//byte, short, int, long, float, double, char, String
		
		//increment and decrement operator
		byte bn;
//		System.out.println(Byte.MAX_VALUE);
//		System.out.println(Byte.MIN_VALUE);
		
		bn=1;
		System.out.println(bn);
		bn++;
		System.out.println(bn);
		bn+=2; //bn = bn+2
		// post
		// pre
		bn=0;
		bn++; //post
		++bn; //pre
		System.out.println(bn); //2
		System.out.println(bn++); //3
		System.out.println(++bn); //4
		
		//3. Relational operator ==, !=, >, <, >= (Greater than or equals), <=
		boolean result ;// true/false
		result = (10 >= 10);
		//10 > 10 or 10==10
		//false	 or true	-> true
		//true or false		-> true
		//true	or true		-> true
		//false or false 	-> false
		System.out.println(result);
		result = (10 <= 10);
		System.out.println(result);
		
		//condition
		// returns true/false value
		// relational operators
		
		//4. Logical Operator
		//AND && 
		//OR  ||
		
		//NOT !
		
		// (condition1) && (condition2)
		// (condition1) || (condition2)
		// ! result
		
		//5. Other Operators
		//?:, ., (), {}, []
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
