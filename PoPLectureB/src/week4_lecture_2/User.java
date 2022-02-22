package week4_lecture_2;

public class User {
	String user;
	String password;
	public User() {
		this.user="";
		this.password="";
	}
	public User(String user, String password) {
		this.user=user;
		this.password=password;
	}
	//getter
	public String getUser() {
		return this.user;
	}
	public String getPassword() {
		return this.password;
	}
	//setter
	public void setUser(String user) {
		this.user=user;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	public void doLogin() {
		if((this.user=="admin") && (this.password=="admin")) {
			System.out.println("TRUE");
		}
		else {
			System.out.println("FALSE");
		}
	}
}
