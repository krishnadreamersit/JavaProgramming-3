package week2.oop1;
import java.awt.Color;

public class CarTest {
	public static void main(String []args) {
		Car car1 ;//Declare an object
		Car car2 ;
		
		car1 = new Car(); //Memory allocate //Initialize an object
		car2 = new Car();
		
		//Access/Set Attribute car1
		car1.model="Toyota";
		car1.color=Color.red;
		car1.numPassengers=5;
		car1.amountOfGas=25;
		
		//Access/Set Attribute car2
		car2.model="Hyundai";
		car2.color=Color.gray;
		car2.numPassengers=4;
		car2.amountOfGas=30;
		
		System.out.println(car1.model+", "+car1.color);
		System.out.println(car2.model+", "+car2.color);
		
	}
}
