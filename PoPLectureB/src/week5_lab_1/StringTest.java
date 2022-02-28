package week5_lab_1;

public class StringTest {

	public static void main(String[] args) {
		
		//basic type (boolean, char, byte, short, int, long, float, double)
		int x; //declare variable of int type
		
		//Extended type - Class type
		//System defined class
		//Own class of Java
		//Auto Import
		//instance variables, constructors, setters, getters, process methods
		
		String str1 = new String();		
		//String(byte [] bytes)
		byte nums[]=new byte[5]; //numeric (range  127)
		nums[0]=65;
		nums[1]=68;
		nums[2]=97;
		nums[3]=100;
		nums[4]=70;
		String str2 = new String(nums); //ASCII to Char
		System.out.println(str2);
		
		//Methods

		// char charAt(int index)
		//Name: charAt
		//Parameter: int
		//Return Type: char		
		// String str3 = "Patan College for Professional Studies"; //38 Characters (0 to 38-1)
		// char ch = str3.charAt(10);
		// System.out.println(ch);
		
		//int compareTo(String anotherString)
		//Name: compareTo
		//Parameter: String
		//Return Type: int	
		String str4 = "abc";
		String str5 = "abc";
		int result = str4.compareTo(str5);
		System.out.println(result); //-1 not equals, 1 not equals, 0 equals
		
		//Accept two values (string) from user and print result of compareTo.
		
		
		
	}
}