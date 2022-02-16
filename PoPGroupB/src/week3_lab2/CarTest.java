package week3_lab2;

public class CarTest {

	public static void main(String[] args) {
		Car obj1;
		obj1 = new Car(); // new -> memory allocation, Car()-> Initialization
		
		// System.out.println(obj1.model); //direct access		
		System.out.println(obj1.getModel()); //indirect access
		
		// obj1.model="Toyota"; //direct assign
		
		obj1.setModel("Toyota");
		System.out.println(obj1.getModel()); //indirect access
		
	}
}