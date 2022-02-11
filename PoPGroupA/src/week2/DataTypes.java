package week2;

public class DataTypes {

	public static void main(String[] args) {
		//basic types - 8 types (boolean, char, byte, short, int, long, float, double)
		
		//whole number (byte, short, int, long) 123 (same type; but different ranges)
		//decimal number (float, double) 123.456
		
		//extended types - 1 (String)
		
		//Variable Declare
		byte bn, bn1; //declare
		bn = 9; //assign value
		bn=10; //update value
		System.out.println(bn); //access value
		bn1 = bn; //assign value from bn (access value)
		System.out.println(bn1); //access value
		
		System.out.println(Byte.MAX_VALUE); //127
		System.out.println(Byte.MIN_VALUE);	//-128
		
		System.out.println(Short.MAX_VALUE); //32767
		System.out.println(Short.MIN_VALUE); //-32768
		
		System.out.println(Integer.MAX_VALUE); //2147483647
		System.out.println(Integer.MIN_VALUE); //-2147483648
		
		System.out.println(Long.MAX_VALUE); //9223372036854775807
		System.out.println(Long.MIN_VALUE); //-9223372036854775808
	}

}
