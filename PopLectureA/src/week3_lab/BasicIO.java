package week3_lab;

import java.util.Scanner;

public class BasicIO {
	public static void main(String []args) {
		//declare variable
		String str1;
		
		//i-input from keyboard
		System.out.print("Enter any value :");
		str1 = new Scanner(System.in).nextLine();
		
		//o-output on screen
		System.out.println("Str1 "+str1);
		
		
	}
}
