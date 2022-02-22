package week4_lab;

import java.util.Scanner;

public class Selection4 {

	public static void main(String[] args) {
		int id;
		String name;
		double sub1, sub2, sub3;
		//input
		System.out.print("Enter id : ");
		id = Integer.parseInt(new Scanner(System.in).nextLine());
		System.out.print("Enter Name : ");
		name = new Scanner(System.in).nextLine();
		System.out.println("Enter Obtained Marks");
		System.out.print("SUB 1 : ");
		sub1 = Double.parseDouble(new Scanner(System.in).nextLine());
		System.out.print("SUB 2 : ");
		sub2 = Double.parseDouble(new Scanner(System.in).nextLine());
		System.out.print("SUB 3 : ");
		sub3 = Double.parseDouble(new Scanner(System.in).nextLine());
		//process
		Student s1=new Student(id, name, sub1, sub2, sub3);
		s1.calcTotal();
		s1.calcAverage();
		s1.calcResult();
		
		//output result
		System.out.println("Total "+s1.getTotal());
		System.out.println("Average "+s1.getAverage());
		System.out.println("Result "+s1.getResult());
	}

}
