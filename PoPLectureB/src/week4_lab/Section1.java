package week4_lab;
import java.util.Scanner;
public class Section1 {
	public static void main(String[] args) {
		double num1;
		System.out.print("Enter any number : ");
		num1 = Double.parseDouble(new Scanner(System.in).nextLine());
		System.out.println("Your number is : "+num1);
		
		//if statement
		if(num1==10) {
			System.out.println("Ten");
		}
		//if ! statement
		if(!(num1 == 10)) {
			System.out.println("Others");
		}
	}
}
