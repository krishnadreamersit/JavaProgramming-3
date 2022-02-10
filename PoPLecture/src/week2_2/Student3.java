package week2_2;

public class Student3 {
	
	public static void main(String []args) {
		//Declare variable
		String title, fullname, grade;
		char section;
		int id, sub1, sub2, sub3;
		int total, average; //calculate		
		
		//Value Assign
		title="Student Info";
		id=1;
		fullname="Your name";
		grade="Your Gade";
		section='A';
		sub1=92;
		sub2=98;
		sub3=88;
		
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
