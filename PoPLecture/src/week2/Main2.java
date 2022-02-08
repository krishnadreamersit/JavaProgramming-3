package week2;

class Class1 {
	// Class is a collection of Variable(s) and Method(s)	
	// Variable (s) - Store value
	// Method (s) - User defined process (codes used to perform specific task)	

	//Variable
	int num1=9; //Declare and Initialize 	
	
	//Method
	public void f1() {
		System.out.println(num1); //print value of num1 i.e. 
		int result = 9*2/4%2*3;
	}
}

public class Main2 {
	public static void main(String []args) {
		//How to use existing class (variable and method)
		//By creating an object of existing class
		//we can consume the resources of existing class by object of that class
		
		//How to declare an object of class
		//ClassName object_name = new ClassName()
		int n1; //boolean, char, byte, short, int, long, float, double (bt)
		//n1 is variable
		//auto initialize		
		
		Class1 obj1; //Declare an object of Class
		//obj1 is object; because Class1 is a Class		
		obj1 = new Class1(); // Initialize - memory allocation to an object
		
		//variable of class
		obj1.num1=100 ;//access the variable of Class1 (update)
		System.out.println(obj1.num1);//access
		
		//method of class
		obj1.f1(); //call method of class through an object of that class		
	}
}
