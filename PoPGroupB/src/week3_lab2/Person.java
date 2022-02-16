package week3_lab2;
// Create Person class with following attributes and behaviours
	// id, name, address instance variables
	// default constructor (0, "", "")
	// setter/getter methods for all instance variables
	// PersonTest class

public class Person {
	int id; //1. declare
	String name;
	String address;
	
	public Person() { //2. initializer
		this.id=0; //3. set default value
		this.name="";
		this.address="";
	}
	
	//4. setter
	public void setID(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	
	//5. getter
	public int getID() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public String getAddress() {
		return this.address;
	}
}