package week5_lab_1;

import java.util.Scanner;

public class ArrayBasic {

	public static void main(String[] args) {
		final int MAX = 5; //final -> read only variable
		int nums [] = new int [MAX]; //declare and initialize
		int sum=0, avg=0;
		
		//read values
		for(int i=0; i<MAX; i++) {
			System.out.print("Enter value ");
			nums[i] = Integer.parseInt(new Scanner(System.in).nextLine());	
		}
		
		//Processing

		//calculate sum
		for(int i=0; i<MAX; i++) {
			sum+=nums[i];
		}
		
		//calculate average
		avg=sum/MAX;
		
		//display values
		for(int i=0; i<MAX; i++) {
			System.out.println(nums[i]);			
		}
		System.out.println(sum);
		System.out.println(avg);
	}
}