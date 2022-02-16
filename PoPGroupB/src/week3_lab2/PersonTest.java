package week3_lab2;

public class PersonTest {

	public static void main(String[] args) {
		Person obj1 = new Person();
		
		obj1.setID(1);
		obj1.setName("Sabin Shrestha");
		obj1.setAddress("Thankot");
		
		System.out.println(obj1.getID()+", "+obj1.getName()+", "+obj1.getAddress());
		obj1.setAddress("Thankot, Kathmandu");
		System.out.println(obj1.getID()+", "+obj1.getName()+", "+obj1.getAddress());
	}
}