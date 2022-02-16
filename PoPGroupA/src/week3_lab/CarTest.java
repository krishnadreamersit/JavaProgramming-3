package week3_lab;

public class CarTest {

	public static void main(String[] args) {
		Car c1 = new Car(); //Call default constructor		
		c1.setModel("Toyota");
		System.out.println(c1.getModel());
		
		Car c2 = new Car("Tata"); //Call parameterized constructor
		System.out.println(c2.getModel());
	}
}