package week4_lab;

import java.util.Scanner;

public class Selection2 {

	public static void main(String[] args) {
		// Accept a number (1-7) and print weekday name
		// dcalre
		int num1 = 0;

		// input
		while (true) {
			System.out.print("Enter any number (1-7) ");
			num1 = Integer.parseInt(new Scanner(System.in).nextLine());
			// process
			if (num1 == 1) {
				System.out.println("SUN");
				break;
			} else {
				System.out.println("Out of range");
			}
		}
	}

}
