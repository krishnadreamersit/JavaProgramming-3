package week2_2;

import java.util.Scanner; //Read value from keyboard

public class Student4 {
	
	public static void main(String []args) {
		//Declare variable
		String title, fullname, grade;
		char section;
		int id, sub1, sub2, sub3;
		int total, average; //calculate		
		
		//Value Assign
		title="Student Info";
		
		System.out.print("Enter ID : "); //prompt for user
		id=Integer.parseInt(new Scanner(System.in).nextLine()); //Read integer value from keyboard
		
		System.out.print("Enter Fullname : "); //prompt for user
		fullname=new Scanner(System.in).nextLine(); //Read String from keyboard
		
		System.out.print("Enter Grade : ");
		grade=new Scanner(System.in).nextLine();
		
		System.out.print("Enter Section : ");
		section=new Scanner(System.in).nextLine().charAt(0);
		
		System.out.println("Enter Obtain Marks: ");		
		System.out.print("English : ");
		sub1=Integer.parseInt(new Scanner(System.in).nextLine());
		
		System.out.print("Maths : ");
		sub2=Integer.parseInt(new Scanner(System.in).nextLine());
		
		System.out.print("Science : ");
		sub3=Integer.parseInt(new Scanner(System.in).nextLine());
				
		//calculate
		total = sub1 + sub2 + sub3;
		average = total/3;
		
		// Access Value
		System.out.println(title);		
		System.out.println("ID : "+id);
		System.out.println("NAME : "+fullname);
		System.out.println("GRADE : "+grade);
		System.out.println("SECTION : "+section);
		System.out.println("ENGLISH : "+sub1);
		System.out.println("MATH : "+sub2);
		System.out.println("SCIENCE : "+sub3);
		
		System.out.println("TOTAL : "+total);
		System.out.println("AVERAGE : "+average);		
	}
}
