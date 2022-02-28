package week5_lab_1;

import java.util.Scanner;

public class ArrayBasics2 {

	public static void main(String[] args) {
		// declare and initialize
		final int MAX = 5;
		int nums[]= new int[MAX];	
		int sum=0, avg=0;
		
		// input
		for(int i=0; i<MAX; i++) {
			System.out.print("Enter any number : ");
			nums[i] = Integer.parseInt(new Scanner(System.in).nextLine());
		}
		// process		
		for(int i=0; i<MAX; i++) {
			sum+=nums[i];	
		}
		
		avg = sum/MAX;
		
		// output
		for(int i=0; i<MAX; i++) {
			System.out.println(nums[i]);			
		}
		System.out.println(sum);
		System.out.println(avg);
		
		//HW-2 - array
		//- find max value
		//- find min value
		//- search value
		//- ascending
		//- descending
		
	}
}