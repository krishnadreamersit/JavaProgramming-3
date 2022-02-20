package week3_lab;

public class Operators {

	public static void main(String[] args) {
		//simple assignment
		boolean result;//decalre variable
		result = true; //assign true on result
		System.out.println(result);	//access
		
		//Task-1
		//declare a variable of char type
		char ch;
		//assign z on variable
		ch = 'z';
		//replace z by a
		ch ='a';
		//access the value of variable
		System.out.println(ch);
		
		//Task-2
		//Declare three variable of byte type
		byte num1, num2, num3;
		//assign 100 on all variables
		num1=num2=num3=100;
		//access the value of all variables
		System.out.println(num1+" "+num2+" "+num3);
		
		//Task-3
		// Declare three variable of Integer type
		int n1, n2, n3;
		
		// assign 12 and 5 on first two variables
		n1=12;
		n2=5;
		
		//3.1 add two number and assign to n3
		n3= n1+n2;
		//display the value of n3
		System.out.println("SUM : "+n3);
		
		//3.2 calculate difference and assign to n3
		//3.3 calculate product and assign to n3
		//3.4 calculate quotient  and assign to n3
		//3.5 calculate remainder and assign to n3
		//3.6 calculate power of n1 over n2 and assign to n3
		n3 = (int) Math.pow(n1, n2); //cast to int
		System.out.println("POW : "+n3);
		
		//3.7 calculate square root of n1 and assign to n3
		
		//Task-4
		//declare two variables of double type (10, 7)
		//declare one variable of boolean type (result2)
		
		double dnum1=10, dnum2=7;
		boolean result2;
		
		//4.1 compare two numeric variables and assign 
		//result on boolean variable and print
		result2 = (dnum1 == dnum2);
		System.out.println(result2);
		
		
		//Task-5
		int in1=13, in2=11, in3=10;
		boolean result3;
		result3 =( (in1 >in2) && (in1>in3) );
		System.out.println(result3);	
		
		result3 =( (in1 >in2) || (in1>in3) );
		System.out.println(result3);
		
		result3 = false;
		System.out.println(result3);
		result3 = ! result3;
		System.out.println(result3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
