package week3_lab;

public class Operators {

	public static void main(String[] args) {
		int num1, num2, num3;
		boolean result;
		
		num1=23;
		num2=13;
		num3=11;
		
		result = (num1 == num2);
		System.out.println(result);
		
		result = (num1 != num2);
		System.out.println(result);
		
		result = (num1 > num2);
		System.out.println(result);
		
		result = (num1 < num2);
		System.out.println(result);
		
		result = (num1 >= num2);
		System.out.println(result);
		
		result = (num1 <= num2);
		System.out.println(result);

		//Logical Operators
		result = (num1>=num2) && (num1>=num3); //and
		System.out.println(result);
		
		result = (num1>=num2) || (num1>=num3); //or
		System.out.println(result);
		
		result = ! false;						//not
		System.out.println(result);
		
		
		

	}

}
