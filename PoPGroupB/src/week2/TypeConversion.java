package week2;

//Type casting and type conversion
public class TypeConversion {
	public static void main(String []args) {
		//type casting
		// byte, short, int, long, float, double - Numeric types
		
		// byte -> short -> int -> long -> float -> double (Auto conversion) - Promotion 
		
		//declare
		byte bn;
		short sn;
		int in;
		long ln;
		float fn;
		double dn;
		
		//assign
		bn = 15; //15 assign to bn (variable)
		sn = bn; // accessing value of bn and assign to sn (auto conversion)
		in = sn;
		ln = in;
		fn = ln;
		dn = fn;
		
		System.out.println(dn);
		
		//Type casting - by force type conversion (double -> float -> long -> int -> short -> byte)
		dn = 123456789.987654321;
		//fn = dn; //Type mismatch: cannot convert from double to float
		fn = (float) dn; //double to float (type cast) - numeric to numeric conversion (type cast)
		System.out.println(fn);
		
		//float to int - type cast?
		fn = 456.789f; //456.789F;
		in = (int) fn;
		System.out.println(in);
		
		//Type Conversion		
		//String to Numeric		
		//Numeric to String
		
		//String to Numeric
		String str1 = "123456";
		int num1 = Integer.parseInt(str1); //String to Integer
		System.out.println(num1+678);
		
		//Numeric to String
		num1 = 897654321;
		str1 = Integer.toString(num1);
		System.out.println(str1);
		
		//string -> byte, short, int, long, float, double
		//byte, short, int, long, float, double -> String		
	}
}
