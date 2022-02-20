package week3_lab.oop1;

public class CarTest {

	public static void main(String[] args) {
		Car obj1; //declare
		obj1 = new Car(); //memory allocation and initialization
		obj1.model="xyz"; //value assign
		obj1.color="red"; //value assign
		System.out.println(obj1.model+" "+obj1.color);//value access
	}
}
