package week4_lab;

public class Student {
	int id;
	String name;
	double sub1;
	double sub2;
	double sub3;
	double total;
	double average;
	String result;

	//default constructor
	public Student() {
		this.id=0;
		this.name="";
		this.sub1=0.0;
		this.sub2=0.0;
		this.sub3=0.0;
		this.total=0.0;
		this.average=0.0;
		this.result="";
	}
	
	//Parameterized Constructor
	public Student(int id, String name, double sub1, 
			double sub2, double sub3) {
		this.id=id;
		this.name=name;
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
		this.total=0.0;
		this.average=0.0;
		this.result="";
	}
	
	//setters
	public void setID(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setSub1(double sub1) {
		this.sub1=sub1;
	}
	public void setSub2(double sub2) {
		this.sub2=sub2;
	}
	public void setSub3(double sub3) {
		this.sub3=sub3;
	}
	//getters
	public int getID() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public double getSub1() {
		return this.sub1;
	}
	public double getSub2() {
		return this.sub2;
	}
	public double getSub3() {
		return this.sub3;
	}
	public double getTotal() {
		return this.total;
	}
	public double getAverage() {
		return this.average;
	}
	public String getResult() {
		return this.result;
	}
	//process
	public void calcTotal() {
		this.total=this.sub1+this.sub2+this.sub3;
	}
	public void calcAverage() {
		calcTotal();
		this.average=this.total/3;
	}
	public void calcResult() {
		if((this.sub1>=Global.PM) && 
				(this.sub2>=Global.PM) && 
				(this.sub3>=Global.PM)) {
			this.result="PASS";
		}
		else {
			this.result="FAIL";
		}
	}
}
