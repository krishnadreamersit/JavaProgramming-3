package week3_lab;

public class Person {
	//1. Declare id as instance variable
	//2. Create default constructor
	//3. Create Parameterized constructor
	//4. Create setter method
	//5. Create getter method	
	
	int id; //1	
	String name;
	String address;
	
	public Person(){ //2
		this.id=0;
		this.name="";
		this.address="";
	}
	public Person(int id, String name, String address){ //3
		this.id=id;
		this.name=name;
		this.address=address;
	}
	public void setId(int id) {//4
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public String getAddress() {
		return this.address;
	}
}