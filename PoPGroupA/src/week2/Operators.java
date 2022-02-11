package week2;

public class Operators {

	public static void main(String[] args) {
		//1. Assignment Operator
		
		//simple assignment
		int num1; //decalre
		num1 = 5; //assign - simple assignment
		System.out.println(num1); //access
		
		//multiple assignment
		int num2, num3;
		num1 = num2 = num3 = 85; //multiple assignment
		System.out.println(num1); //access
		System.out.println(num2); //access
		System.out.println(num3); //access
				
		//short-hand assignment
		num1 = 0;
		System.out.println(num1); //0
		num1 = num1 + 1;		
		System.out.println(num1); //1
		num1 +=2; //num1 = num1 + 2
		System.out.println(num1); //3
		num1 += 3;
		System.out.println(num1); //?
		
		
		//2. Arithmetic operators
		num1 = 10;
		num2 = 3;
		
		num3 = num1 + num2; //Add
		System.out.println(num3); //13
		
		num3 = num1 - num2; //Sub
		System.out.println(num3); //7
		
		num3 = num1 * num2; //Prd
		System.out.println(num3); //30
		
		num3 = num1 / num2; //Div
		System.out.println(num3); //3
		
		num3 = num1 % num2; //Rem
		System.out.println(num3); //1
		
		num3 = (int) Math.pow(num1, num2); //Pow (double to int)
		System.out.println(num3); //1000
		
		num3 = (int) Math.sqrt(16); //SQRT (double to int)
		System.out.println(num3); //4
				
		//3. Relational operators
		// Compare two values and return boolean result
		
		boolean result;
		num1 = 13;
		num2 = 5;
		
		result = (num1 == num2) ;// num1 is equals to num2
		System.out.println(result);
		
		result = (num1 != num2) ;// num1 is not equals to num2
		System.out.println(result);
		
		result = (num1 > num2) ;// num1 is greater than num2
		System.out.println(result);
		
		result = (num2 > num1) ;// num2 is greater than num1
		System.out.println(result);
		
		result = (num1 < num2) ;// num1 is less than num2
		System.out.println(result);
		
		result = (num2 < num1) ;// num2 is less than num1
		System.out.println(result);
		
		result = (num1 >= num2) ;// num1 is greater than or equals to num2
		System.out.println(result);
		
		result = (num2 >= num1) ;// num2 is greater than or equals to num1
		System.out.println(result);
		
		result = (num1 <= num2) ;// num1 is less than or equals to num2
		System.out.println(result);
		
		result = (num2 <= num1) ;// num2 is less than or equals to num1
		System.out.println(result);
			
		//4. Logical operators
		num1 = 5;
		num2 = 3;
		num3 = 2;
		result = (num1>num2) && (num1>num3); //Logical AND operator
		//true && true -> true
		//true && false -> false
		//false && true -> false
		//false && false -> false
		System.out.println(result);
		
		num1 = 5;
		num2 = 3;
		num3 = 20;
		result = (num1>num2) || (num1>num3); //Logical OR operator
		//true || true -> true
		//true || false -> true
		//false || true -> true
		//false || false -> false		
		System.out.println(result);
		
		result = ! false; //Logical NOT operator
		//false -> true
		System.out.println(result);
		
		result = ! true;
		//true -> false
		System.out.println(result);
		
		//5. Other operators
		
	}

}
