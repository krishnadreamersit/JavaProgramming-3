package mylibrary;

//Class as Data Type
public class Person {
	int pid;
	String name;
	//constructors
	//setters and getters
	//toString
	public Person() {
		this.pid = 0;
		this.name = "";
	}
	public Person(int pid, String name) {
		this.pid = pid;
		this.name = name;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + "]";
	}
}